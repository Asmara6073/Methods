package com.syntax.class13HW;

public class HwTask1 {
  
	// create a method that will take 2 parameters as numbers and prints which number is larger
	
	String largestNum(int a, int b) {
		if(a>b) {
			return a+" is the largest number";
		}else if (a==b) {
			return a+ " and "+b+" are equal to each other";
		}else {
			return b+" is the largest number";
		}
	}
	
	
	public static void main(String[] args) {
		
		
		HwTask1 obj1=new HwTask1();
		
		System.out.println(obj1.largestNum(8, 8));
		
		
	}
	
}
