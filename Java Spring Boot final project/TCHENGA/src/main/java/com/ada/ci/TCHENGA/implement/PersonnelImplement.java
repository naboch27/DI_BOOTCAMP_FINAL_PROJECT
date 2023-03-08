package com.ada.ci.TCHENGA.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ada.ci.TCHENGA.models.PersonnelEntity;
import com.ada.ci.TCHENGA.repository.PersonnelRepository;
import com.ada.ci.TCHENGA.service.PersonnelService;

@Service
public class PersonnelImplement implements PersonnelService{

	private final PersonnelRepository personnelRepository;
	
	
	
	public PersonnelImplement(PersonnelRepository personnelRepository) {
		super();
		this.personnelRepository = personnelRepository;
	}

	@Override
	public List<PersonnelEntity> findAllPersonnel() {
		// TODO Auto-generated method stub
		return (List<PersonnelEntity>) personnelRepository.findAll();
	}

	@Override
	public Optional<PersonnelEntity> findById(Integer id) {
		// TODO Auto-generated method stub
		return personnelRepository.findById(id);
	}

	@Override
	public PersonnelEntity savePersonnel(PersonnelEntity personnelEntity) {
		// TODO Auto-generated method stub
		return personnelRepository.save(personnelEntity);
	}

	@Override
	public PersonnelEntity updatePersonnel(PersonnelEntity personnelEntity) {
		// TODO Auto-generated method stub
		return personnelRepository.save(personnelEntity);
	}

	@Override
	public void deletePersonnel(Integer id) {
		// TODO Auto-generated method stub
		personnelRepository.deleteById(id);
	}

}
