package com.example.demo;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import  org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.hamcrest.Matchers.hasSize;
import com.example.demo.entity.CabDriver;
import com.example.demo.services.CabDriverService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;


import static org.hamcrest.CoreMatchers.*;
import static org.mockito.BDDMockito.*;




@AutoConfigureMockMvc
@TestInstance(Lifecycle.PER_CLASS)
@SpringBootTest
public class CabDriverTest {
	
	
	@Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper mapper;
    
    @MockBean
    CabDriverService service;
    
    private   CabDriver raj;
    private   CabDriver bala;
    private   CabDriver arul;
    
    @BeforeAll
    void init() {
         raj = new CabDriver(450,"Raj",68686,"chennai",LocalDate.of(2000,10, 12),3.4);
         bala = new CabDriver(451,"bala",68686,"selam",LocalDate.of(2000,10, 12),3.0);
         arul = new CabDriver(451,"arul",68686,"tvm",LocalDate.of(2000,10, 12),3.9);
    
     
    }
   

	
	@DisplayName("test find all method return a array")
	@Test
	void testFindAll() throws Exception{
		
		List<CabDriver> list= new ArrayList<>();
		list.add(raj);
		list.add(bala);
		list.add(arul);
		
		 given(service.findAll()).willReturn(list);

		mockMvc.perform(MockMvcRequestBuilders
                .get("/api/v1/drivers")
               .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(3)))
                .andExpect(jsonPath("$[1].driverName",is("bala")));
    }
	
	

	@DisplayName("test add method return status code 201 and return element added")
	@Test
	void testAdd()throws Exception{
	
		CabDriver  raj = new CabDriver(450,"Raj",68686,"chennai",LocalDate.of(2000,10, 12),3.4);
	 
		given(service.save(raj)).willReturn(raj);
       
		mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/drivers")
            .contentType(MediaType.APPLICATION_JSON)
            .content(asJsonString(raj)))
            .andExpect(status().isCreated())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.driverName", is("Raj")));     

}
	
	public static String asJsonString(CabDriver obj) {
		try {
		ObjectMapper objectMapper = new ObjectMapper();
		
		
		return objectMapper.writeValueAsString(obj);
		} catch(Exception e) {
		throw new RuntimeException(e);
		}
		}
	
	 
	@Test
	@DisplayName("Checking findById method")
	void testFindById() throws  Exception{
		
		Optional<CabDriver> item =Optional.of(raj);
		
		given(service.findById(450)).willReturn(item);
		
		mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/drivers/450"))
		.andExpect(jsonPath("$.driverName", is("Raj")));
		}


	}


