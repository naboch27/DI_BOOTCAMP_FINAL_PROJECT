package com.ada.ci.TCHENGA.service;

import java.util.List;
import java.util.Optional;

import com.ada.ci.TCHENGA.models.JobsEntity;

public interface JobsService {
	
    public List<JobsEntity> findAllJobs();
	
	public Optional<JobsEntity> findById(Integer id);
	
	public JobsEntity saveJobs(JobsEntity jobsEntity);
	
	public JobsEntity updateJobs(JobsEntity jobsEntity);
	
	public void deleteJobs(Integer id);

}
