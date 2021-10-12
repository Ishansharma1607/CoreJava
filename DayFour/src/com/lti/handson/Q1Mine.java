package com.lti.handson;

import java.util.Collections;
import java.util.LinkedList;

public class Q1Mine {

	public static void main(String[] args) {
		 LinkedList<String> list = new LinkedList<String>();
		  
		  int size;
		 
		  list.add("Ishan");
		  list.add("Sharma");
		  list.add("TRY");
		  list.add("REVERSE");
		  size = list.size();
		 
		  System.out.println("The Elements are "+list);
	  
		  Collections.reverse(list);
		  System.out.println("Reverse Elements are "+list);
      
	}

}
