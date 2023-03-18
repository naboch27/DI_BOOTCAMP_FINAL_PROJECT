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

import com.ada.ci.TCHENGA.models.DonorEntity;
import com.ada.ci.TCHENGA.service.DonorService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
@RequestMapping("/public/api/v1/donor")
public class DonorController {
	
	private final DonorService donorService;

	public DonorController(DonorService donorService) {
		super();
		this.donorService = donorService;
	}
	
	@GetMapping
	public List<DonorEntity> findAllDonor() {

		return donorService.findAllDonor();
	}

	@GetMapping("/{id}")
	public ResponseEntity<DonorEntity> findById(@Validated @PathVariable("id") Integer id) {
		Optional<DonorEntity> donor = donorService.findById(id);

	    if (donor.isPresent()) {
	      return ResponseEntity.ok().body(donor.get());
	    } else {
	      return ResponseEntity.notFound().build();
	    }
	}

	@PostMapping
	public ResponseEntity<DonorEntity> saveDonor(@Validated @RequestBody DonorEntity donorEntity) {
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");

		System.out.println("yyyy/MMMM/dd HH:mm:ss-> " + dtf3.format(LocalDateTime.now()));

		donorEntity.setCreateAtPerson(dtf3.format(LocalDateTime.now()));

		donorEntity.setUpdateAtPerson(dtf3.format(LocalDateTime.now()));
		
		 return new ResponseEntity<>(donorService.saveDonor(donorEntity), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<DonorEntity> updateDonor(@RequestBody DonorEntity donorEntity) {

		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");

		System.out.println("yyyy/MMMM/dd HH:mm:ss-> " + dtf3.format(LocalDateTime.now()));

		System.out.println(donorEntity.getCreateAtPerson());
		
		donorEntity.setCreateAtPerson(donorEntity.getCreateAtPerson());
		
		donorEntity.setUpdateAtPerson(dtf3.format(LocalDateTime.now()));
		
		return new ResponseEntity<>(donorService.updateDonor(donorEntity), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public void deleteDonor(@Validated @PathVariable("id") Integer id) {
		donorService.deleteDonor(id);
	}


}
