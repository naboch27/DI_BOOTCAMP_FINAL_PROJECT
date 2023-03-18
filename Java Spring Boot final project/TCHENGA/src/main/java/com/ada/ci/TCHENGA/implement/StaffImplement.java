package com.ada.ci.TCHENGA.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ada.ci.TCHENGA.models.StaffEntity;
import com.ada.ci.TCHENGA.repository.StaffRepository;
import com.ada.ci.TCHENGA.service.StaffService;

@Service
public class StaffImplement implements StaffService{

	private final StaffRepository staffRepository;
	
	
	
	public StaffImplement(StaffRepository staffRepository) {
		super();
		this.staffRepository = staffRepository;
	}

	@Override
	public List<StaffEntity> findAllStaff() {
		// TODO Auto-generated method stub
		return (List<StaffEntity>) staffRepository.findAll();
	}

	@Override
	public Optional<StaffEntity> findById(Integer id) {
		// TODO Auto-generated method stub
		return staffRepository.findById(id);
	}

	@Override
	public StaffEntity saveStaff(StaffEntity staffEntity) {
		// TODO Auto-generated method stub
		return staffRepository.save(staffEntity);
	}

	@Override
	public StaffEntity updateStaff(StaffEntity staffEntity) {
		// TODO Auto-generated method stub
		return staffRepository.save(staffEntity);
	}

	@Override
	public void deleteStaff(Integer id) {
		// TODO Auto-generated method stub
		staffRepository.deleteById(id);
	}

}
