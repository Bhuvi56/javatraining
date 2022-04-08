package com.training.services;

public class StringService {
	
	
	public void stringEquals(String str1,String str2) {
		
		System.out.println("is values same:=" + str1.equals(str2));
		
		System.out.println("are they pointing to same location:="+ (str1==str2));
	}
       
	public  void stringObjectEquals() {
		
		String ram = new String("ram");
		String ramu = new String("ram");
		
		System.out.println("is value is same:="+ ram.equals(ramu));
		System.out.println("are they pointing to same location:="+ (ram==ramu));
		
	}
	
	public String usingTrim(String name) {
		System.out.println("without trim:="+name);
		System.out.println("left trim:="+name.trim());
		return name.trim();
	}
	
	public void lenghOfString(String name) {
		 //String abs =usingTrim(name);

		System.out.println("String length:="+name.trim().length());
	}
	
	public void usingSubString(String name) {
		
		System.out.println(name.substring(3));
		System.out.println(name.substring(0,3));
	
	}
	public void usingCharAtAndOfIndex(String name) {
		System.out.println("index position of:=" +name.indexOf('@'));
		System.out.println("charactor at position 3:"+name.charAt(3));
		
	}
	public void usingReplace(String str1,String  str2){
		
		System.out.println(str2.replace("bank", ".org"));
		System.out.println(str1.replace(".com", ".bhuvi"));
		
	}
	public void usingConcat(String str1,String str2) {
		//string is unchangeable
		System.out.println(str1.concat(str2));
		//string is changle
		//method 2
		StringBuilder builder = new StringBuilder(str1);
		builder.append(str2);//adding at end
		System.out.println(builder.toString());
	}
	public void usingCompareTo(String str1,String str2) {
		System.out.println(str1.compareTo(str2));
		
	}
	public void usingStringFormat( String str1,double mark) {
		String frmString = String.format("%s",str1);
		System.out.println(frmString);
		System.out.println(String.format("mark %.2f",mark));
		
	}
	public void usingStringFormat(int mark) {
		
		System.out.println(String.format("octal %o", mark));
		System.out.println(String.format("hexa decimal %1$o,2$x",mark));
		
	}
public void usingStringFormat(int mark1,int mark2) {
		
		//System.out.println(String.format("octal %o", mark));
		System.out.println(String.format("hexa decimal %1$o,%2$x",mark1,mark2));
		
}
public void usingStringFormat(String str1,String str2) {
	
	//System.out.println(String.format("octal %o", mark));
	System.out.println(String.format("%1$s,%2$S",str1,str2));
	

	
}
public void usingStringFormat(long value) {
	
	//System.out.println(String.format("octal %o", mark));
	System.out.println(String.format(String.format("%+d",value)));
	
}}
