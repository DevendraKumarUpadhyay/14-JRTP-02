package com.ashokit.entity;

import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="REGISTRATION")
public class UserAccounts {
	
	@Id
	@GeneratedValue
	@Column(name="REGISTRATION_ID")
	private Integer registrationId;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PHONE_NUMBER")
	private Long phoneNumber;
	
	@Column(name="DOB")
	private String dob;
	
	@Column(name="GENDER")
	private String gender;
	
	@Column(name="COUNTRY")
	private String country;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="ACCOUNT_STATUS")
	private Boolean status;

	

}