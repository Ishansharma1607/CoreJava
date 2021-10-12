package com.lti.demo;

public class MethodOverriding {

	public static void main(String[] args) {
		Child c = new Child();
		c.show();

	}

}

class Parent{
	int a;
	int b;
	
	Parent() {
		System.out.println("Super class default Constructor");
	}
	
	public Parent(int a,int b) {
		this.a= a;
		this.b = b;
		System.out.println("Super class Paramaterized Constructor");
	}
	
void show() {
	System.out.println("Super class method "+a+" "+b);
	}
}

class Child extends Parent{
	Child(){
		super(5,6); //super class method invoke
		System.out.println("Sub class Constructor");
	}
void show() {
	super.show(); //super class method invoke
	System.out.println(super.a);
	System.out.println("Sub class Method");
	}
}