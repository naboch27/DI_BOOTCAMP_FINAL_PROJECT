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

import com.ada.ci.TCHENGA.models.RendezVousEntity;
import com.ada.ci.TCHENGA.service.RendezVousService;

@RestController

@RequestMapping("/public/api/v1/rendez_vous")
public class RendezVousController {
	
	private final RendezVousService rendezVousService;

	public RendezVousController(RendezVousService rendezVousService) {
		super();
		this.rendezVousService = rendezVousService;
	}
	
	@GetMapping
	public List<RendezVousEntity> findAllRendezVous() {

		return rendezVousService.findAllRendezVous();
	}

	@GetMapping("/{id}")
	public ResponseEntity<RendezVousEntity> findById(@Validated @PathVariable("id") Integer id) {
		Optional<RendezVousEntity> rendezVous = rendezVousService.findById(id);

	    if (rendezVous.isPresent()) {
	      return ResponseEntity.ok().body(rendezVous.get());
	    } else {
	      return ResponseEntity.notFound().build();
	    }
	}

	@PostMapping
	public ResponseEntity<RendezVousEntity> saveRendezVous(@Validated @RequestBody RendezVousEntity rendezVousEntity) {
		
		 return new ResponseEntity<>(rendezVousService.saveRendezVous(rendezVousEntity), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<RendezVousEntity> updateAdmins(@RequestBody RendezVousEntity rendezVousEntity) {

		return new ResponseEntity<>(rendezVousService.updateRendezVous(rendezVousEntity), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public void deleteRendezVous(@Validated @PathVariable("id") Integer id) {
		rendezVousService.deleteRendezVous(id);
	}



}
