package com.ada.ci.TCHENGA.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ada.ci.TCHENGA.models.DonorEntity;
import com.ada.ci.TCHENGA.repository.DonorRepository;
import com.ada.ci.TCHENGA.service.DonorService;

@Service
public class DonorImplement implements DonorService{
	
	private final DonorRepository donorRepository;

	public DonorImplement(DonorRepository donorRepository) {
		super();
		this.donorRepository = donorRepository;
	}

	@Override
	public List<DonorEntity> findAllDonor() {
		// TODO Auto-generated method stub
		return (List<DonorEntity>) donorRepository.findAll();
	}

	@Override
	public Optional<DonorEntity> findById(Integer id) {
		// TODO Auto-generated method stub
		return donorRepository.findById(id);
	}

	@Override
	public DonorEntity saveDonor(DonorEntity donorEntity) {
		// TODO Auto-generated method stub
		return donorRepository.save(donorEntity);
	}

	@Override
	public DonorEntity updateDonor(DonorEntity donorEntity) {
		// TODO Auto-generated method stub
		return donorRepository.save(donorEntity);
	}

	@Override
	public void deleteDonor(Integer id) {
		// TODO Auto-generated method stub
		donorRepository.deleteById(id);
	}
	
	

}
