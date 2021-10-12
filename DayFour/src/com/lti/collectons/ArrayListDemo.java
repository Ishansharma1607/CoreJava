package com.lti.collectons;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Object> arl=new ArrayList<Object>();

		Integer i1=new Integer(16);

		Integer i2=new Integer(29);

		Integer i3=new Integer(30);

		Integer i4=new Integer(49);

		String s1="japan";

		System.out.println("The size of an arraylist is: " + arl.size());
		arl.add(i1);

		arl.add(i2);

		arl.add(s1);

		System.out.println(arl);

		System.out.println("The content of arraylist is: " + arl);
		System.out.println("The size of an arraylist is: " + arl.size());
		arl.add(i1);

		arl.add(i2);

		arl.add(i3);

		arl.add(i4);

		Integer i5=new Integer(50);

		arl.add(i5);
		arl.trimToSize();

		System.out.println("The content of arraylist is: " + arl);
		System.out.println("The size of an arraylist is: " + arl.size());
		arl.remove(3);

		System.out.println(arl);

		 Object a=arl.clone();

		System.out.println("The clone is: " + a);

		 arl.remove(3);

		System.out.println("The content of arraylist is: " + arl);

		 System.out.println("The size of an arraylist is: " + arl.size());
		if(a.equals(arl))

	System.out.println("Equal");

		 else

		 System.out.println("Not Equal");

		 for(Object o:arl){

		 System.out.println(o);

		
		
	}
	}

}
