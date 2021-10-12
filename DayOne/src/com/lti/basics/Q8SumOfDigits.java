package com.lti.basics;

import java.util.Scanner;

public class Q8SumOfDigits {

	public static void main(String[] args) {

		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a number to do sum");
		int number = s.nextInt();
		int digit, sum = 0;  
	  
		while(number > 0)  
		{  
		//finds the last digit of the given number    
		digit = number % 10;  
		//adds last digit to the variable sum  
		sum = sum + digit;  
		//removes the last digit from the number  
		number = number / 10;  
		}  
		//prints the result  
		System.out.println("Sum of Digits: "+sum);  

	}

}
