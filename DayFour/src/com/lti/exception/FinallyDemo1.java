package com.lti.exception;

public class FinallyDemo1 {

	public static void main(String[] args) {
		try {
		String s = null;
		s = s.concat(" Java");
		System.out.println(s);
		}
		
		finally { //file.close //con.close //catch+try //Not Synchronized
		System.out.println("End");

		}

		}
}