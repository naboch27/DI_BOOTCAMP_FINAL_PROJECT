package com.ada.ci.TCHENGA.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ada.ci.TCHENGA.models.PersonnelEntity;
import com.ada.ci.TCHENGA.service.PersonnelService;

@RestController
@RequestMapping("/public/api/v1/personnel")
public class PersonnelController {
	
	private final PersonnelService personnelService;

	public PersonnelController(PersonnelService personnelService) {
		super();
		this.personnelService = personnelService;
	}
	
	@GetMapping
	public List<PersonnelEntity> findAllJobs() {

		return personnelService.findAllPersonnel();
	}

	@GetMapping("/{id}")
	public ResponseEntity<PersonnelEntity> findById(@Validated @PathVariable("id") Integer id) {
		Optional<PersonnelEntity> personnel = personnelService.findById(id);

	    if (personnel.isPresent()) {
	      return ResponseEntity.ok().body(personnel.get());
	    } else {
	      return ResponseEntity.notFound().build();
	    }
	}

	@PostMapping
	public ResponseEntity<PersonnelEntity> savePersonnel(@Validated @RequestBody PersonnelEntity personnelEntity) {
		
		 return new ResponseEntity<>(personnelService.savePersonnel(personnelEntity), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<PersonnelEntity> updatePersonnel(@RequestBody PersonnelEntity personnelEntity) {

		return new ResponseEntity<>(personnelService.updatePersonnel(personnelEntity), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public void deletePersonnel(@Validated @PathVariable("id") Integer id) {
		personnelService.deletePersonnel(id);
	}



}
