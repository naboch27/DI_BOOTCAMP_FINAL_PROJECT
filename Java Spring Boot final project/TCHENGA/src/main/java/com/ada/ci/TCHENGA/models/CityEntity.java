package com.ada.ci.TCHENGA.models;

import java.util.Date;

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

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="city")
public class CityEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer cityId;
	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name="name")
	private String cityName;
	@NotBlank(message = "Le champ create country ne peut etre vide")
	@Column(name="create_at")
	private Date createAtCountry;
	@NotBlank(message = "Le champ update country ne peut etre vide")
	@Column(name="update_at")
	
	  private Date  updateAtCountry;
	  @ManyToOne(fetch = FetchType.LAZY, optional = false)
	  @JoinColumn(name = "countryId", nullable = false)
	  @OnDelete(action = OnDeleteAction.CASCADE)
	  @JsonIgnore
	   private CountryEntity country;
	  
	public CityEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public CountryEntity getCountry() {
		return country;
	}

	public void setCountry(CountryEntity country) {
		this.country = country;
	}
	  
	  

}
