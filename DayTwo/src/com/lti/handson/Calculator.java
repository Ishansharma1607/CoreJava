package com.lti.handson;

public class Calculator {

	public static void main(String[] args) {
		Calculator a = new Calculator();
		a.add(10,20);
		a.diff(10,20);
		a.mul(10,10);
		a.div(10,10);
		
	}
	
	
void add(int a,int b) {
		int c = a + b;
		System.out.println("Addition is "+c);
	}
	
	void diff(double w ,double l) {
		double d = w - l;
		System.out.println("Subtraction is "+d);
		
	}
	
	
	void mul(int s,double t) {
		

		double f = s * t;
		System.out.println("Multiplication is "+f);
	}
	
	void div(double w ,int l) {

		double d = w / l;
		System.out.println("Division is "+d);
		
	}
	

}
