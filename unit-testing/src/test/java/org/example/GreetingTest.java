package org.example;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreetingTest {
	
	@Test
	@DisplayName(value = "test the get message return a string of length 8 characters")
	void testMaxLength() {
		Greeting grtObj= new Greeting() ;
		
		int actual= grtObj.getMessage().length();
		int expected =5;
		assertEquals(expected, actual);
		
	}
	
	
	@Test
	@DisplayName(value = "test the birthday wish doesnot  return null")
	void testBirthDayWish() {
		
		Greeting grtObj= new Greeting();
		String actual= grtObj.birthdayWish("ramesh");
		assertNotNull( actual);
	}
	
	@Test
	@DisplayName(value = "test the birthday wish method should return happy birthday with user name suffixed")
	void testBirthDayWishReturnValue() {
		
		Greeting grtObj1= new Greeting();
		String arg="Ramesh";
		String actual= grtObj1.birthdayWishReturnValue(arg);
		String expected ="Happy Birthday" + arg;
		assertEquals(expected, actual);
	}
	

}
