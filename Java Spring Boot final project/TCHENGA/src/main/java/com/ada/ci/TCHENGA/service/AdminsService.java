package com.ada.ci.TCHENGA.service;

import java.util.List;
import java.util.Optional;

import com.ada.ci.TCHENGA.models.AdminsEntity;

public interface AdminsService {
	
    public List<AdminsEntity> findAllAdmins();
	
	public Optional<AdminsEntity> findById(Integer id);
	
	public AdminsEntity saveAdmins(AdminsEntity adminsEntity);
	
	public AdminsEntity updateAdmins(AdminsEntity adminsEntity);
	
	public void deleteAdmins(Integer id);

}
