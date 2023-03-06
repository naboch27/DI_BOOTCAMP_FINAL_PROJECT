package com.ada.ci.TCHENGA.service;

import java.util.List;
import java.util.Optional;

import com.ada.ci.TCHENGA.models.CityEntity;


public interface CityService {
	
	public List<CityEntity> findAllCity();
	
	public Optional<CityEntity> findById(Integer id);
	
	public CityEntity saveCity(CityEntity cityEntity);
	
	public CityEntity updateCity(CityEntity cityEntity);
	
	public void deleteCity(Integer id);

}
