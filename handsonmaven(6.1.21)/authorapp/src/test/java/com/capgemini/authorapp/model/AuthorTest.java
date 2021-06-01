/**
 * 
 */
package com.capgemini.authorapp.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



/**
 * @author ANKITA BASU
 *
 */
class AuthorTest {

	/**
	 * @throws java.lang.Exception
	 *
	 */
	static Author at;
	Author at1;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		at=new Author("Ankita","anky@gmail.com",'f');
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		at=null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		at1=new Author();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		at1=null;
	}


	/**
	 * Test method for {@link com.capgemini.authorapp.model.Author#Author()}.
	 */
	@Test
	void testAuthor() {
		assertEquals(new Author(),at1);
	}

	/**
	 * Test method for {@link com.capgemini.authorapp.model.Author#getEmail()}.
	 */
	@Test
	void testGetEmail() {
		assertEquals("anky@gmail.com",at.getEmail());
	}

	/**
	 * Test method for {@link com.capgemini.authorapp.model.Author#getGender()}.
	 */
	@Test
	void testGetGender() {
		assertEquals('f',at.getGender());
	}
	
	@Test
	void testGetName() {
		assertEquals("Ankita",at.getName());
	}
	

}
