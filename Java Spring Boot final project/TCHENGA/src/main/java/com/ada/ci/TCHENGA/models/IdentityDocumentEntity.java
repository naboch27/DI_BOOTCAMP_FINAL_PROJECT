package com.ada.ci.TCHENGA.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "identity_document")
public class IdentityDocumentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer identityDocumentId;
	
	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "name")
	private String identityDocumentName;
	
	@Column(name = "create_at")
	private Date createAtIdentityDocument;
	
	@Column(name = "update_at")
	private Date updateAtIdentityDocument;

	public IdentityDocumentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdentityDocumentId() {
		return identityDocumentId;
	}

	public void setIdentityDocumentId(Integer identityDocumentId) {
		this.identityDocumentId = identityDocumentId;
	}

	public String getIdentityDocumentName() {
		return identityDocumentName;
	}

	public void setIdentityDocumentName(String identityDocumentName) {
		this.identityDocumentName = identityDocumentName;
	}

	public Date getCreateAtIdentityDocument() {
		return createAtIdentityDocument;
	}

	public void setCreateAtIdentityDocument(Date createAtIdentityDocument) {
		this.createAtIdentityDocument = createAtIdentityDocument;
	}

	public Date getUpdateAtIdentityDocument() {
		return updateAtIdentityDocument;
	}

	public void setUpdateAtIdentityDocument(Date updateAtIdentityDocument) {
		this.updateAtIdentityDocument = updateAtIdentityDocument;
	}
	
	

}
