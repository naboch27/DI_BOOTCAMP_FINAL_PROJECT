package com.ada.ci.TCHENGA.service;

import java.util.List;
import java.util.Optional;

import com.ada.ci.TCHENGA.models.CenterEntity;

public interface CenterService {
	
	public List<CenterEntity> findAllCenter();
	
	public Optional<CenterEntity> findById(Integer id);
	
	public CenterEntity saveCenter(CenterEntity centerEntity);
	
	public CenterEntity updateCenter(CenterEntity centerEntity);
	
	public void deleteCenter(Integer id);

}
