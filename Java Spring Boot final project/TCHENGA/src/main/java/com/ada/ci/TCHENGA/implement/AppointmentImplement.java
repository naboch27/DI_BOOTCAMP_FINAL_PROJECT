package com.ada.ci.TCHENGA.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ada.ci.TCHENGA.models.RendezVousEntity;
import com.ada.ci.TCHENGA.repository.RendezVousRepository;
import com.ada.ci.TCHENGA.service.RendezVousService;

@Service
public class RendezVousImplement implements RendezVousService{
	
	private final RendezVousRepository rendezVousRepository;

	public RendezVousImplement(RendezVousRepository rendezVousRepository) {
		super();
		this.rendezVousRepository = rendezVousRepository;
	}

	@Override
	public List<RendezVousEntity> findAllRendezVous() {
		// TODO Auto-generated method stub
		return (List<RendezVousEntity>) rendezVousRepository.findAll();
	}

	@Override
	public Optional<RendezVousEntity> findById(Integer id) {
		// TODO Auto-generated method stub
		return rendezVousRepository.findById(id);
	}

	@Override
	public RendezVousEntity saveRendezVous(RendezVousEntity rendezVousEntity) {
		// TODO Auto-generated method stub
		return rendezVousRepository.save(rendezVousEntity);
	}

	@Override
	public RendezVousEntity updateRendezVous(RendezVousEntity rendezVousEntity) {
		// TODO Auto-generated method stub
		return rendezVousRepository.save(rendezVousEntity);
	}

	@Override
	public void deleteRendezVous(Integer id) {
		// TODO Auto-generated method stub
		rendezVousRepository.deleteById(id);
	}
	
	

}
