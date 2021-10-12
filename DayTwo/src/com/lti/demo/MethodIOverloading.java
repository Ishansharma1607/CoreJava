package com.lti.demo;

public class MethodIOverloading {

	public static void main(String[] args) {
		Add a = new Add();
		a.sum(5, 8.5f);
		a.sum(5, 8);
		a.sum(8,5,9.6f);

	}

}

class Add{
void sum(int a,int b) {
int c = a+b;
System.out.println("Two Int parameters "+c);
}
void sum(int a,float b) {
float c = a + b;
System.out.println("Int and float paramaters "+c);
}

void sum(int a,int b, float d) {

float c = a+b+d;

System.out.println("2 Int and 1 float parameters "+c);
}
}