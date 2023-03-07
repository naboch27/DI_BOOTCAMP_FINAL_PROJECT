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
@Table(name = "jobs")
public class JobsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer jobsId;
	
	@NotBlank(message = "Le champ name ne peut etre vide")
	@Column(name = "name")
	private String jobsName;
	
	@Column(name = "create_at")
	private Date createAtJobs;
	
	@Column(name = "update_at")
	private Date updateAtJobs;

	public JobsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public Date getCreateAtJobs() {
		return createAtJobs;
	}

	public void setCreateAtJobs(Date createAtJobs) {
		this.createAtJobs = createAtJobs;
	}

	public Date getUpdateAtJobs() {
		return updateAtJobs;
	}

	public void setUpdateAtJobs(Date updateAtJobs) {
		this.updateAtJobs = updateAtJobs;
	}
	
	
	

}
