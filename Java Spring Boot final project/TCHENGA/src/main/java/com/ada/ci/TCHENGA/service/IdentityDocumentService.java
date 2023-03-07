package com.ada.ci.TCHENGA.service;

import java.util.List;
import java.util.Optional;

import com.ada.ci.TCHENGA.models.IdentityDocumentEntity;

public interface IdentityDocumentService {
	
    public List<IdentityDocumentEntity> findAllIdentityDocument();
	
	public Optional<IdentityDocumentEntity> findById(Integer id);
	
	public IdentityDocumentEntity saveIdentityDocument(IdentityDocumentEntity identityDocumentEntity);
	
	public IdentityDocumentEntity updateIdentityDocument(IdentityDocumentEntity identityDocumentEntity);
	
	public void deleteIdentityDocument(Integer id);

}
