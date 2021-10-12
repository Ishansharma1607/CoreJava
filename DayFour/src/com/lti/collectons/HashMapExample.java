package com.lti.collectons;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String,Object> hash = new HashMap<String,Object>();
		hash.put("ID", new Integer(12));
		hash.put("NAME", "jack");
		hash.put("AGE", new Integer(22));
		System.out.println(hash.get("ROLL"));
		
		Set s = hash.entrySet();
		Iterator i = s.iterator();
		while (i.hasNext()) {
		System.out.println(i.next());
		}

	}

}
