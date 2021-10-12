package com.lti.demo;

import java.util.Scanner;

public class InheritDemo {

	public static void main(String[] args) {
		Display d = new Display(); //make objects in last class
		d.getData();
		d.calc();
		d.show();

	}

}

class Emp{
int bp,hra,ta;
void getData() {
Scanner s = new Scanner(System.in);
System.out.println("Enter the Basic pay");
bp = s.nextInt();
System.out.println("Enter the HRA");
hra = s.nextInt();
System.out.println("Enter the ta");
ta = s.nextInt();
}
}

class NetSalary extends Emp{

int ns;
void calc() {

ns = bp+hra+ta;

}
}
class Display extends NetSalary{
void show() {

System.out. println("NetSalary " +ns) ;

}

}
