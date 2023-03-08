package com.ada.ci.TCHENGA.service;

import java.util.List;
import java.util.Optional;

import com.ada.ci.TCHENGA.models.DonorEntity;

public interface DonorService {
	
	public List<DonorEntity> findAllDonor();
	
	public Optional<DonorEntity> findById(Integer id);
	
	public DonorEntity saveDonor(DonorEntity donorEntity);
	
	public DonorEntity updateDonor(DonorEntity donorEntity);
	
	public void deleteDonor(Integer id);

}
