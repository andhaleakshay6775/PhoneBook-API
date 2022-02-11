package com.Phone.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Phone.bindigs.ContactForm;
import com.Phone.service.ContactService;
@RestController
public class ContactRestController {
	@Autowired
	ContactService service;
	
	@PostMapping("/save")
public String saveContact( @RequestBody ContactForm form) {
		
		String status = service.saveContact(form);
	return status;
}
	
	@GetMapping("/contacts")
	public List<ContactForm> viewContacts() {
		return service.viewContacts();
	}
	
	@GetMapping("/edit/{contactId}")
	public ContactForm editContact( @PathVariable Integer contactId) {
		return service.editContact(contactId);
	}
	
	@DeleteMapping("/delete/{contactId}")
	public List<ContactForm> deleteContact(@PathVariable Integer contactId) {
		return service.deleteContact(contactId);
	}
	
	

}
