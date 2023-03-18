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
 * City class with attributes, setters and getters Attributes:
 * id,name,create_at,update_at
 */

@Entity
@Table(name = "city")
public class CityEntity {

	// Attributes

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer cityId;

	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "name")
	private String cityName;

	@Column(name = "create_at",updatable = false)
	private String createAtCity;

	@Column(name = "update_at")
	private String updateAtCity;

	// join country

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "countryId")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private CountryEntity country;

	// Default constructor

	public CityEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Setters and getters

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCreateAtCity() {
		return createAtCity;
	}

	public void setCreateAtCity(String createAtCity) {
		this.createAtCity = createAtCity;
	}

	public String getUpdateAtCity() {
		return updateAtCity;
	}

	public void setUpdateAtCity(String updateAtCity) {
		this.updateAtCity = updateAtCity;
	}

	public CountryEntity getCountry() {
		return country;
	}

	public void setCountry(CountryEntity country) {
		this.country = country;
	}

	
}
