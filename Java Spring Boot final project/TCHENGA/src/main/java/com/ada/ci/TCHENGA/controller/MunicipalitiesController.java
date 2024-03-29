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

import com.ada.ci.TCHENGA.models.MunicipalitiesEntity;
import com.ada.ci.TCHENGA.service.MunicipalitiesService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
@RequestMapping("/public/api/v1/commune")
public class MunicipalitiesController {
	
	private final MunicipalitiesService municipalitiesService;

	public MunicipalitiesController(MunicipalitiesService municipalitiesService) {
		super();
		this.municipalitiesService = municipalitiesService;
	}
	
	@GetMapping
	public List<MunicipalitiesEntity> findAllmunicipalities() {

		return municipalitiesService.findAllMunicipalities();
	}

	@GetMapping("/{id}")
	public ResponseEntity<MunicipalitiesEntity> findById(@Validated @PathVariable("id") Integer id) {
		Optional<MunicipalitiesEntity> municipalities = municipalitiesService.findById(id);

	    if (municipalities.isPresent()) {
	      return ResponseEntity.ok().body(municipalities.get());
	    } else {
	      return ResponseEntity.notFound().build();
	    }
	}

	@PostMapping
	public ResponseEntity<MunicipalitiesEntity> saveMunicipalities(@Validated @RequestBody MunicipalitiesEntity municipalitiesEntity) {
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");

		System.out.println("yyyy/MMMM/dd HH:mm:ss-> " + dtf3.format(LocalDateTime.now()));

		municipalitiesEntity.setCreateAtMunicipalitie(dtf3.format(LocalDateTime.now()));

		municipalitiesEntity.setUpdateAtMunicipalitie(dtf3.format(LocalDateTime.now()));
		
		 return new ResponseEntity<>(municipalitiesService.saveMunicipalities(municipalitiesEntity), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<MunicipalitiesEntity> updateCity(@RequestBody MunicipalitiesEntity municipalitiesEntity) {

		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");

		System.out.println("yyyy/MMMM/dd HH:mm:ss-> " + dtf3.format(LocalDateTime.now()));

		System.out.println(municipalitiesEntity.getCreateAtMunicipalitie());
		
		municipalitiesEntity.setCreateAtMunicipalitie(municipalitiesEntity.getCreateAtMunicipalitie());
		
		municipalitiesEntity.setUpdateAtMunicipalitie(dtf3.format(LocalDateTime.now()));
		
		return new ResponseEntity<>(municipalitiesService.updateMunicipalities(municipalitiesEntity), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public void deleteMunicipalities(@Validated @PathVariable("id") Integer id) {
		municipalitiesService.deleteMunicipalities(id);
	}


}
