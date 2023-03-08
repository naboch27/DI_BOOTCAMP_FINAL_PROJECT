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
@Table(name = "connection")
public class ConnectionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer connectionId;

	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "login")
	private String login;

	@Column(name = "create_at")
	private Date createAtConnection;

	@Column(name = "update_at")
	private Date updateAtConnection;

	public ConnectionEntity() {
		super();
	}

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

	public Date getCreateAtConnection() {
		return createAtConnection;
	}

	public void setCreateAtConnection(Date createAtConnection) {
		this.createAtConnection = createAtConnection;
	}

	public Date getUpdateAtConnection() {
		return updateAtConnection;
	}

	public void setUpdateAtConnection(Date updateAtConnection) {
		this.updateAtConnection = updateAtConnection;
	}

	

}
