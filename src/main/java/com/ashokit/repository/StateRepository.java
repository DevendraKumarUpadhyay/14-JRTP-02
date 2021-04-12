package com.ashokit.repository;

import java.io.Serializable;
import java.util.Map;

import org.springframework.data.repository.CrudRepository;

import com.ashokit.entity.StateMaster;

public interface StateRepository extends CrudRepository<StateMaster, Serializable> {

	public Map<Integer, String> findAllStates(Integer country_id);

}
