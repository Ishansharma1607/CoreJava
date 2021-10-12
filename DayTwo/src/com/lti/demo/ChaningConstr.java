package com.lti.demo;

public class ChaningConstr {

	public static void main(String[] args) {
		A a = new A("Peter");
		A a1 = new A("Peter",30);

		}

		}
		class A{

		A( ){

		System.out.println("Default Constructor");

		}

		A(String name){
		this("Peter123",22);
		System.out.println("Name "+name);

		}

		A(String name,int age){
			this();
		System.out.println("Name "+name);
		System.out.println("Age "+age);

		}

		}