package com.ashokit.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.entity.Contact;
import com.ashokit.service.IContactService;

@Controller()
public class ContactInfoController {

	private IContactService service;

	public ContactInfoController(IContactService service) {
		this.service = service;
	}

	/**
	 * This method is used to display contact form
	 *
	 * @return
	 */

	@GetMapping("/load-form")
	public String loadform(Model model) {
		Contact cobj = new Contact();

		// sending data from controller to UI
		model.addAttribute("contact", cobj);

		// returning logical view name
		return "contact";
	}

	@PostMapping("/saveContact")
	public String handleSubmitBtn(Contact contact, Model model) {
		System.out.println(contact.toString());

		if (contact.getContactId() == null) {
			boolean isSaved = service.saveOrUpdateContact(contact);
			model.addAttribute("succMsg", "Contact Saved");
		} else {
			boolean isSaved = service.saveOrUpdateContact(contact);
			model.addAttribute("succMsg", "Contact Updated");
		}

		return "contact";
	}

	@GetMapping("/view-contacts")
	public String handleViewsContactHyperLink(Model model) {
		List<Contact> allContacts = service.getAllContacts();

		model.addAttribute("contacts", allContacts);

		return "contacts-display";
	}
}
