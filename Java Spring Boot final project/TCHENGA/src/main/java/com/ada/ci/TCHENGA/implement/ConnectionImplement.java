package com.ada.ci.TCHENGA.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ada.ci.TCHENGA.models.ConnectionEntity;
import com.ada.ci.TCHENGA.repository.ConnectionRepository;
import com.ada.ci.TCHENGA.service.ConnectionService;

@Service
public class ConnectionImplement implements ConnectionService{
	
	private final ConnectionRepository connectionRepository;

	public ConnectionImplement(ConnectionRepository connectionRepository) {
		super();
		this.connectionRepository = connectionRepository;
	}

	@Override
	public List<ConnectionEntity> findAllConnection() {
		// TODO Auto-generated method stub
		return (List<ConnectionEntity>) connectionRepository.findAll();
	}

	@Override
	public Optional<ConnectionEntity> findById(Integer id) {
		// TODO Auto-generated method stub
		return connectionRepository.findById(id);
	}

	@Override
	public ConnectionEntity saveConnection(ConnectionEntity connectionEntity) {
		// TODO Auto-generated method stub
		return connectionRepository.save(connectionEntity);
	}

	@Override
	public ConnectionEntity updateConnection(ConnectionEntity connectionEntity) {
		// TODO Auto-generated method stub
		return connectionRepository.save(connectionEntity);
	}

	@Override
	public void deleteConnection(Integer id) {
		// TODO Auto-generated method stub
		
		connectionRepository.deleteById(id);
		
	}
	
	

}
