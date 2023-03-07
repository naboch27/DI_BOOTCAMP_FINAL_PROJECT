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

import com.ada.ci.TCHENGA.models.JobsEntity;
import com.ada.ci.TCHENGA.service.JobsService;


@RestController
@RequestMapping("/public/api/v1/jobs")
public class JobsController {
	
	private final JobsService jobsService;

	public JobsController(JobsService jobsService) {
		super();
		this.jobsService = jobsService;
	}
	
	@GetMapping
	public List<JobsEntity> findAllJobs() {

		return jobsService.findAllJobs();
	}

	@GetMapping("/{id}")
	public ResponseEntity<JobsEntity> findById(@Validated @PathVariable("id") Integer id) {
		Optional<JobsEntity> jobs = jobsService.findById(id);

	    if (jobs.isPresent()) {
	      return ResponseEntity.ok().body(jobs.get());
	    } else {
	      return ResponseEntity.notFound().build();
	    }
	}

	@PostMapping
	public ResponseEntity<JobsEntity> saveJobs(@Validated @RequestBody JobsEntity jobsEntity) {
		
		 return new ResponseEntity<>(jobsService.saveJobs(jobsEntity), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<JobsEntity> updateJobs(@RequestBody JobsEntity jobsEntity) {

		return new ResponseEntity<>(jobsService.updateJobs(jobsEntity), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public void deleteJobs(@Validated @PathVariable("id") Integer id) {
		jobsService.deleteJobs(id);
	}


}
