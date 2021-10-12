package com.lti.basics;

import java.util.Scanner;

public class Q3FtoCelcius {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.print("Enter Temp In Fahrenheit  : ");
		float c = s.nextFloat();
		
		float x = (c - 32)*5/9;
				System.out.println("Fahrenheit "+c+ "   Celcius "+x);

	}

}
