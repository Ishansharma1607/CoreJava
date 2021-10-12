package com.lti.abstractt;

public class InterfaceDemo {

	public static void main(String[] args) {
//		inter1 i1; //reference
//		Arithimetic1 a1 = new Arithimetic1(); //Object
//		i1 = a1;
//		i1.add(59,60);
//		i1.sub(80,70);
//		
//		Arithimetic1 a2 = new Arithimetic1(); //Object
//		a2.add(50,60);
//		a2.sub(86, 70);
//		
//		inter2 i2; //reference
//		Calc c1 = new Calc(); //Object
//		i2 = c1;
//		i2.add(59,60);
//		i2.sub(80,70);
		
		inter3 i3;

		Check c = new Check();
		i3 = c;

		i3.add(59,60);
		i3.sub(89,90);
		i3.mul(59,5);
		i3.div(29,9);
		i3.show();
		last l  ;
		Check d = new Check();
		l = d;
		l.display();
		
		
		
		
		
	}

}

interface inter1{
	static final int j = 10;
	//abstract void add(); //abstract keyword optional
	void add(int a,int b);
	void sub(int a,int b);
	}

interface inter2 extends inter1{
	int j = 20; //we can change final variable in interfaces but not in class
	void mul(int a,int p);
	void div(int a,int b); 
	
}

interface inter3 extends inter2,inter1{
	void show();
	
}
interface last {
	void display();
	
}


class Arithimetic1 implements inter1{
	 
		public void add(int a ,int b) {
		int c = a+b;
		System.out.println("Sum "+c);
				}
		public void sub(int a ,int b) {
			int c = a-b;
			System.out.println("Diff "+c);
				}		

}

class Calc extends Arithimetic1 implements inter2{
	
	public void mul(int a,int b) {
		int c = a*b;
		System.out.println("Mul "+c);
	}
	public void div(int a,int b) {
		int c = a/b;
		System.out.println("Div "+c);
		
	}
}

class Check extends Calc implements inter3,last{
	
public void show() {
System.out.println("End");
}
 public void display() {
 System.out.println("End of the program");
}
}


	
