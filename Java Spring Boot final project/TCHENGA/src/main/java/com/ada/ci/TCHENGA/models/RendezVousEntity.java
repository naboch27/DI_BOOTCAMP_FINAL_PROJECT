package com.ada.ci.TCHENGA.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rendez_vous")
public class RendezVousEntity {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer IdRendezVous;
	
	@Column(name = "date_rendez_vous")
	private Date dateRendezVous;
	
	@Column(name = "create_at")
	private Date createAtRendezVous;
	
	@Column(name = "update_at")
	private Date updateAtRendezVous;

	public RendezVousEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdRendezVous() {
		return IdRendezVous;
	}

	public void setIdRendezVous(Integer idRendezVous) {
		IdRendezVous = idRendezVous;
	}

	public Date getDateRendezVous() {
		return dateRendezVous;
	}

	public void setDateRendezVous(Date dateRendezVous) {
		this.dateRendezVous = dateRendezVous;
	}

	public Date getCreateAtRendezVous() {
		return createAtRendezVous;
	}

	public void setCreateAtRendezVous(Date createAtRendezVous) {
		this.createAtRendezVous = createAtRendezVous;
	}

	public Date getUpdateAtRendezVous() {
		return updateAtRendezVous;
	}

	public void setUpdateAtRendezVous(Date updateAtRendezVous) {
		this.updateAtRendezVous = updateAtRendezVous;
	}


	
	

}
