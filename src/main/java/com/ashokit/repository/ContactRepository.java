package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Serializable> {

}
