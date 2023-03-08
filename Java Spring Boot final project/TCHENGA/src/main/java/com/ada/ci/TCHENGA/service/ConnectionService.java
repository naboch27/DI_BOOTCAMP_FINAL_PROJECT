package com.ada.ci.TCHENGA.service;

import java.util.List;
import java.util.Optional;

import com.ada.ci.TCHENGA.models.ConnectionEntity;

public interface ConnectionService {
	
	public List<ConnectionEntity> findAllConnection();
	
	public Optional<ConnectionEntity> findById(Integer id);
	
	public ConnectionEntity saveConnection(ConnectionEntity connectionEntity);
	
	public ConnectionEntity updateConnection(ConnectionEntity connectionEntity);
	
	public void deleteConnection(Integer id);

}
