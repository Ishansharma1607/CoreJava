package com.lti.demo;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Applicationform a1 = new Applicationform();
		a1.getData();
		a1.showData();

	}

}


class Applicationform{
	String name;
	long phno;
	String DOB;
	
	void getData() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The NAme");
		name = s.next();
		System.out.println("Enter The Ph No");
		phno = s.nextLong();
		System.out.println("Enter DOB");
		DOB = s.next();
		
	}
	void showData() {
		
		System.out.println("Name "+name);
		System.out.println("Ph no "+phno);
		System.out.println("DOB "+DOB);
	}
	
}