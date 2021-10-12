package com.lti.handson;



public class Employees {

	public static void main(String[] args) {
		Employee b = new Employee("Ishan");
		Employee b1 = new Employee("Ishan", 100);
		Employee b2 = new Employee("Ishan", 100,23);
		Employee b3 = new Employee("Ishan", 100,"Manager");
		Employee b4 = new Employee("Ishan", 100,23,"Pune");
		Employee b5 = new Employee(100,"Ishan",23,"Pune");
		Employee b6 = new Employee("Ishan",100,23,"Manager");
		

	}

}


class Employee{
	//String name;
	//int age;
	//int age1;

	Employee(String name){

	System.out.println("Name "+name);

	}


Employee(String name,int id){
System.out.println("Name "+name);
System.out.println("Id "+id);

}


Employee(String name,int id,int age){
System.out.println("Name "+name);
System.out.println("Id "+id);
System.out.println("Age "+age);

}

Employee(String name,int id,String designation){
System.out.println("Name "+name);
System.out.println("Id "+id);
System.out.println("Designation "+designation);

}

Employee(int id,String name,int age,String location){
System.out.println("Name "+name);
System.out.println("Id "+id);
System.out.println("Age "+age);
System.out.println("Location "+location);
}

Employee(String name,int id,int age,String designation){
System.out.println("Name "+name);
System.out.println("Id "+id);
System.out.println("Age "+age);
System.out.println("Designation "+designation);
}

Employee(String name,int id,int age,int experience){
System.out.println("Name "+name);
System.out.println("Id "+id);
System.out.println("Age "+age);
System.out.println("Experience "+experience);
}

Employee(String name,int id,String designation,String location,String experience){
System.out.println("Name "+name);
System.out.println("Id "+id);
System.out.println("Designation "+designation);
System.out.println("Location "+location);
System.out.println("Experience "+experience);
}

Employee(String name,int id,int age,String designation,String location,String experience){
System.out.println("Name "+name);
System.out.println("Id "+id);
System.out.println("Age "+age);
System.out.println("Designation "+designation);
System.out.println("Location "+location);
System.out.println("Experience "+experience);
}
}
