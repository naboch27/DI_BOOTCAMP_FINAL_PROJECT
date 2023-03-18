package com.ada.ci.TCHENGA.controller;

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

import com.ada.ci.TCHENGA.models.AdminsEntity;
import com.ada.ci.TCHENGA.service.AdminsService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
@RequestMapping("/public/api/v1/admin")
public class AdminsController {
	
	private final AdminsService adminsService;

	public AdminsController(AdminsService adminsService) {
		super();
		this.adminsService = adminsService;
	}
	
	@GetMapping
	public List<AdminsEntity> findAllAdmins() {

		return adminsService.findAllAdmins();
	}

	@GetMapping("/{id}")
	public ResponseEntity<AdminsEntity> findById(@Validated @PathVariable("id") Integer id) {
		Optional<AdminsEntity> admins = adminsService.findById(id);

	    if (admins.isPresent()) {
	      return ResponseEntity.ok().body(admins.get());
	    } else {
	      return ResponseEntity.notFound().build();
	    }
	}

	@PostMapping
	public ResponseEntity<AdminsEntity> saveAdmins(@Validated @RequestBody AdminsEntity adminsEntity) {
		
		 return new ResponseEntity<>(adminsService.saveAdmins(adminsEntity), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<AdminsEntity> updateAdmins(@RequestBody AdminsEntity adminsEntity) {

		return new ResponseEntity<>(adminsService.updateAdmins(adminsEntity), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public void deleteAdmins(@Validated @PathVariable("id") Integer id) {
		adminsService.deleteAdmins(id);
	}


}
