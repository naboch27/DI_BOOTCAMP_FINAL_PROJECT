package com.ada.ci.TCHENGA.service;

import java.util.List;
import java.util.Optional;

import com.ada.ci.TCHENGA.models.MunicipalitiesEntity;

public interface MunicipalitiesService {
	
    public List<MunicipalitiesEntity> findAllMunicipalities();
	
	public Optional<MunicipalitiesEntity> findById(Integer id);
	
	public MunicipalitiesEntity saveMunicipalities(MunicipalitiesEntity municipalitiesEntity);
	
	public MunicipalitiesEntity updateMunicipalities(MunicipalitiesEntity municipalitiesEntity);
	
	public void deleteMunicipalities(Integer id);

}
