package com.capgemini.authorapp.service;

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



public class AuthorServiceTest {
	private AuthorService authorService;
	@BeforeAll
	public static void setupAll() {
		System.out.println("Should print before all testcases!");
	}
	@BeforeEach
	public void setUP() {
		System.out.println("should print before each test case");
		System.out.println("Instantitating the Author Service");
		authorService=new AuthorService();
	}
	@Test
	@DisplayName("Should create author")
	public void shouldCreateContact() {

		authorService.addAuthor("Ankita","anky@gmail.com",'f');
		assertFalse(authorService.getAllAuthors().isEmpty());
		assertEquals(1,authorService.getAllAuthors().size());
	}
	//Testing Exceptions
	@Test
	@DisplayName("should not create author when name is null")
	public void shouldThrowRunTimeExceptionWhenNameisNull() {
		Assertions.assertThrows(RuntimeException.class,()->{
			authorService.addAuthor(null, "anky@gmail.com", 'f');});
	}

	@Test
	@DisplayName("should not create author when email does not contain @")
	public void shouldThrowRunTimeExceptionWhenEmailInvalid() {
		Assertions.assertThrows(RuntimeException.class,()->{
			authorService.addAuthor("Ankita", "anky.com", 'f');});
	}

	@Nested
	class RepeatedTests{
		@DisplayName("should create author")
		@RepeatedTest(value=5,name="Repeating author creation test {currentRepetition} of {totalRepetition}")
		public void shouldCreateAuthorRepeatedly() {
			authorService.addAuthor("Ankita", "anky@gmail.com",'f');
			assertFalse(authorService.getAllAuthors().isEmpty());
			assertEquals(1,authorService.getAllAuthors().size());

		}
	}
	private static List<String> emailList(){
		return Arrays.asList("anky@gmail.com","sanabasu@yahoo.in","basuanky@gmail.com");
	}
	@DisplayName("Testing emails should match with required format using Method Source")
	@ParameterizedTest
	@MethodSource("emailList")
	public void shouldTestUsingEmail(String phoneNumber) {
		authorService.addAuthor("Ankita", "anky@gmail.com", 'f');
		assertFalse(authorService.getAllAuthors().isEmpty());
		assertEquals(1,authorService.getAllAuthors().size());
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
