package com.syntax.class13HW;

public class EvenOrOdd {

	
	String EvenOrOdd (int a) {
		if(a%2==0) {
			return a+" is an even number.";
		}
	
		else {
			return a+ " is an odd number";
		}
	}
	
	
	public static void main(String[] args) {
		
		
		EvenOrOdd obj1=new EvenOrOdd();
		
		System.out.println(obj1.EvenOrOdd(0));
		
	}
	
	
}
