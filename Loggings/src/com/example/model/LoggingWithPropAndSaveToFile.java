package com.example.model;

import java.io.IOException;
import java.util.logging.FileHandler;

public class LoggingWithPropAndSaveToFile {
	
	public static void main(String[] args) {
		
		String file	= LoggingWithPropFile.class.getClassLoader()
				.getResource("logging.properties").getFile();
		
		System.out.println(file);
		
		System.setProperty("logging properties done right", file);
		
	
	     FileHandler handler;
		try {
			handler = new FileHandler("logs2.log");
			
			  Book.log.addHandler(handler);
				
			     
			     Book.log.info("logging properties done right");
				Book java = new Book();

				Book.log.info(java.toString());
				
				
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
		
	}}


