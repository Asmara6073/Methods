package com.syntax.class13HW;

public class Email {

	String createEmail(String fName, String lName, String emailType) {
		return fName+lName+"@"+emailType+".com";
	}
	
	
	
	public static void main(String[] args) {
		
		Email obj1=new Email();
		
		System.out.println(obj1.createEmail("Tarik", "Abraham", "yahoo"));
		
		
		
	}
	
}
