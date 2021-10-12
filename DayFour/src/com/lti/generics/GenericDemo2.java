package com.lti.generics;

public class GenericDemo2 {

	public static void main(String[] args) {
		Integer[] i = {1,89,97,56,66};
		String[] s = {"Ishan","Welcome"};
		
		System.out.println("Intger Array");
		display(i);
		
		System.out.println("String Array");
		display(s);

	}

	public static<E> void display(E[] elements) {
		for(E e : elements) {
			System.out.println(e);
		}
	}
}
