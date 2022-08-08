package org.example;


import org.example.services.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;


public class ProductServiceTest {
	
	ProductService service =null;
	@BeforeEach
	void init() {
		service= new ProductService();
	}
	
	@DisplayName(value = "Test findDiscount method returns 0.20 or above for tv and laptop")
	@Test
	void testFindDiscountCaseOne() {
		
		double actual=service.findDiscount("tv");
		assertThat(actual,is(greaterThan(0.19)));
	}

	
	@DisplayName(value = "Test findDiscount method returns 0.30 or above for fridge and washing machine")
	@Test
	void testFindDiscountCaseTwo() {
		
		double actual=service.findDiscount("fridge");
		assertThat(actual,is(lessThan(0.19)));
	}
	
	@DisplayName(value = "Test findProducts method returns a list of four brands")
	@Test
	void testFindProductListLength() {
		
		int actual=service.getListItem().length;
		int expected = 4;
		assertThat(actual, is(equalTo(expected)));		
	}
	
	@DisplayName(value = "Test findProducts should return dell, lenova,hp,asus")
	@Test
	
	void testFindProductListName() {
		String[] actual=service.getListItem();
		assertThat(actual, is(arrayContaining("Dell","Lenova","Hp","Asus")));
	}
	
	

}
