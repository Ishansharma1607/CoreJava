package com.lti.streams;

import java.util.*;
import java.util.ArrayList;

public class StreamDemo1 {

	public static void main(String[] args) {

		long count = 0;

		List<String> names = new ArrayList<String>();

		names.add("Ishan");

		names.add("Priya");

		names.add("Peter");

		names.add("Stephen");
//		for(String s : names) {
//			
//			
//		}
//
//	if(s.length()>5)
//		System.out.println(count++);
////
//		}
//		
		

		count = names.stream().filter(s -> s.length() > 5).count(); //2 // shorten the code
		
		System.out.println("There are "+count+ " names whose length is greater than 5");
	}

}
