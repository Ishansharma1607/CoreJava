package com.lti.handson;

import java.util.Scanner;

public class Q7 {

		public static void main(String args[])
		{  
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a string");
			String str = sc.nextLine();
		String replaceString=str.replace('a','e');
		System.out.println(replaceString);  
}

}
