package com.lti.handson;

import java.util.Scanner;

public class Emp {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Designation");
		String des = s.next();
		
		if(des.contains("ager"))
		{
			System.out.println("Enter Manager Data ::");
			Manager m = new Manager();
			m.salary();
			m.Loan();
			m.Allowance();
		}
		
		
		else if(des.contains("igner"))
		{
		
		System.out.println("Enter Designer Data ::");
		Designer d = new Designer();
		d.salary();
		d.Loan();
		d.Allowance();
		}
		
		else if(des.contains("eloper"))
		{
		System.out.println("Enter Developer Data ::");
		Developer a = new Developer();
		a.salary();
		a.Loan();
		a.Allowance();
		}
		
		else {
			System.out.println("Invalid Input\nPlease Enter Manager/Developer/Designer");
		}
	}


}

abstract class Employee{
	abstract void salary();
	abstract void Loan();
	abstract void Allowance();
	
}


class Manager extends Employee{
	float salary;
	void salary() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Salary");
		float sal = s.nextFloat();
		salary = sal;
		
	
	}
	
	void Loan() {
		System.out.println("You are eligible for Loan Amounting "+salary*0.4 +" Rs");
		
	}
	
	void Allowance() {
		System.out.println("You are eligible for Allowance Amounting "+salary*0.05 +" Rs\n");
	}
	
	
}

class Designer extends Employee{
	float salary;
	void salary() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Salary");
		float sal = s.nextFloat();
		salary = sal;
	}
	
	void Loan() {
		System.out.println("You are eligible for Loan Amounting "+salary*0.4 +" Rs");
	}
	
	void Allowance() {
		System.out.println("You are eligible for Allowance Amounting "+salary*0.02 +" Rs\n");
	}
	
	
}

class Developer extends Employee{
	float salary;
	void salary() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Salary");
		float sal = s.nextFloat();
		salary = sal;
		
	}
	
	void Loan() {
		System.out.println("You are eligible for Loan Amounting "+salary*0.4 +" Rs");
	}
	
	void Allowance() {
		System.out.println("You are eligible for Allowance Amounting "+salary*0.03 +" Rs\n");
	}
	
	
}