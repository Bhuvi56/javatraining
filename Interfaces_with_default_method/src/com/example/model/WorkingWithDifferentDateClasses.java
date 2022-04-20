package com.example.model;

import java.util.*;
import java.sql.*;
import java.sql.Date;
import java.time.*;

public class WorkingWithDifferentDateClasses {

	public static void main(String[] args) {
		
		//WorkingWithDifferentDateClasses date = new WorkingWithDifferentDateClasses();
		java.util.Date date1 = new java.util.Date();
		
		
		//step 2 UTIL date to sql date
		java.sql.Date date2 = new java.sql.Date(date1.getTime());
		
		System.out.println(date1);
		System.out.println(date1.getTime());
		
		
       System.out.println(date2);	
       //step3 sql date to localdate
       LocalDate localDate = date2.toLocalDate();
       
       System.out.println(localDate.getDayOfWeek());
       System.out.println(localDate.getMonthValue());
       
       
       java.sql.Date sqlDate2 = java.sql.Date.valueOf(localDate);
       
       System.out.println("sql date2:= "+ sqlDate2);
		
		

	}

}
