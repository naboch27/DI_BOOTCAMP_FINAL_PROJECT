package com.ada.ci.TCHENGA.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ada.ci.TCHENGA.models.CenterEntity;
import com.ada.ci.TCHENGA.service.CenterService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
@RequestMapping("/public/api/v1/center")
public class CenterController {
	
	private final CenterService centerService;

	public CenterController(CenterService centerService) {
		super();
		this.centerService = centerService;
	}
	
	@GetMapping
	public List<CenterEntity> findAllCenter() {

		return centerService.findAllCenter();
	}

	@GetMapping("/{id}")
	public ResponseEntity<CenterEntity> findById(@Validated @PathVariable("id") Integer id) {
		Optional<CenterEntity> city = centerService.findById(id);

	    if (city.isPresent()) {
	      return ResponseEntity.ok().body(city.get());
	    } else {
	      return ResponseEntity.notFound().build();
	    }
	}

	@PostMapping
	public ResponseEntity<CenterEntity> saveCenter(@Validated @RequestBody CenterEntity centerEntity) {
		
		 return new ResponseEntity<>(centerService.saveCenter(centerEntity), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<CenterEntity> updateCenter(@RequestBody CenterEntity centerEntity) {

		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");

		System.out.println("yyyy/MMMM/dd HH:mm:ss-> " + dtf3.format(LocalDateTime.now()));

		System.out.println(centerEntity.getCreateAtCenter());
		
		centerEntity.setCreateAtCenter(centerEntity.getCreateAtCenter());
		
		centerEntity.setUpdateAtCenter(dtf3.format(LocalDateTime.now()));
		
		return new ResponseEntity<>(centerService.updateCenter(centerEntity), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public void deleteCenter(@Validated @PathVariable("id") Integer id) {
		centerService.deleteCenter(id);
	}


}
