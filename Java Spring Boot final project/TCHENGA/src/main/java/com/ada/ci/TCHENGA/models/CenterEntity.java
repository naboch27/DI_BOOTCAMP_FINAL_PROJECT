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
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "center")
public class CenterEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idCenter;
	
	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "name")
	private String nameCenter;
	
	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "email")
	@Email
    private String emailCenter;
	
	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "code")
    private String codeCenter;
	
	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "phone")
    private String phoneCenter;
	
	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "adresse")
    private String adresseCenter;
	
	@Column(name = "create_at")
	private Date createAtCity;
	
	@Column(name = "update_at")
	private Date updateAtCity;
    
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "municipalitieId")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private MunicipalitiesEntity municipalities;


	public CenterEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getIdCenter() {
		return idCenter;
	}


	public void setIdCenter(Integer idCenter) {
		this.idCenter = idCenter;
	}


	public String getNameCenter() {
		return nameCenter;
	}


	public void setNameCenter(String nameCenter) {
		this.nameCenter = nameCenter;
	}


	public String getEmailCenter() {
		return emailCenter;
	}


	public void setEmailCenter(String emailCenter) {
		this.emailCenter = emailCenter;
	}


	public String getCodeCenter() {
		return codeCenter;
	}


	public void setCodeCenter(String codeCenter) {
		this.codeCenter = codeCenter;
	}


	public String getPhoneCenter() {
		return phoneCenter;
	}


	public void setPhoneCenter(String phoneCenter) {
		this.phoneCenter = phoneCenter;
	}


	public String getAdresseCenter() {
		return adresseCenter;
	}


	public void setAdresseCenter(String adresseCenter) {
		this.adresseCenter = adresseCenter;
	}


	public Date getCreateAtCity() {
		return createAtCity;
	}


	public void setCreateAtCity(Date createAtCity) {
		this.createAtCity = createAtCity;
	}


	public Date getUpdateAtCity() {
		return updateAtCity;
	}


	public void setUpdateAtCity(Date updateAtCity) {
		this.updateAtCity = updateAtCity;
	}


	public MunicipalitiesEntity getMunicipalities() {
		return municipalities;
	}


	public void setMunicipalities(MunicipalitiesEntity municipalities) {
		this.municipalities = municipalities;
	}
	
	
	

}
