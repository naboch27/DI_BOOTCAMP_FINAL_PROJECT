package com.ada.ci.TCHENGA.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ada.ci.TCHENGA.models.CountryEntity;
import com.ada.ci.TCHENGA.repository.CountryRepository;
import com.ada.ci.TCHENGA.service.CountryService;

@Service
public class CountryImplement implements CountryService{
	
	private final  CountryRepository countryRepository;
	
	

	public CountryImplement(CountryRepository countryRepository ) {
		super();
		// TODO Auto-generated constructor stub
		this.countryRepository=countryRepository;
	}

	@Override
	public List<CountryEntity> findAllCountry() {
		// TODO Auto-generated method stub
		return (List<CountryEntity>) countryRepository.findAll();
	}

	@Override
	public Optional<CountryEntity> findById(Integer id) {
		// TODO Auto-generated method stub
		return countryRepository.findById(id);
	}

	@Override
	public CountryEntity saveCountry(CountryEntity countryEntity) {
		// TODO Auto-generated method stub
		return countryRepository.save(countryEntity);
	}

	@Override
	public CountryEntity updateCountry(CountryEntity countryEntity) {
		// TODO Auto-generated method stub
		return countryRepository.save(countryEntity);
	}

	@Override
	public void deleteCountry(Integer id) {
		// TODO Auto-generated method stub
	 countryRepository.deleteById(id);
		
	}

}
