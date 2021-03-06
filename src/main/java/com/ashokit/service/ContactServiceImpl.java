package com.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ashokit.entity.Contact;
import com.ashokit.repository.ContactRepository;

@Service
public class ContactServiceImpl implements IContactService {

	private ContactRepository repository;

	public ContactServiceImpl(ContactRepository repository) {
		this.repository = repository;
	}

	@Override
	public Boolean saveOrUpdateContact(Contact contact) {
		Contact savedObj = repository.save(contact);

		/*if(savedObj.getContactId() != null) {
			  return true; 
		}else { 
			  return false; 
		}*/

		// return (savedObj.getContactId() != null) ? true : false;

		return savedObj.getContactId() != null;
	}

	@Override
	public List<Contact> getAllContacts() {
		/*List<Contact> findAll = (List<Contact>) repository.findAll();
		return findAll;*/
		return (List<Contact>) repository.findAll();
	}

	@Override
	public Contact getContactById(Integer contactId) {
		Optional<Contact> findById = repository.findById(contactId);

		if (findById.isPresent()) {
			return findById.get();
		}

		return null;
	}

	@Override
	public Boolean deleteContactById(Integer contactId) {
		boolean isDeleted = false;
		try {
			repository.deleteById(contactId);
			isDeleted = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isDeleted;
	}

}
