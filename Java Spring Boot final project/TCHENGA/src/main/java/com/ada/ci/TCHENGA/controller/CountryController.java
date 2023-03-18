package com.ada.ci.TCHENGA.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

import com.ada.ci.TCHENGA.models.CountryEntity;
import com.ada.ci.TCHENGA.service.CountryService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
@RequestMapping("/public/api/v1/country")
public class CountryController {

	public final CountryService countryService;

	public CountryController(CountryService countryService) {
		// TODO Auto-generated constructor stub

		this.countryService = countryService;

	}

	@GetMapping
	public List<CountryEntity> findAllCountry() {

		return countryService.findAllCountry();
	}

	@GetMapping("/{id}")
	public ResponseEntity<CountryEntity> findById(@Validated @PathVariable("id") Integer id) {
		Optional<CountryEntity> country = countryService.findById(id);

		if (country.isPresent()) {
			return ResponseEntity.ok().body(country.get());
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping
	public ResponseEntity<CountryEntity> saveCountry(@RequestBody @Validated CountryEntity countryEntity) {

		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");

		System.out.println("yyyy/MMMM/dd HH:mm:ss-> " + dtf3.format(LocalDateTime.now()));

		countryEntity.setCreateAtCountry(dtf3.format(LocalDateTime.now()));

		countryEntity.setUpdateAtCountry(dtf3.format(LocalDateTime.now()));

		return new ResponseEntity<>(countryService.saveCountry(countryEntity), HttpStatus.CREATED);

	}

	@PutMapping
	public ResponseEntity<CountryEntity> updateCountry(@RequestBody @Validated CountryEntity countryEntity) {

		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");

		System.out.println("yyyy/MMMM/dd HH:mm:ss-> " + dtf3.format(LocalDateTime.now()));

		System.out.println(countryEntity.getCreateAtCountry());
		
		countryEntity.setCreateAtCountry(countryEntity.getCreateAtCountry());
		
		countryEntity.setUpdateAtCountry(dtf3.format(LocalDateTime.now()));

		return new ResponseEntity<>(countryService.updateCountry(countryEntity), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public void deleteCountry(@Validated @PathVariable("id") Integer id) {
		countryService.deleteCountry(id);
	}

}
