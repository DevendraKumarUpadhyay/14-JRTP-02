package com.ashokit.model;

import lombok.Data;

@Data
public class UnlockAccount {
	
	public String temporaryPassword;
	public String password;
	public String confirmPassword;

}