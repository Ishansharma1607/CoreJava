package com.lti.collectons;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> LHSet = new LinkedHashSet<String>();
		LHSet.add("C");

		LHSet.add("1");

		LHSet.add("B");

		LHSet.add("E");

		LHSet.add("F");

		LHSet.add("E");

		LHSet.add("D");

		System.out.println("The LinkedHashSet elements are: " + LHSet);
		boolean bl = LHSet.remove("B");

		System.out.println(LHSet);

		boolean b2 = LHSet.contains("B");

		System.out.println("ls B exists? :" + b2);
		System.out.println("The Elements are: " + LHSet);

	}

}
