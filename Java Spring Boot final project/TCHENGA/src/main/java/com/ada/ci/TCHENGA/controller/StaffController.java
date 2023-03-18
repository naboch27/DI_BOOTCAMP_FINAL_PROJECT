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

import com.ada.ci.TCHENGA.models.StaffEntity;
import com.ada.ci.TCHENGA.service.StaffService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
@RequestMapping("/public/api/v1/staff")
public class StaffController {

	private final StaffService staffService;

	public StaffController(StaffService staffService) {
		super();
		this.staffService = staffService;
	}

	@GetMapping
	public List<StaffEntity> findAllJobs() {

		return staffService.findAllStaff();
	}

	@GetMapping("/{id}")
	public ResponseEntity<StaffEntity> findById(@Validated @PathVariable("id") Integer id) {
		Optional<StaffEntity> staff = staffService.findById(id);

		if (staff.isPresent()) {
			return ResponseEntity.ok().body(staff.get());
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping
	public ResponseEntity<StaffEntity> saveStaff(@Validated @RequestBody StaffEntity staffEntity) {

		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");

		System.out.println("yyyy/MMMM/dd HH:mm:ss-> " + dtf3.format(LocalDateTime.now()));

		staffEntity.setCreateAtPerson(dtf3.format(LocalDateTime.now()));

		staffEntity.setUpdateAtPerson(dtf3.format(LocalDateTime.now()));
		
		return new ResponseEntity<>(staffService.saveStaff(staffEntity), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<StaffEntity> updateStaff(@RequestBody StaffEntity staffEntity) {

		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");

		System.out.println("yyyy/MMMM/dd HH:mm:ss-> " + dtf3.format(LocalDateTime.now()));

		System.out.println(staffEntity.getCreateAtPerson());
		
		staffEntity.setCreateAtPerson(staffEntity.getCreateAtPerson());
		
		staffEntity.setUpdateAtPerson(dtf3.format(LocalDateTime.now()));
		
		return new ResponseEntity<>(staffService.updateStaff(staffEntity), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public void deletePersonnel(@Validated @PathVariable("id") Integer id) {
		staffService.deleteStaff(id);
	}

}
