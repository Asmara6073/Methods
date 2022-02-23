package com.syntax.class13HW;

public class SayHello {

	
	String Hello (String country) {
		switch(country) {
		
		case "America":
			return "Hello";
		case "Turkey":
			return "Merhaba";
		case "Italy":
			return "Ciao";
		case "France":
			return "Bonjour";
		default:
			return "I'm not sure how they say hello in that language";
		
		}
		
	}
	
	public static void main(String[] args) {
		
		
		SayHello obj1= new SayHello();
		
		System.out.println(obj1.Hello("Italy"));
	}
	
	
		
}
