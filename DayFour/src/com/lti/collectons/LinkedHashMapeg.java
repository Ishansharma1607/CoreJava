package com.lti.collectons;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;



public class LinkedHashMapeg {

	public static void main(String[] args) {
		LinkedHashMap<String,String> lHashMap = new LinkedHashMap<String,String>();

		lHashMap.put("l", "One");

		lHashMap.put("2", "Two");

		lHashMap.put("4", "Two");

		lHashMap.put("3", "Three");

		Set st = lHashMap.keySet();

		Iterator itr = st.iterator();

		while (itr.hasNext()){
		System.out.println(itr.next());

		}

		lHashMap.remove("2");

		boolean blnExists = lHashMap.containsKey("2");

		System.out.println(blnExists);
	
	}

}
