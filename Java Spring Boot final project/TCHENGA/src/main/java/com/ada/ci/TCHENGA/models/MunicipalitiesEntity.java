package com.ada.ci.TCHENGA.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "municipalitie")
public class MunicipalitiesEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer municipalitieId;
	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "name")
	private String municipalitieName;
	@Column(name = "create_at")
	private Date createAtMunicipalitie;
	@Column(name = "update_at")
	private Date updateAtMunicipalitie;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "cityId")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private CityEntity city;

	public MunicipalitiesEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getMunicipalitieId() {
		return municipalitieId;
	}

	public void setMunicipalitieId(Integer municipalitieId) {
		this.municipalitieId = municipalitieId;
	}

	public String getMunicipalitieName() {
		return municipalitieName;
	}

	public void setMunicipalitieName(String municipalitieName) {
		this.municipalitieName = municipalitieName;
	}

	public Date getCreateAtMunicipalitie() {
		return createAtMunicipalitie;
	}

	public void setCreateAtMunicipalitie(Date createAtMunicipalitie) {
		this.createAtMunicipalitie = createAtMunicipalitie;
	}

	public Date getUpdateAtMunicipalitie() {
		return updateAtMunicipalitie;
	}

	public void setUpdateAtMunicipalitie(Date updateAtMunicipalitie) {
		this.updateAtMunicipalitie = updateAtMunicipalitie;
	}

	public CityEntity getCity() {
		return city;
	}

	public void setCity(CityEntity city) {
		this.city = city;
	}
	
	

	
}
