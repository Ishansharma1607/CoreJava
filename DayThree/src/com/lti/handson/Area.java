package com.lti.handson;

import java.util.Scanner;

import com.lti.handson.Area.circle;

public class Area {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Radius");
		float r = s.nextFloat();
		Circle a = new Circle();
		a.area(r);
		a.circum(r);
	}

	
	interface circle{
		float pi = 3.14f;
		void area(float r);
		void circum(float r);
	}	
	
}

class Circle implements circle{
	 
	public void area(float r) {
	float area = pi*r*r;
	System.out.println("Area "+area);
			}
	public void circum(float r) {
		float circum = 2*pi*r;
		System.out.println("Circum "+circum);
			}		

}