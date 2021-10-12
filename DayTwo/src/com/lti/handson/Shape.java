package com.lti.handson;

public class Shape {

	public static void main(String[] args) {

		Shape a = new Shape();
		a.area(10f, 20f);
		a.area(10f);
		a.perimeter(10f);
		a.perimeter(10f,20f);
		

	}
	
	void area(float a) {
		
		
		float c = a * a;
		System.out.println("Area Of Square is "+c);
	}
	
	void area(float w ,float l) {

		float d = w * l;
		System.out.println("Area Of Rectangle is "+d);
		
	}
	
	
	void perimeter(float s) {
		

		float f = 4 * s;
		System.out.println("Perimeter Of Square is "+f);
	}
	
	void perimeter(float w ,float l) {

		float d = 2*(w + l);
		System.out.println("Perimeter Of Rectangle is "+d);
		
	}
	

}
