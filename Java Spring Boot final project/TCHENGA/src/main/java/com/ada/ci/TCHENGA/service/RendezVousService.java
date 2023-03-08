package com.ada.ci.TCHENGA.service;

import java.util.List;
import java.util.Optional;

import com.ada.ci.TCHENGA.models.RendezVousEntity;

public interface RendezVousService {
	
    public List<RendezVousEntity> findAllRendezVous();
	
	public Optional<RendezVousEntity> findById(Integer id);
	
	public RendezVousEntity saveRendezVous(RendezVousEntity rendezVousEntity);
	
	public RendezVousEntity updateRendezVous(RendezVousEntity rendezVousEntity);
	
	public void deleteRendezVous(Integer id);   

}
