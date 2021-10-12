package com.lti.collectons;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		// duplicate element is not permitted
		hs.add("Ishan");
		hs.add("Aditi");
		hs.add("Esha");
		hs.add("Shreya");
		hs.add("Verma");

		Iterator it = hs.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

			// System.out.println("Value :"+value);
		}

		// find size of hashSet
		System.out.println("Size :" + hs.size());

		// Remove element from hashSet :
		hs.remove("d");
		System.out.println(hs);
		// To remove all object from hashSet
		hs.clear();

	}

}
