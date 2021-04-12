package com.ashokit.repository;

import java.io.Serializable;
import java.util.Map;

import org.springframework.data.repository.CrudRepository;

import com.ashokit.entity.CityMaster;

public interface CityRepository extends CrudRepository<CityMaster, Serializable> {

	public Map<Integer, String> getAllCity(Integer city_id);

}
