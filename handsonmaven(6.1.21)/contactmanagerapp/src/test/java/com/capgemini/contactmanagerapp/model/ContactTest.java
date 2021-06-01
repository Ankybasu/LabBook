/**
 * 
 */
package com.capgemini.contactmanagerapp.model;

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
class ContactTest {

	/**
	 * @throws java.lang.Exception
	 */
	static Contact cont;
	Contact cont1;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cont=new Contact("Ankita","Basu","07449980993");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		cont=null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		cont1=new Contact();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		cont1=null;
	}



	/**
	 * Test method for {@link com.capgemini.contactmanagerapp.model.Contact#Contact()}.
	 */
	@Test
	void testContact() {
		assertEquals(new Contact(),cont1);
	}


	/**
	 * Test method for {@link com.capgemini.contactmanagerapp.model.Contact#getfName()}.
	 */
	@Test
	void testGetfName() {
		assertEquals("Ankita",cont.getfName());
	}

	/**
	 * Test method for {@link com.capgemini.contactmanagerapp.model.Contact#getlName()}.
	 */
	@Test
	void testGetlName() {
		assertEquals("Basu",cont.getlName());
	}


	/**
	 * Test method for {@link com.capgemini.contactmanagerapp.model.Contact#getPhoneNo()}.
	 */
	@Test
	void testGetPhoneNo() {
		assertEquals("07449980993",cont.getPhoneNo());
	}


}
