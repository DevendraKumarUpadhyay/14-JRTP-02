package com.ashokit.service;

import java.util.List;

import com.ashokit.entity.Contact;

public interface IContactService {
	
	public Boolean saveOrUpdateContact(Contact contact);
	
	public List<Contact> getAllContacts();
	
	public Contact getContactById(Integer contactId);
	
	public Boolean deleteContactById(Integer contactId);
	
}