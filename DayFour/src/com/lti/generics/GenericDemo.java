package com.lti.generics;

public class GenericDemo {

	public static void main(String[] args) {
		MyGeneric<String> m = new MyGeneric<String>();
		m.add("Ishan");
		System.out.println(m.get());
		
		MyGeneric<Integer> m1 = new MyGeneric<Integer>();
		m1.add(12);
		System.out.println(m1.get());
	}

}


class MyGeneric<T>{
	T obj; //String object
	
	void add(T obj) {
		this.obj=obj;
	}
	T get() {
		return obj;
	}
	
}
