package com.capgemini.authorapp.service;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.capgemini.authorapp.model.Author;
public class AuthorService {

	// Concurrent HAsh Map is the collection which allows us to retrieve and modify the data while iteration through the objects inside the map

	Map<String,Author> authorList = new ConcurrentHashMap<String,Author>();
	/*
	 * addContact Method to add authors in to authorListObject
	 * with @param name gets Name of author
	 * @param email gets email of contact.
	 * @param gender gets the gender of author.
	 * */
	public void addAuthor(String name,String email,char gender) {
		Author author = new Author(name,email,gender);
		validateAuthor(author);
		checkIfAuthorAlreadyExist(author);
		authorList.put(name, author);
	}


	/**
	 * check if Author already added in the list
	 * 
	 * @param contact
	 */
	private void checkIfAuthorAlreadyExist(Author author) {
		// TODO Auto-generated method stub
		if(authorList.containsKey(author.getName())) {
			throw new RuntimeException();
		}

	}

	/**
	 * validateContact method ,validate the author details using some condition  
	 * @param author
	 */
	private void validateAuthor(Author author) {
		// TODO Auto-generated method stub
		author.validateEmail();
		author.validateGender();
		author.validateName();

	}
	/**
	 * @return AuthorList
	 * @return
	 */
	public Collection<Author> getAllAuthors(){
		return authorList.values();
	}

}
