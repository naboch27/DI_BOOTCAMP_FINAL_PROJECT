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

import com.ada.ci.TCHENGA.models.AppointmentEntity;
import com.ada.ci.TCHENGA.service.AppointmentService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
@RequestMapping("/public/api/v1/appointment")
public class AppointmentController {
	
	private final AppointmentService appointmentService;

	public AppointmentController(AppointmentService appointmentService) {
		super();
		this.appointmentService = appointmentService;
	}
	
	@GetMapping
	public List<AppointmentEntity> findAllAppointmentService() {

		return appointmentService.findAllAppointment();
	}

	@GetMapping("/{id}")
	public ResponseEntity<AppointmentEntity> findById(@Validated @PathVariable("id") Integer id) {
		Optional<AppointmentEntity> appointment = appointmentService.findById(id);

	    if (appointment.isPresent()) {
	      return ResponseEntity.ok().body(appointment.get());
	    } else {
	      return ResponseEntity.notFound().build();
	    }
	}

	@PostMapping
	public ResponseEntity<AppointmentEntity> saveAppointment(@Validated @RequestBody AppointmentEntity appointmentEntity) {
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");

		System.out.println("yyyy/MMMM/dd HH:mm:ss-> " + dtf3.format(LocalDateTime.now()));

		appointmentEntity.setCreateAtAppointment(dtf3.format(LocalDateTime.now()));

		appointmentEntity.setUpdateAtAppointment(dtf3.format(LocalDateTime.now()));
		
		 return new ResponseEntity<>(appointmentService.saveAppointment(appointmentEntity), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<AppointmentEntity> updateAppointment(@RequestBody AppointmentEntity appointmentEntity) {

		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");

		System.out.println("yyyy/MMMM/dd HH:mm:ss-> " + dtf3.format(LocalDateTime.now()));

		System.out.println(appointmentEntity.getCreateAtAppointment());
		
		appointmentEntity.setCreateAtAppointment(appointmentEntity.getCreateAtAppointment());
		
		appointmentEntity.setUpdateAtAppointment(dtf3.format(LocalDateTime.now()));
		
		return new ResponseEntity<>(appointmentService.updateAppointment(appointmentEntity), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public void deleteAppointment(@Validated @PathVariable("id") Integer id) {
		appointmentService.deleteAppointment(id);
	}



}
