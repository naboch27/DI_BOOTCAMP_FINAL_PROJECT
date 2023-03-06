/**
 * 
 */
package com.ada.ci.TCHENGA.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;



/**
 * @author M.COULIBALY
 *
 */
@Entity
@Table(name= "country")
public class CountryEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer countryId;
	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name="name")
	private String countryName;
	@Column(name="create_at")
	private Date createAtCountry;
	@Column(name="update_at")
	private Date  updateAtCountry;
	
	public CountryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getCountryId() {
		return countryId;
	}
	
	
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Date getCreateAtCountry() {
		return createAtCountry;
	}
	public void setCreateAtCountry(Date createAtCountry) {
		this.createAtCountry = createAtCountry;
	}
	public Date getUpdateAtCountry() {
		return updateAtCountry;
	}
	public void setUpdateAtCountry(Date updateAtCountry) {
		this.updateAtCountry = updateAtCountry;
	}
	
	

}
