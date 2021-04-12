package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="STATE")
public class StateMaster {
	
	@Id
	@GeneratedValue
	@Column(name="STATE_ID")
	private Integer stateId;
	
	@ManyToOne
	@JoinColumn(name="FK_COUNTRY_ID")
	private Integer countryId;
	
	@Column(name="STATE_NAME")
	private String stateName;

}
