package com.capgemini.contactmanagerapp.service;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.capgemini.contactmanagerapp.model.Contact;

public class ContactManager {
	// Concurrent HAsh Map is the collection which allows us to retrieve and modify the data while iteration through the objects inside the map
 
	Map<String,Contact>contactList = new ConcurrentHashMap<String,Contact>();
 /*
  * addContact Method to add contacts in to contactListObject
  * with @param fName gets first Name of contact.
  * @param lName gets Last Name of contact.
  * @param phoNe gets the phoneNo of contact.
  * */
	public void addContact(String fName,String lName,String phoneNo) {
		Contact contact = new Contact(fName,lName,phoneNo);
		validateContact(contact);
		checkIfContactAlreadyExist(contact);
		contactList.put(generateKey(contact), contact);
	}
	/**
	 * generateKey generates the Key to store a value in HashMap
	 * 
	 * @param contact
	 * @return String
	 */
private String generateKey(Contact contact) {
		// TODO Auto-generated method stub
		return String.format("%s-%s", contact.getfName(),contact.getlName());
	}
/**
 * check if Contact already added in the list
 * 
 * @param contact
 */
private void checkIfContactAlreadyExist(Contact contact) {
		// TODO Auto-generated method stub
	if(contactList.containsKey(generateKey(contact))) {
		throw new RuntimeException();
	}
		
	}
/**
 * validateContact method ,validate the contact details using some condition  
 * @param contact
 */
private void validateContact(Contact contact) {
	// TODO Auto-generated method stub
	contact.validateFirstName();
	contact.validateLastName();
	contact.validatePhoneNo();
	
}
/**
 * @return ContactList
 * @return
 */
public Collection<Contact> getAllContacts(){
	return contactList.values();
}
	
}