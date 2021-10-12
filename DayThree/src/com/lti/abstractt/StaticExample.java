package com.lti.abstractt;

public class StaticExample{

public static void main(String[] args) {
	System.out.println("Main Method");
	A a = new A();
	a.display();
	A.show();
	check();
	check2();
	}

	static void check() {
	System.out.println("Static method in Main class");
	}
	static {
	System.out.println("Static block in main");
	}
	static {
		System.out.println("Static block2 in main");
		}
	static void check2() {
		System.out.println("Static method2 in Main class");
		}
	
}
	
	class A{
		A(){
			System.out.println("constructor");
			}
	void display() {
	System.out.println("Non Static Method in class A");
	}
	static void show() {
	System.out.println("static method in class A");
	}
	
	{
		System.out.println("Anon Block");
	}
	
	
	
	}

	
	