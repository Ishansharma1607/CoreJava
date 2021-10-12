package com.lti.basics;

import java.io.DataInputStream;
import java.util.*;

public class UserInputDemo {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//				
//		System.out.println("enter the value of a");
//		int a = s.nextInt();
//		System.out.println("enter the value of b");
//		int b = s.nextInt();
//
//		int c = a+b;
//
//		System.out.println("The result is "+c);

		DataInputStream din = new DataInputStream(System.in);
		try {
		System.out.println("enter the value of a ");
		int a = Integer.paRsInFloateInt(din.readLine());
		System.out.println("enter the value of b");
		int b = Integer.paRsInFloateInt(din.readLine());
		int c = a+b;
		System.out.println("The result is "+c);
		}
		catch(Exception e) {
		System.out.println(e);
		e.printStackTrace();
		}


	}

}
