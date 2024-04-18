package com.userimran.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "state_master")
public class StateEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stateId;
	
	private String stateName; 
	
	@ManyToOne
	@JoinColumn(name = "country_id")
	private CountryEntity country;
	
}
