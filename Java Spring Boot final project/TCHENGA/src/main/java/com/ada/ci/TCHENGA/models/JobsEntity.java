package com.ada.ci.TCHENGA.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


/**
 * Jobs class with attributes, setters and getters Attributes:
 * id,name,create_at,update_at
 */


@Entity
@Table(name = "jobs")
public class JobsEntity {
	
	//Attributes
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer jobsId;
	
	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "name")
	private String jobsName;
	
	@Column(name = "create_at",updatable = false)
	private String createAtJobs;
	
	@Column(name = "update_at")
	private String updateAtJobs;
	
	//Default constructor

	public JobsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Setters and getters

	public Integer getJobsId() {
		return jobsId;
	}

	public void setJobsId(Integer jobsId) {
		this.jobsId = jobsId;
	}

	public String getJobsName() {
		return jobsName;
	}

	public void setJobsName(String jobsName) {
		this.jobsName = jobsName;
	}

	public String getCreateAtJobs() {
		return createAtJobs;
	}

	public void setCreateAtJobs(String createAtJobs) {
		this.createAtJobs = createAtJobs;
	}

	public String getUpdateAtJobs() {
		return updateAtJobs;
	}

	public void setUpdateAtJobs(String updateAtJobs) {
		this.updateAtJobs = updateAtJobs;
	}

	
	
	

}
