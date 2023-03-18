package com.ada.ci.TCHENGA.models;

import javax.persistence.Entity;
import javax.persistence.Table;

/*
 * inherits attributes from the super class person
 * */
@Entity
@Table(name = "donor")
public class DonorEntity extends PersonEntity {

}
