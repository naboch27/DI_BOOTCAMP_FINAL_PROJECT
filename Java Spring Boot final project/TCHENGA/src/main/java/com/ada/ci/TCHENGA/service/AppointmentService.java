package com.ada.ci.TCHENGA.service;

import java.util.List;
import java.util.Optional;

import com.ada.ci.TCHENGA.models.AppointmentEntity;

public interface AppointmentService {

	public List<AppointmentEntity> findAllAppointment();

	public Optional<AppointmentEntity> findById(Integer id);

	public AppointmentEntity saveAppointment(AppointmentEntity appointmentEntity);

	public AppointmentEntity updateAppointment(AppointmentEntity appointmentEntity);

	public void deleteAppointment(Integer id);

}
