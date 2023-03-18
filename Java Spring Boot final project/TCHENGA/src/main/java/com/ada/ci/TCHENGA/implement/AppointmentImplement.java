package com.ada.ci.TCHENGA.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ada.ci.TCHENGA.models.AppointmentEntity;
import com.ada.ci.TCHENGA.repository.AppointmentRepository;
import com.ada.ci.TCHENGA.service.AppointmentService;

@Service
public class AppointmentImplement implements AppointmentService{
	
	private final AppointmentRepository appointmentRepository;

	public AppointmentImplement(AppointmentRepository appointmentRepository) {
		super();
		this.appointmentRepository = appointmentRepository;
	}

	@Override
	public List<AppointmentEntity> findAllAppointment() {
		// TODO Auto-generated method stub
		return (List<AppointmentEntity>) appointmentRepository.findAll();
	}

	@Override
	public Optional<AppointmentEntity> findById(Integer id) {
		// TODO Auto-generated method stub
		return appointmentRepository.findById(id);
	}

	@Override
	public AppointmentEntity saveAppointment(AppointmentEntity appointmentEntity) {
		// TODO Auto-generated method stub
		return appointmentRepository.save(appointmentEntity);
	}

	@Override
	public AppointmentEntity updateAppointment(AppointmentEntity appointmentEntity) {
		// TODO Auto-generated method stub
		return appointmentRepository.save(appointmentEntity);
	}

	@Override
	public void deleteAppointment(Integer id) {
		// TODO Auto-generated method stub
		appointmentRepository.deleteById(id);
	}
	
	

}
