package com.syntax.class13HW;

public class Student {
	
	
	String getGrade(int score) {
	
		if(score>90&&score<=100) {
			return "You got an A";
		}else if(score>80 && score<=90) {
			return "You got a B";
		}else if(score>70 && score <=80) {
			return "You got a C";
		}else if(score >50 && score<=70) {
			return "You got a D";
		}else if(score >0&&score<=50) {
			return "You got a F";
		}else {
			return "Invalid Input";
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		Student student1=new Student();
		
		System.out.println(student1.getGrade(78));
		
		
		
	}
}
