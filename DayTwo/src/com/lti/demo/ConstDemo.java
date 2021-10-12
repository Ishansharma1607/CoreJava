package com.lti.demo;

public class ConstDemo {

	public static void main(String[] args) {
		Employee b = new Employee("Ishan", 23);
		Employee b1 = new Employee("aaa", 30," aaaa");
		Employee b2 = new Employee("aaa", 30, 84947749);
	}

}


class Employee{
//String name;
//int age;
//int age1;

Employee(String name , int age){
	//this.name= name; //assigning to instance variable
//	this.age = age;
	//age1 = age;
System.out.println("Name "+name);
System.out.println("Age "+age);

}


Employee(String name,int age,String NetEmployeeing){
System.out.println("Name "+name);
System.out.println("Age "+age);
System.out.println("NetEmployeeing"+NetEmployeeing);
}


Employee(String name,int age,long DebitCard){
System.out.println("Name "+name);
System.out.println("Age "+age);
System.out.println("Debit Card "+DebitCard);
}

Employee(String name,int age,long DebitCard,String CreditCard,String NetEmployeeing){
System.out.println("Name "+ name);
System.out.println("Age "+ age);
System.out.println("Debit Card"+DebitCard);
System.out.println("Credit Card"+CreditCard);
System.out.println("NetEmployeeing"+NetEmployeeing);

}


void display() {
	System.out.println("Name "+name);
	System.out.println("Age "+age);
}

}