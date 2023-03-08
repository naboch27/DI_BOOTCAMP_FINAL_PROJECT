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

import com.ada.ci.TCHENGA.models.ConnectionEntity;
import com.ada.ci.TCHENGA.service.ConnectionService;

@RestController

@RequestMapping("/public/api/v1/connection")
public class ConnectionController {
	
	private final ConnectionService connectionService;

	public ConnectionController(ConnectionService connectionService) {
		super();
		this.connectionService = connectionService;
	}
	
	@GetMapping
	public List<ConnectionEntity> findAllConnection() {

		return connectionService.findAllConnection();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ConnectionEntity> findById(@Validated @PathVariable("id") Integer id) {
		Optional<ConnectionEntity> connection = connectionService.findById(id);

	    if (connection.isPresent()) {
	      return ResponseEntity.ok().body(connection.get());
	    } else {
	      return ResponseEntity.notFound().build();
	    }
	}

	@PostMapping
	public ResponseEntity<ConnectionEntity> saveAdmins(@Validated @RequestBody ConnectionEntity connectionEntity) {
		
		 return new ResponseEntity<>(connectionService.saveConnection(connectionEntity), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<ConnectionEntity> updateAdmins(@RequestBody ConnectionEntity connectionEntity) {

		return new ResponseEntity<>(connectionService.updateConnection(connectionEntity), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public void deleteConnection(@Validated @PathVariable("id") Integer id) {
		connectionService.deleteConnection(id);
	}



}
