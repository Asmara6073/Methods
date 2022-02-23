package com.syntax.class13HW;

public class PrimeMethod {
	
	// prime number has to be more than one
	// prime number cannot be divided evenly by 2
	
 String primeOrNot(int a) {
	String result="";
	if(a>1) {
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				result=a+" is not a prime number";
				break;
			} result=a +" is a prime number";
		}
	}else {
	result=a+" is not a prime number";
	}
	return result;
}
	
public static void main(String[] args) {
	
	PrimeMethod obj1=new PrimeMethod();
	
	System.out.println(obj1.primeOrNot(49));

	
	
	
	
}






}

