package com.ada.ci.TCHENGA.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ada.ci.TCHENGA.models.CenterEntity;
import com.ada.ci.TCHENGA.repository.CenterRepository;
import com.ada.ci.TCHENGA.service.CenterService;

@Service
public class CenterImplement implements CenterService{
	
	private final CenterRepository centerRepository;
	
	

	public CenterImplement(CenterRepository centerRepository) {
		super();
		this.centerRepository = centerRepository;
	}

	@Override
	public List<CenterEntity> findAllCenter() {
		// TODO Auto-generated method stub
		return (List<CenterEntity>) centerRepository.findAll();
	}

	@Override
	public Optional<CenterEntity> findById(Integer id) {
		// TODO Auto-generated method stub
		return centerRepository.findById(id);
	}

	@Override
	public CenterEntity saveCenter(CenterEntity centerEntity) {
		// TODO Auto-generated method stub
		return centerRepository.save(centerEntity);
	}

	@Override
	public CenterEntity updateCenter(CenterEntity centerEntity) {
		// TODO Auto-generated method stub
		return centerRepository.save(centerEntity);
	}

	@Override
	public void deleteCenter(Integer id) {
		// TODO Auto-generated method stub
		centerRepository.deleteById(id);
	}

}
