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
@Table(name="CITY")
public class CityMaster {
	
	@Id
	@GeneratedValue
    @Column(name="CITY_ID")
	private Integer cityId;
	
	@ManyToOne
	@JoinColumn(name="FK_STATE_ID")
	private Integer stateId;
	
	@Column(name="CITY_NAME")
	private String cityName;

}