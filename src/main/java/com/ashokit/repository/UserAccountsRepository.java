package com.ashokit.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.UserAccounts;
import com.ashokit.model.UnlockAccount;

@Repository
public interface UserAccountsRepository extends CrudRepository<UserAccounts, Serializable> {
	
	public Optional<UserAccounts> findByEmailAndPassword(String email,String password);
	
	public Optional<UserAccounts> findByEmail(String email);

	public User getOne(String password);
	
	public UnlockAccount UnlockAccount(UnlockAccount unlockAcc);

}
