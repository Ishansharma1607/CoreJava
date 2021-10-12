package com.lti.exception;

public class AgeException extends Exception {
	int age;
	
	public AgeException(int age) {
		
		System.out.println("Age Should be Greater than 1 or less than 100 "+age);
	}
	
//	public String toString() {
//		if(age<1 || age>100) {
//		return "Age is not valid";
//		}else {
//		return "Age is valid";
//			  }
//		}

}
