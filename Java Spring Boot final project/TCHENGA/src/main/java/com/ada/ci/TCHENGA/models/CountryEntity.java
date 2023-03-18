/**
 * 
 */
package com.ada.ci.TCHENGA.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


/**
 * Country class with attributes, setters and getters Attributes
 * :id,name,create_at,update_at
 */
@Entity
@Table(name = "country")
public class CountryEntity {

	// Attributes

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer countryId;

	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "name")
	
	private String countryName;

	@Column(name = "create_at",updatable = false)
	private String createAtCountry;

	@Column(name = "update_at")
	private String updateAtCountry;

	// default constructor
	
	public CountryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	// setters and getters

	public Integer getCountryId() {
		return countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCreateAtCountry() {
		return createAtCountry;
	}

	public void setCreateAtCountry(String createAtCountry) {
		this.createAtCountry = createAtCountry;
	}

	public String getUpdateAtCountry() {
		return updateAtCountry;
	}

	public void setUpdateAtCountry(String updateAtCountry) {
		this.updateAtCountry = updateAtCountry;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}



	
	
}
