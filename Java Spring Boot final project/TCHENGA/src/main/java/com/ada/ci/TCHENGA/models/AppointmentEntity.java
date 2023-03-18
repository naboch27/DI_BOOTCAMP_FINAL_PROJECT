package com.ada.ci.TCHENGA.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Appointment class with attributes, setters and getters Attributes:
 * id,name,create_at,update_at
 */

@Entity
@Table(name = "appointment")
public class AppointmentEntity {

	// Attributes

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer IdAppointment;

	@Column(name = "create_at",updatable = false)
	private String createAtAppointment;

	@Column(name = "update_at")
	private String updateAtAppointment;

	// join country

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPeson")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private DonorEntity donorEntity;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCenter")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private CenterEntity centerEntity;

	// Default constructor

	public AppointmentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Setters and getters

	public Integer getIdAppointment() {
		return IdAppointment;
	}

	public void setIdAppointment(Integer idAppointment) {
		IdAppointment = idAppointment;
	}

	public String getCreateAtAppointment() {
		return createAtAppointment;
	}

	public void setCreateAtAppointment(String createAtAppointment) {
		this.createAtAppointment = createAtAppointment;
	}

	public String getUpdateAtAppointment() {
		return updateAtAppointment;
	}

	public void setUpdateAtAppointment(String updateAtAppointment) {
		this.updateAtAppointment = updateAtAppointment;
	}

	public DonorEntity getDonorEntity() {
		return donorEntity;
	}

	public void setDonorEntity(DonorEntity donorEntity) {
		this.donorEntity = donorEntity;
	}

	public CenterEntity getCenterEntity() {
		return centerEntity;
	}

	public void setCenterEntity(CenterEntity centerEntity) {
		this.centerEntity = centerEntity;
	}

	

	
}
