package com.lti.demo;

public class AssociationDemo {

	public static void main(String[] args) {
		Ford d = new Ford();
		d.carInfo();
		d.property();
		

	}

}

class Car{
	String color ="Red \n";
	int maxSpeed = 140;
	void carInfo() {
		System.out.println("Color " +color+"Max Speed "+maxSpeed);
	}
}

class Ford extends Car{//Is-A
	void property() {
		Engine e = new Engine(); //composition
		e.start();
		Sunroof s = new Sunroof(); //aggregation
		s.openroof();
	}
}

class Engine{//Has-A
	void start() {
		System.out.println("Engine STarted");
	}
	void stop() {
		System.out.println("Engine Stop");
	}
	
}

class Sunroof{
	void openroof() {
		System.out.println("Roof Opened");
	}
	void closeroof() {
		System.out.println("Roof Closed");
	}
}
