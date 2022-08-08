package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import javax.persistence.EntityNotFoundException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.CabDriver;
import com.example.demo.services.CabDriverService;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class TestServiceLayerApplicationTests {

	@Autowired
	CabDriverService service;
	
	
    @BeforeAll
    void setUp() {
        CabDriver driver = new CabDriver(450,"Raj",68686,"chennai",LocalDate.of(2000,10, 12),3.4);
        
    
            service.save(driver);
    }

	@Test
	@DisplayName("findall method should return empty array")
	void TestFindAllFailure() {
        
		assertTrue(service.findAll().isEmpty());

	}
	
	@Test
	@DisplayName("findall method should return an array")
	void TestFindAll() {
        
		assertFalse(service.findAll().isEmpty());

	}
	
    @Test
	@DisplayName("findby id method should return an element with the given id")
    void testFindById() {

    	CabDriver driver = service.findById(450).orElseThrow(EntityNotFoundException::new);
//         assertEquals("Raj",service.findById(450).get().getDriverName());
    	
    	assertEquals("Raj", driver.getDriverName());
    }


}
