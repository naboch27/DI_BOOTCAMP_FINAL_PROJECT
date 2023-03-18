package com.ada.ci.TCHENGA.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 * Identity document class with attributes, setters and getters Attributes:
 * id,name,create_at,update_at
 */

@Entity
@Table(name = "identity_document")
public class IdentityDocumentEntity {

	// Attributes

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer identityDocumentId;

	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "name")
	private String identityDocumentName;

	@Column(name = "create_at" ,updatable = false)
	private String createAtIdentityDocument;

	@Column(name = "update_at")
	private String updateAtIdentityDocument;

	// Default constructor

	public IdentityDocumentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Setters and getters
	
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

	public String getCreateAtIdentityDocument() {
		return createAtIdentityDocument;
	}

	public void setCreateAtIdentityDocument(String createAtIdentityDocument) {
		this.createAtIdentityDocument = createAtIdentityDocument;
	}

	public String getUpdateAtIdentityDocument() {
		return updateAtIdentityDocument;
	}

	public void setUpdateAtIdentityDocument(String updateAtIdentityDocument) {
		this.updateAtIdentityDocument = updateAtIdentityDocument;
	}

	

	
}
