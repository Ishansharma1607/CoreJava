package com.lti.exception;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) throws NumberFormatException,AgeException,Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = s.nextInt();
		if(age<1 || age>100) {
			throw new AgeException(age);
		}else {
			System.out.println("Age Is valid"+age);
		}

		}
;
		}