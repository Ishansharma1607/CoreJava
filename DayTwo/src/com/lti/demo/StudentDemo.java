package com.lti.demo;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		Student[] s = new Student[3];
		for(int i=0;i<3;i++) {
			s[i]=new Student(); //array of objects
			s[i].getData();
			//s[i].showData();
			info f = new info();
			f.showData(s[i]);
		}

	
	}
}


class info{
    void showData(Student stu) {
	
	System.out.println("ID "+stu.getId());
	System.out.println("Name "+stu.getName());

	System.out.println("DOB "+stu.getDOB());
	System.out.println("College Name "+Student.collegeName);
}

}
	class Student{
		int id;
		String name;
		String DOB;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDOB() {
			return DOB;
		}
		public void setDOB(String dOB) {
			DOB = dOB;
		}
		
		static String collegeName = "BVPCOEP";
		
		void getData() {
			Student s1 = new Student();
			Scanner s = new Scanner(System.in);
			System.out.println("Enter The ID");
			id = s.nextInt();
			s1.setId(id);
			System.out.println("Enter The NAme");
			name = s.next();
			s1.setName(name);
		
			System.out.println("Enter DOB");
			DOB = s.next();
			s1.setDOB(DOB);
	
//			System.out.println("Enter College Name");
//			DOB = s.next();
//			
			
		}
		
		
	}
	
