package com.ada.ci.TCHENGA.service;

import java.util.List;
import java.util.Optional;

import com.ada.ci.TCHENGA.models.CountryEntity;

public interface CountryService {
	
	public List<CountryEntity> findAllCountry();
	
	public Optional<CountryEntity> findById(Integer id);
	
	public CountryEntity saveCountry(CountryEntity countryEntity);
	
	public CountryEntity updateCountry(CountryEntity countryEntity);
	
	public void deleteCountry(Integer id);

}
