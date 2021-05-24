package com.capgemini.contactmanager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class RegisterUserTest {
public static RegisterUser ct;

@BeforeAll
public static void setUp() {
	System.out.println("this method is annoted with @BeforeAll"
			+ " to execute as first method in the test class ContactTest");
ct = new RegisterUser("Rama","Krishna","0987654234","Rama_kr-ish","123456789");
}

@BeforeEach
public void setUpForTest() {
	System.out.println("this method is annoted with @BeforeEach"
			+ "to execute before each test case");
}

//we are testing constructor
@Test
public void testContact() {
	RegisterUser ct = new RegisterUser("Rama","Krishna","0987654234","Rama_kr-ish","123456789");
	assertNotNull(ct);
	Contact ctOne = null;
	assertNull(ctOne);
}

@Test
public void testGetters() {
	assertEquals("Rama", ct.getFirstName());
	assertEquals("Krishna", ct.getLastName());
	assertEquals("0987654234", ct.getMobileNo());
	assertNotEquals("987642346o", ct.getMobileNo());
	assertEquals("Rama_kr-ish",ct.getUserName());
	assertEquals("123456789",ct.getPassword());
}

@Test
public void testValidateFirstName() {
	assertSame("First Name is valid", ct.validateFirstName(ct.getFirstName()));
	assertNotSame(null, ct.validateFirstName(ct.getFirstName()));
}

@Test
public void testValidateLastName() {
	//ct = new Contact("Rama","Krishna","0987654234");
	assertSame("Last Name is valid", ct.validateLastName(ct.getLastName()));
	assertNotSame(null, ct.validateLastName(ct.getLastName()));
}

@Test
public void testValidateMobileNo() {
	//ct = new Contact("Rama","Krishna","0987654234");
	assertNotSame("mobileNo cannot be less than 10 digits", ct.validateMobileNo(ct.getMobileNo()));
	assertNotSame(null, ct.validateMobileNo(ct.getMobileNo()));
	assertNotSame("mobileNo can contain only digits", ct.validateMobileNo(ct.getMobileNo()));
	assertNotSame("mobileNo should start with 0", ct.validateMobileNo(ct.getMobileNo()));
	assertSame("Mobile number is valid",  ct.validateMobileNo(ct.getMobileNo()));
	assertSame("mobileNo can contain only digits",  ct.validateMobileNo("s123456780"));
	assertSame("mobileNo should start with 0",  ct.validateMobileNo("9075468967"));
}

@Test
public void testDisplayDetails() {
	assertEquals(new String("The details of the contact is = Rama Krishna 0987654234 123456789 Rama_kr-ish"),ct.displayDetails());
	assertNotEquals(new String("The details of the contact is = Shiva Rama 0987654234 Rama_kr-ish 123456789"), ct.displayDetails());
}

@Test
void testValidatePassword() {
	assertSame("password valid",ct.validatePassword(ct.getMobileNo()));
	assertNotSame("password not valid",ct.validatePassword("123456789"));
}

@Test
void testValidateUserName() {
	assertSame("valid username",ct.validateUserName(ct.getUserName()));
}

@AfterEach
public void stopThis() {
	System.out.println("this method is annoted with @AfterEach"
			+ "to execute after each test case");
}

@AfterAll
public static void stopAll() {
	System.out.println("this method is annoted with @AfterAll"
			+ " to execute as last method in the test class ContactTest");
	ct = null;//now after assigning ct object to null it is eligible for removing from the memory
}
}
