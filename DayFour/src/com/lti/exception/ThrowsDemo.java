package com.lti.exception;

import java.io.DataInputStream;
import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) throws IOException,ArithmeticException,NumberFormatException,Exception {
		// TODO Auto-generated method stub
		DataInputStream din = new DataInputStream(System.in);
	
		System.out.println("enter the value of a ");
		int a = Integer.parseInt(din.readLine());
		System.out.println("enter the value of b");
		int b = Integer.parseInt(din.readLine());
		int c = a/b;
		System.out.println("The result is "+c);
	

}
}
