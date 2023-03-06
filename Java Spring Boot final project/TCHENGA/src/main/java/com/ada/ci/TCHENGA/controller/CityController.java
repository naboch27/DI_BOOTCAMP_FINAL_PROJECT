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

import com.ada.ci.TCHENGA.models.CityEntity;
import com.ada.ci.TCHENGA.service.CityService;

@RestController

@RequestMapping("/public/api/v1/city")
public class CityController {
	
	public final CityService cityService;

	public CityController(CityService cityService) {
		// TODO Auto-generated constructor stub
		
		this.cityService = cityService;

	}

	@GetMapping
	public List<CityEntity> findAllCity() {

		return cityService.findAllCity();
	}

	@GetMapping("/{id}")
	public ResponseEntity<CityEntity> findById(@Validated @PathVariable("id") Integer id) {
		Optional<CityEntity> city = cityService.findById(id);

	    if (city.isPresent()) {
	      return ResponseEntity.ok().body(city.get());
	    } else {
	      return ResponseEntity.notFound().build();
	    }
	}

	@PostMapping
	public ResponseEntity<CityEntity> saveCity(@Validated @RequestBody CityEntity cityEntity) {
		
		 return new ResponseEntity<>(cityService.saveCity(cityEntity), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<CityEntity> updateCity(@RequestBody CityEntity cityEntity) {

		return new ResponseEntity<>(cityService.updateCity(cityEntity), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public void deleteCity(@Validated @PathVariable("id") Integer id) {
		cityService.deleteCity(id);
	}

}
