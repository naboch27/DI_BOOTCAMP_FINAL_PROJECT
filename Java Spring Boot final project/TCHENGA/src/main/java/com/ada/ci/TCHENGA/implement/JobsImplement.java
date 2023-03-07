package com.ada.ci.TCHENGA.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ada.ci.TCHENGA.models.JobsEntity;
import com.ada.ci.TCHENGA.repository.JobsRepository;
import com.ada.ci.TCHENGA.service.JobsService;


@Service
public class JobsImplement  implements JobsService{
	
	private final JobsRepository jobsRepository;
	
	

	public JobsImplement(JobsRepository jobsRepository) {
		super();
		this.jobsRepository = jobsRepository;
	}

	@Override
	public List<JobsEntity> findAllJobs() {
		// TODO Auto-generated method stub
		return (List<JobsEntity>) jobsRepository.findAll();
	}

	@Override
	public Optional<JobsEntity> findById(Integer id) {
		// TODO Auto-generated method stub
		return jobsRepository.findById(id);
	}

	@Override
	public JobsEntity saveJobs(JobsEntity jobsEntity) {
		// TODO Auto-generated method stub
		return jobsRepository.save(jobsEntity);
	}

	@Override
	public JobsEntity updateJobs(JobsEntity jobsEntity) {
		// TODO Auto-generated method stub
		return jobsRepository.save(jobsEntity);
	}

	@Override
	public void deleteJobs(Integer id) {
		// TODO Auto-generated method stub
		jobsRepository.deleteById(id);
	}

}
