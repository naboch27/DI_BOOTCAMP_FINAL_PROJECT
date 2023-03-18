package com.ada.ci.TCHENGA.models;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*
 *  Super class that will be inherited
 *   by another class that contains attributes
 * */
@MappedSuperclass
abstract public class PersonEntity {

	// Attributes

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idPeson;

	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "first_name")
	private String firstNamePerson;

	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "last_name")
	private String lastNamePersonne;

	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "phone")
	private String phonePerson;

	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "email")
	@Email
	private String emailPerson;

	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "adresse")
	private String adressePerson;

	@Column(name = "create_at",updatable = false)
	private String createAtPerson;

	@Column(name = "update_at")
	private String updateAtPerson;

	// joins a class
/*
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "connectionId")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private ConnectionEntity connectionEntity;
*/
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "municipalitieId")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private MunicipalitiesEntity municipalitiesEntity;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "jobsId")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private JobsEntity jobsEntity;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "identityDocumentId")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private IdentityDocumentEntity documentEntity;

	// Default constructor

	public PersonEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Setters and Getters

	public Integer getIdPeson() {
		return idPeson;
	}

	public void setIdPeson(Integer idPeson) {
		this.idPeson = idPeson;
	}

	public String getFirstNamePerson() {
		return firstNamePerson;
	}

	public void setFirstNamePerson(String firstNamePerson) {
		this.firstNamePerson = firstNamePerson;
	}

	public String getLastNamePersonne() {
		return lastNamePersonne;
	}

	public void setLastNamePersonne(String lastNamePersonne) {
		this.lastNamePersonne = lastNamePersonne;
	}

	public String getPhonePerson() {
		return phonePerson;
	}

	public void setPhonePerson(String phonePerson) {
		this.phonePerson = phonePerson;
	}

	public String getEmailPerson() {
		return emailPerson;
	}

	public void setEmailPerson(String emailPerson) {
		this.emailPerson = emailPerson;
	}

	public String getAdressePerson() {
		return adressePerson;
	}

	public void setAdressePerson(String adressePerson) {
		this.adressePerson = adressePerson;
	}

	public String getCreateAtPerson() {
		return createAtPerson;
	}

	public void setCreateAtPerson(String createAtPerson) {
		this.createAtPerson = createAtPerson;
	}

	public String getUpdateAtPerson() {
		return updateAtPerson;
	}

	public void setUpdateAtPerson(String updateAtPerson) {
		this.updateAtPerson = updateAtPerson;
	}
/*
	public ConnectionEntity getConnectionEntity() {
		return connectionEntity;
	}

	public void setConnectionEntity(ConnectionEntity connectionEntity) {
		this.connectionEntity = connectionEntity;
	}
*/
	public MunicipalitiesEntity getMunicipalitiesEntity() {
		return municipalitiesEntity;
	}

	public void setMunicipalitiesEntity(MunicipalitiesEntity municipalitiesEntity) {
		this.municipalitiesEntity = municipalitiesEntity;
	}

	public JobsEntity getJobsEntity() {
		return jobsEntity;
	}

	public void setJobsEntity(JobsEntity jobsEntity) {
		this.jobsEntity = jobsEntity;
	}

	public IdentityDocumentEntity getDocumentEntity() {
		return documentEntity;
	}

	public void setDocumentEntity(IdentityDocumentEntity documentEntity) {
		this.documentEntity = documentEntity;
	}

	

	
}
