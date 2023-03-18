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
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Municipalities class with attributes, setters and getters Attributes:
 * id,name,create_at,update_at
 */

@Entity
@Table(name = "municipalitie")
public class MunicipalitiesEntity {

	// Attributes

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer municipalitieId;

	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "name")
	private String municipalitieName;
	
	@Column(name = "create_at",updatable = false)
	private String createAtMunicipalitie;
	
	@Column(name = "update_at")
	private String updateAtMunicipalitie;

	// join country

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cityId")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private CityEntity city;

	// Default constructor

	public MunicipalitiesEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Setters and getters
	
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

	public String getCreateAtMunicipalitie() {
		return createAtMunicipalitie;
	}

	public void setCreateAtMunicipalitie(String createAtMunicipalitie) {
		this.createAtMunicipalitie = createAtMunicipalitie;
	}

	public String getUpdateAtMunicipalitie() {
		return updateAtMunicipalitie;
	}

	public void setUpdateAtMunicipalitie(String updateAtMunicipalitie) {
		this.updateAtMunicipalitie = updateAtMunicipalitie;
	}

	public CityEntity getCity() {
		return city;
	}

	public void setCity(CityEntity city) {
		this.city = city;
	}

	

	

}
