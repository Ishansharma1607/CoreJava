package com.lti.streams;
import java.util.*;
import java.util.stream.Collectors;
public class StreamDemo4 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();

		names.add("Ishan ");
		names.add("Priya ");
		names.add("Peter ");
		names.add("Stephen ");

		List<String> upper = names.stream().map(u->u.toUpperCase()).collect(Collectors.toList());
		System.out.println("Names In Upper Case are "+upper);
		upper.forEach(System.out::println);
		upper.forEach(System.out::print);
	}

}
