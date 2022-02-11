package com.Phone.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Phone.bindigs.ContactForm;
import com.Phone.modal.Contact;
import com.Phone.repo.ContactRepository;
@Service
public class ContactServiceImpl implements ContactService{
	@Autowired
	ContactRepository contactRepo;
	
	public String saveContact(ContactForm form) {
		Contact entity = new Contact();
		
		BeanUtils.copyProperties(form, entity);
		
		if(entity.getContactId() != null) {
			return "Susccess";
		  }
		
		return "Failure";
	   }
	
	public List<ContactForm> viewContacts(){
		
		List<ContactForm> dataList = new ArrayList<>();
		List<Contact> findAll = contactRepo.findAll();
		
		for(Contact entity : findAll) {
			ContactForm form  = new ContactForm();
			
			BeanUtils.copyProperties(entity, form);
			dataList.add(form);
		}
		return dataList;	
	 }
	
	public ContactForm editContact(Integer contactId) {
		 Optional<Contact> findById = contactRepo.findById(contactId);
		
		 if(findById.isPresent()) {
			 Contact entity = new Contact();			 
			 ContactForm form = new ContactForm();			 
			 BeanUtils.copyProperties(entity, form);
			 
			 return form;
		 }
		return null;
		
	}
	
	public List<ContactForm> deleteContact(Integer contactId){
		contactRepo.deleteById(contactId);
		
		// geting letest data form table and returning 
		
		List<ContactForm> datalist = new ArrayList<>();
		List<Contact> findAll = contactRepo.findAll();
		for(Contact entity : findAll) {
			ContactForm form = new ContactForm();
			
			BeanUtils.copyProperties(entity, form);
			
			datalist.add(form);
			
		}
		return datalist;
		
	}

	
	
	
	
	
	

}
