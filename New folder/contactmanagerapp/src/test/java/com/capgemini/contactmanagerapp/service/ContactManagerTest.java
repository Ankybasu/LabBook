package com.capgemini.contactmanagerapp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ContactManagerTest {
	private ContactManager contManager;
	@BeforeAll
	public static void setupAll() {
		System.out.println("Should print before all testcases!");
	}
	@BeforeEach
	public void setUP() {
		System.out.println("should print before each test case");
		System.out.println("Instantitating the Contact Manager");
		contManager=new ContactManager();
	}
	@Test
	@DisplayName("Should create contact")
	public void shouldCreateContact() {

		contManager.addContact("Ankita","Basu","07449980993");
		assertFalse(contManager.getAllContacts().isEmpty());
		assertEquals(1,contManager.getAllContacts().size());
	}
	//Testing Exceptions
	@Test
	@DisplayName("should not create contact when first name is null")
	public void shouldThrowRunTimeExceptionWhenFirstNameisNull() {
		Assertions.assertThrows(RuntimeException.class,()->{
			contManager.addContact(null, "Basu", "07449980993");});
	}
	@Test
	@DisplayName("should not create contact when LAST name is null")
	public void shouldThrowRunTimeExceptionWhenLastNameisNull() {
		Assertions.assertThrows(RuntimeException.class,()->{
			contManager.addContact("Ankita", null, "07449980993");});
	}
	@Test
	@DisplayName("should not create contact when phone no is null")
	public void shouldThrowRunTimeExceptionWhenPhoneNoisNull() {
		Assertions.assertThrows(RuntimeException.class,()->{
			contManager.addContact("Ankita", "Basu", null);});
		}
	@Test
	@DisplayName("phone number should start with 0")
	public void shouldTestPhoneNoFormat() {
		Assertions.assertThrows(RuntimeException.class,()->{
			contManager.addContact("Ankita", "Basu","77449980993");});
		}
	@Nested
	class RepeatedTests{
		@DisplayName("should create contact")
		@RepeatedTest(value=5,name="Repeating contact creation test {currentRepetition} of {totalRepetition}")
		public void shouldCreateContactRepeatedly() {
				contManager.addContact("Ankita", "Basu","07449980993");
				assertFalse(contManager.getAllContacts().isEmpty());
				assertEquals(1,contManager.getAllContacts().size());
				
			}
	}
	@Nested
	class ParameterizedTests{
		@DisplayName("Phone number should match with required format")
		@ParameterizedTest
		@ValueSource(strings= {"07449980993","08420539497","09883431607"})
		public void shouldTestPNo(String phoneNumber) {
			contManager.addContact("Ankita", "Basu", "07449980993");
			assertFalse(contManager.getAllContacts().isEmpty());
			assertEquals(1,contManager.getAllContacts().size());
		}
	}
	private static List<String> phoneNoList(){
		return Arrays.asList("07449980993","08420539497","09883431607");
	}
	@DisplayName("Testing Phone numbers should match with required format using Method Source")
	@ParameterizedTest
	@MethodSource("phoneNoList")
	public void shouldTestPNoUsingPhoneNo(String phoneNumber) {
		contManager.addContact("Ankita", "Basu", "07449980993");
		assertFalse(contManager.getAllContacts().isEmpty());
		assertEquals(1,contManager.getAllContacts().size());
	}
	@Test
	@DisplayName("disable test")
	@Disabled
	public void disabledTest() {
		throw new RuntimeException("this test is a disabled test");
	}
	@AfterEach
	public void tearDown() {
		System.out.println("should execute after each test case");
	}
	@AfterAll
	public static void tearDownAll() {
		System.out.println("should execute after all the test case");
	}
}
