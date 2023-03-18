package com.ada.ci.TCHENGA.service;

import java.util.List;
import java.util.Optional;

import com.ada.ci.TCHENGA.models.StaffEntity;

public interface StaffService {
	
	    public List<StaffEntity> findAllStaff();
		
		public Optional<StaffEntity> findById(Integer id);
		
		public StaffEntity saveStaff(StaffEntity staffEntity);
		
		public StaffEntity updateStaff(StaffEntity staffEntity);
		
		public void deleteStaff(Integer id);

}
