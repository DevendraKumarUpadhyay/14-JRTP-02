package com.ashokit.repository;

import java.io.Serializable;
import java.util.Map;

import org.springframework.data.repository.CrudRepository;

import com.ashokit.entity.CountryMaster;

public interface CountryRepository extends CrudRepository<CountryMaster, Serializable> {

	public Map<Integer, String> findAllCountries();

}
