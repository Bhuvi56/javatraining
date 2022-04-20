package com.example;
import java.util.logging.*;
public class Application {

	public static void main(String[] args) {
		
		
		Logger log = Logger.getLogger("com.example.application");
		
		log.setLevel(Level.INFO);
		
		
		log.info("info message");

		//System.out.println("info message");
		
		log.warning("warning message***********");
		
		//log.severe("severe message***************");
		
		log.fine("fine message*********");
	}

}
