package com.ada.ci.TCHENGA.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ada.ci.TCHENGA.models.AdminsEntity;
import com.ada.ci.TCHENGA.repository.AdminsRepository;
import com.ada.ci.TCHENGA.service.AdminsService;

@Service
public class AdminsImplement implements AdminsService{
	
	private final AdminsRepository adminsRepository;
	
	

	public AdminsImplement(AdminsRepository adminsRepository) {
		super();
		this.adminsRepository = adminsRepository;
	}

	@Override
	public List<AdminsEntity> findAllAdmins() {
		// TODO Auto-generated method stub
		return (List<AdminsEntity>) adminsRepository.findAll();
	}

	@Override
	public Optional<AdminsEntity> findById(Integer id) {
		// TODO Auto-generated method stub
		return adminsRepository.findById(id);
	}

	@Override
	public AdminsEntity saveAdmins(AdminsEntity adminsEntity) {
		// TODO Auto-generated method stub
		return adminsRepository.save(adminsEntity);
	}

	@Override
	public AdminsEntity updateAdmins(AdminsEntity adminsEntity) {
		// TODO Auto-generated method stub
		return adminsRepository.save(adminsEntity);
	}

	@Override
	public void deleteAdmins(Integer id) {
		// TODO Auto-generated method stub
		adminsRepository.deleteById(id);
		
	}

}
