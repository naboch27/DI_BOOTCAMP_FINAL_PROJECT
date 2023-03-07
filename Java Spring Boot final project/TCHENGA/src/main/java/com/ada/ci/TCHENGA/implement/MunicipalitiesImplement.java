package com.ada.ci.TCHENGA.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ada.ci.TCHENGA.models.MunicipalitiesEntity;
import com.ada.ci.TCHENGA.repository.MunicipalitiesRepository;
import com.ada.ci.TCHENGA.service.MunicipalitiesService;

@Service
public class MunicipalitiesImplement implements MunicipalitiesService{
	
	private final MunicipalitiesRepository municipalitiesRepository;
	
	

	public MunicipalitiesImplement(MunicipalitiesRepository municipalitiesRepository) {
		super();
		this.municipalitiesRepository = municipalitiesRepository;
	}

	@Override
	public List<MunicipalitiesEntity> findAllMunicipalities() {
		// TODO Auto-generated method stub
		return (List<MunicipalitiesEntity>) municipalitiesRepository.findAll();
	}

	@Override
	public Optional<MunicipalitiesEntity> findById(Integer id) {
		// TODO Auto-generated method stub
		return municipalitiesRepository.findById(id);
	}

	@Override
	public MunicipalitiesEntity saveMunicipalities(MunicipalitiesEntity municipalitiesEntity) {
		// TODO Auto-generated method stub
		return municipalitiesRepository.save(municipalitiesEntity);
	}

	@Override
	public MunicipalitiesEntity updateMunicipalities(MunicipalitiesEntity municipalitiesEntity) {
		// TODO Auto-generated method stub
		return municipalitiesRepository.save(municipalitiesEntity);
	}

	@Override
	public void deleteMunicipalities(Integer id) {
		// TODO Auto-generated method stub
		municipalitiesRepository.deleteById(id);
	}

}
