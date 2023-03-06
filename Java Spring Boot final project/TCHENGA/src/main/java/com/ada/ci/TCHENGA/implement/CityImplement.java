package com.ada.ci.TCHENGA.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ada.ci.TCHENGA.models.CityEntity;
import com.ada.ci.TCHENGA.repository.CityRepository;
import com.ada.ci.TCHENGA.service.CityService;

@Service
public class CityImplement implements CityService {

	private final CityRepository cityRepository;

	public CityImplement(CityRepository cityRepository) {
		super();
		// TODO Auto-generated constructor stub
		this.cityRepository = cityRepository;
	}

	@Override
	public List<CityEntity> findAllCity() {
		// TODO Auto-generated method stub
		return (List<CityEntity>) cityRepository.findAll();
	}

	@Override
	public Optional<CityEntity> findById(Integer id) {
		// TODO Auto-generated method stub
		return cityRepository.findById(id);
	}

	@Override
	public CityEntity saveCity(CityEntity cityEntity) {
		// TODO Auto-generated method stub
		return cityRepository.save(cityEntity);
	}

	@Override
	public CityEntity updateCity(CityEntity cityEntity) {
		// TODO Auto-generated method stub
		return cityRepository.save(cityEntity);
	}

	@Override
	public void deleteCity(Integer id) {
		// TODO Auto-generated method stub
		cityRepository.deleteById(id);

	}

}
