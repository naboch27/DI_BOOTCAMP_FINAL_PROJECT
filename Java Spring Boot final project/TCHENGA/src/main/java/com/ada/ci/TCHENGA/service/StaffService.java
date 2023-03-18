package com.ada.ci.TCHENGA.service;

import java.util.List;
import java.util.Optional;

import com.ada.ci.TCHENGA.models.PersonnelEntity;

public interface PersonnelService {
	
	    public List<PersonnelEntity> findAllPersonnel();
		
		public Optional<PersonnelEntity> findById(Integer id);
		
		public PersonnelEntity savePersonnel(PersonnelEntity personnelEntity);
		
		public PersonnelEntity updatePersonnel(PersonnelEntity personnelEntity);
		
		public void deletePersonnel(Integer id);

}
