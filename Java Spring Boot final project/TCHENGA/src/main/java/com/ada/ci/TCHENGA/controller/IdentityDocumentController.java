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
import com.ada.ci.TCHENGA.models.IdentityDocumentEntity;
import com.ada.ci.TCHENGA.service.IdentityDocumentService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
@RequestMapping("/public/api/v1/document")
public class IdentityDocumentController {
	
	private final IdentityDocumentService identityDocumentService;

	public IdentityDocumentController(IdentityDocumentService identityDocumentService) {
		super();
		this.identityDocumentService = identityDocumentService;
	}
	
	@GetMapping
	public List<IdentityDocumentEntity> findAllIdentityDocument() {

		return identityDocumentService.findAllIdentityDocument();
	}

	@GetMapping("/{id}")
	public ResponseEntity<IdentityDocumentEntity> findById(@Validated @PathVariable("id") Integer id) {
		Optional<IdentityDocumentEntity> identityDocument = identityDocumentService.findById(id);

	    if (identityDocument.isPresent()) {
	      return ResponseEntity.ok().body(identityDocument.get());
	    } else {
	      return ResponseEntity.notFound().build();
	    }
	}

	@PostMapping
	public ResponseEntity<IdentityDocumentEntity> saveIdentityDocument(@Validated @RequestBody IdentityDocumentEntity identityDocumentEntity) {
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");

		System.out.println("yyyy/MMMM/dd HH:mm:ss-> " + dtf3.format(LocalDateTime.now()));

		identityDocumentEntity.setCreateAtIdentityDocument(dtf3.format(LocalDateTime.now()));

		identityDocumentEntity.setUpdateAtIdentityDocument(dtf3.format(LocalDateTime.now()));
		
		 return new ResponseEntity<>(identityDocumentService.saveIdentityDocument(identityDocumentEntity), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<IdentityDocumentEntity> updateIdentityDocument(@RequestBody IdentityDocumentEntity identityDocumentEntity) {

		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");

		System.out.println("yyyy/MMMM/dd HH:mm:ss-> " + dtf3.format(LocalDateTime.now()));

		System.out.println(identityDocumentEntity.getCreateAtIdentityDocument());
		
		identityDocumentEntity.setCreateAtIdentityDocument(identityDocumentEntity.getCreateAtIdentityDocument());
		
		identityDocumentEntity.setUpdateAtIdentityDocument(dtf3.format(LocalDateTime.now()));
		
		return new ResponseEntity<>(identityDocumentService.updateIdentityDocument(identityDocumentEntity), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public void deleteIdentityDocument(@Validated @PathVariable("id") Integer id) {
		identityDocumentService.deleteIdentityDocument(id);
	}

	

}
