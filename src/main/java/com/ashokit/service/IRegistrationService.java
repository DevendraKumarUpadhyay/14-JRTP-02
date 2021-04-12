package com.ashokit.service;

import java.util.Map;

import com.ashokit.entity.UserAccounts;
import com.ashokit.model.UnlockAccount;

public interface IRegistrationService {
	
	public String loginCheck(String email,String password);
	
	public Map<Integer, String> getCountries();
	
	public Map<Integer, String> getStates(Integer countryId);
	
	public Map<Integer, String> getCities(Integer stateId);
	
	public UserAccounts getUserAccountsByEmail(String email);

	public Boolean saveUser(UserAccounts userAccs);
	
	public Boolean unlockAccount(UnlockAccount unlockAcc);
	
	public Boolean forgotPassword(String email);
	
}
