package com.lti.demo;

import java.util.Scanner;

import com.lti.demo.DiplomaCourse.type;
public class EnumDemo {

	public static void main(String[] args) {
		
//		DegreeCourse dd = new DegreeCourse();
//		dd.getData();
//		dd.check();
//		dd.CalculateMonthlyFees();
//		String str = "Professional";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Professional or Academic");
		String str = s.next();
		DiplomaCourse dc = new DiplomaCourse(type.valueOf(str));
		dc.getData();
		dc.display();
		dc.CalculateMonthlyFees();
	}

}

class Course{
int id;
String name;
int duration;
double fees;
void getData() 
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Name ");
	name = s.next();
	System.out.println("Id ");
	id = s.nextInt();
	System.out.println("Duration ");
	duration = s.nextInt();
	System.out.println("Fees ");
	fees = s.nextDouble();
	}
void CalculateMonthlyFees() {
System.out.println("Fees Details");
}
}

class DegreeCourse extends Course{
	enum level{BacheLors,Masters};
	boolean isPlacementAvailable;
	void check() {
		level l = level.BacheLors;
		System.out.println(l);

		}
	void showData() {
	System.out.println("Name"+name );

	}
	
	void CalculateMonthlyFees() {
		Scanner s = new Scanner(System.in);
		System.out.println("Is Placement Available ");
		isPlacementAvailable = s.nextBoolean();
		if(isPlacementAvailable==true) {
		fees = fees+(fees*0.1);
		System.out.println("Fees "+fees);
		}else
			System.out.println("Fees "+name);
	
     }
}

class DiplomaCourse extends Course{
	
	enum type{Professional,Academic}; //10%,5%
    type t;
    public DiplomaCourse(type t) {
    	this.t = t;
    }
	void display() {
	System.out.println("Name"+name );
	}
	
	void CalculateMonthlyFees() {
		super.CalculateMonthlyFees();
//		type t = type.Academic;
//		if(t==type.Professional) {
//		fees = fees+(fees*0.1);
//		System.out.println("Fees "+fees);
//		}else {
//		fees = fees+(fees*0.05);
//		System.out.println("Fees "+fees);
//		}
		switch(t) {

		case Professional :
		fees = fees+(fees*0.1);
		System.out.println("Fees "+fees);
		break;

		case Academic :
		fees = fees+(fees*0.05);
		System.out.println("Fees "+fees);
		break;

		}
}
}




