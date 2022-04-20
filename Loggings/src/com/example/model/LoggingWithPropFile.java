package com.example.model;
public class LoggingWithPropFile {

	public static void main(String[] args) {
		
	String file	= LoggingWithPropFile.class.getClassLoader()
			.getResource("logging.properties").getFile();
	
	System.out.println(file);
	
	System.setProperty("logging properties done right", file);
	
//	Book.log.info("logging properties done right");
     
	
	Book java = new Book();

	Book.log.info(java.toString());
	}

}
