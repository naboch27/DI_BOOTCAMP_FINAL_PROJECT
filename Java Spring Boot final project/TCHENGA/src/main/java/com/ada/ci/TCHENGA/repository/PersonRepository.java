package com.ada.ci.TCHENGA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ada.ci.TCHENGA.models.PersonEntity;


public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {

}
