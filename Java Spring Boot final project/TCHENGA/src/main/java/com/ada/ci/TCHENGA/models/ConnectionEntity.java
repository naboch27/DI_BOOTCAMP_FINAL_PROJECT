package com.ada.ci.TCHENGA.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 * Connection class with attributes, setters and getters Attributes:
 * id,name,create_at,update_at
 */

@Entity
@Table(name = "connection")
public class ConnectionEntity {

	// Attributes

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer connectionId;

	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "login")
	private String login;

	@Column(name = "create_at",updatable = false)
	private String createAtConnection;

	@Column(name = "update_at")
	private String updateAtConnection;

	// Default constructor

	public ConnectionEntity() {
		super();
	}
	
	// Setters and getters

	public Integer getConnectionId() {
		return connectionId;
	}

	public void setConnectionId(Integer connectionId) {
		this.connectionId = connectionId;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getCreateAtConnection() {
		return createAtConnection;
	}

	public void setCreateAtConnection(String createAtConnection) {
		this.createAtConnection = createAtConnection;
	}

	public String getUpdateAtConnection() {
		return updateAtConnection;
	}

	public void setUpdateAtConnection(String updateAtConnection) {
		this.updateAtConnection = updateAtConnection;
	}

	

	

}
