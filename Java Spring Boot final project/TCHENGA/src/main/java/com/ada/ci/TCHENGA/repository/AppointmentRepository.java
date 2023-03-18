package com.ada.ci.TCHENGA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ada.ci.TCHENGA.models.AppointmentEntity;

public interface AppointmentRepository extends JpaRepository<AppointmentEntity, Integer> {

}
