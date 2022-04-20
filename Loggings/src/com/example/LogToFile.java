package com.example;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class LogToFile {

	public static void main(String[] args) {
		
		
		
		Logger log = Logger.getLogger(LogToFile.class.getName());
		
		try {
			FileHandler handler = new FileHandler("logs.log");
			log.addHandler(handler);
			log.info("try block called");
			
			throw new Exception("b is a great programmer");
		} catch (SecurityException e) {
			
			log.warning(e.getMessage());
		} catch (IOException e) {
			
			log.warning(e.getMessage());
		}catch(Exception e) {
			log.warning(e.getMessage());
		}
		
		// TODO Auto-generated method stub

	}

}
