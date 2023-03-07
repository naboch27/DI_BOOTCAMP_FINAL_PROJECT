package com.ada.ci.TCHENGA.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ada.ci.TCHENGA.models.IdentityDocumentEntity;
import com.ada.ci.TCHENGA.repository.IdentityDocumentRepository;
import com.ada.ci.TCHENGA.service.IdentityDocumentService;


@Service
public class IdentityDocumentImplement implements IdentityDocumentService{
	
	private final IdentityDocumentRepository identitydocumentRepository;
	
	

	public IdentityDocumentImplement(IdentityDocumentRepository identitydocumentRepository) {
		super();
		this.identitydocumentRepository = identitydocumentRepository;
	}

	@Override
	public List<IdentityDocumentEntity> findAllIdentityDocument() {
		// TODO Auto-generated method stub
		return (List<IdentityDocumentEntity>) identitydocumentRepository.findAll();
	}

	@Override
	public Optional<IdentityDocumentEntity> findById(Integer id) {
		// TODO Auto-generated method stub
		return identitydocumentRepository.findById(id);
	}

	@Override
	public IdentityDocumentEntity saveIdentityDocument(IdentityDocumentEntity identityDocumentEntity) {
		// TODO Auto-generated method stub
		return identitydocumentRepository.save(identityDocumentEntity);
	}

	@Override
	public IdentityDocumentEntity updateIdentityDocument(IdentityDocumentEntity identityDocumentEntity) {
		// TODO Auto-generated method stub
		return identitydocumentRepository.save(identityDocumentEntity);
	}

	@Override
	public void deleteIdentityDocument(Integer id) {
		// TODO Auto-generated method stub
		
		identitydocumentRepository.deleteById(id);
		
	}

}
