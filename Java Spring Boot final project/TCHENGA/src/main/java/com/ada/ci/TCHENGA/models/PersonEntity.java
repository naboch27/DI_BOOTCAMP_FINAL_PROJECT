package com.ada.ci.TCHENGA.models;

import java.util.Date;

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

@MappedSuperclass
abstract public class PesonneEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idPesonne;

	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "first_name")
	private String firstNamePersonne;

	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "last_name")
	private String lastNamePersonne;

	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "phone")
	private String phonePersonne;

	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "email")
	@Email
	private String emailPersonal;

	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "adresse")
	private String adressePersonne;

	@Column(name = "create_at")
	private Date createAtPersonne;

	@Column(name = "update_at")
	private Date updateAtPersonne;

	@ManyToOne( fetch = FetchType.LAZY)
	@JoinColumn(name = "jobsId")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private JobsEntity jobsEntity;

	@ManyToOne( fetch = FetchType.LAZY)
	@JoinColumn(name = "identityDocumentId")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private IdentityDocumentEntity documentEntity;

	public PesonneEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdPesonne() {
		return idPesonne;
	}

	public void setIdPesonne(Integer idPesonne) {
		this.idPesonne = idPesonne;
	}

	public String getFirstNamePersonne() {
		return firstNamePersonne;
	}

	public void setFirstNamePersonne(String firstNamePersonne) {
		this.firstNamePersonne = firstNamePersonne;
	}

	public String getLastNamePersonne() {
		return lastNamePersonne;
	}

	public void setLastNamePersonne(String lastNamePersonne) {
		this.lastNamePersonne = lastNamePersonne;
	}

	public String getPhonePersonne() {
		return phonePersonne;
	}

	public void setPhonePersonne(String phonePersonne) {
		this.phonePersonne = phonePersonne;
	}

	public String getEmailPersonal() {
		return emailPersonal;
	}

	public void setEmailPersonal(String emailPersonal) {
		this.emailPersonal = emailPersonal;
	}

	public String getAdressePersonne() {
		return adressePersonne;
	}

	public void setAdressePersonne(String adressePersonne) {
		this.adressePersonne = adressePersonne;
	}

	public Date getCreateAtPersonne() {
		return createAtPersonne;
	}

	public void setCreateAtPersonne(Date createAtPersonne) {
		this.createAtPersonne = createAtPersonne;
	}

	public Date getUpdateAtPersonne() {
		return updateAtPersonne;
	}

	public void setUpdateAtPersonne(Date updateAtPersonne) {
		this.updateAtPersonne = updateAtPersonne;
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
