package com.ada.ci.TCHENGA.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ada.ci.TCHENGA.models.CountryEntity;
import com.ada.ci.TCHENGA.service.CountryService;

@RestController

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
	public Optional<CountryEntity> findById(@PathVariable("id") Integer id) {
		return countryService.findById(id);
	}

	@PostMapping
	public CountryEntity saveCountry(@RequestBody CountryEntity countryEntity) {
		
		return countryService.saveCountry(countryEntity);
	}

	@PutMapping
	public CountryEntity updateCountry(@RequestBody CountryEntity countryEntity) {

		return countryService.updateCountry(countryEntity);
	}

	@DeleteMapping("/{id}")
	public void deleteCountry(@PathVariable("id") Integer id) {
		countryService.deleteCountry(id);
	}

}
