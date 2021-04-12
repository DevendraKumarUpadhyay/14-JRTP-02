package com.ashokit.service;


import java.util.Map;
import java.util.Optional;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.ashokit.entity.UserAccounts;
import com.ashokit.model.UnlockAccount;
import com.ashokit.repository.CityRepository;
import com.ashokit.repository.CountryRepository;
import com.ashokit.repository.StateRepository;
import com.ashokit.repository.UserAccountsRepository;

@Service
public class RegistrationServiceImpl implements IRegistrationService {
	
	private UserAccountsRepository userAccRepository;
	private CountryRepository countryRepository;
	private StateRepository stateRepository;
	private CityRepository cityRepository;
	
	public RegistrationServiceImpl(UserAccountsRepository userAccRepository, CountryRepository countryRepository,
			StateRepository stateRepository, CityRepository cityRepository) {
		this.userAccRepository = userAccRepository;
		this.countryRepository = countryRepository;
		this.stateRepository = stateRepository;
		this.cityRepository = cityRepository;
	}

	@Override
	public String loginCheck(String email, String password) {
	Optional<UserAccounts> user = userAccRepository.findByEmailAndPassword(email, password);
	
	if (user.isPresent()) {
		return "Welcome to Ashok IT.....";
	}
	return "login failed";
	}

	@Override
	public Map<Integer, String> getCountries() {
		return countryRepository.findAllCountries();
	}

	@Override
	public Map<Integer, String> getStates(Integer countryId) {
		Integer country_id = null;
		return stateRepository.findAllStates(country_id);
	}

	@Override
	public Map<Integer, String> getCities(Integer stateId) {
		Integer city_id = null;
		return cityRepository.getAllCity(city_id);
	}

	@Override
	public UserAccounts getUserAccountsByEmail(String email) {
		Optional<UserAccounts> findByEmail = userAccRepository.findByEmail(email);

		if (findByEmail.isPresent()) {
			return findByEmail.get();
		}
		return null;
	}

	@Override
	public Boolean saveUser(UserAccounts userAccs) {
		UserAccounts savedObj = userAccRepository.save(userAccs);
		return savedObj.getRegistrationId() != null;
	}

	@Override
	public Boolean unlockAccount(UnlockAccount unlockAcc) {
		UnlockAccount unlockAccount=userAccRepository.UnlockAccount(unlockAcc);
		if(unlockAccount != null) {
			return true;
		}
		return false;
	}

	@Override
	public Boolean forgotPassword(String email) {
		User one=userAccRepository.getOne(email);
		if(one != null) {
			return true;
		}
		return false;
	}

}