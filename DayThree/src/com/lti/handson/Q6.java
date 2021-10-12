package com.lti.handson;

import java.util.Scanner;

public class Q6 {


		static String removeDuplicates(String str)

		{
		    int n = str.length();
		    String res = "";
		    for (int i = 0; i < n; i++)
		    {
		        int j;
		        for (j = i + 1; j < n; j++) {
		            if (str.charAt(i) == str.charAt(j))
		                break;
		        }
		        if (j == n)
		            res = res + str.charAt(i);
		    }
		    return res;
		}
		 

		public static void main(String[] args)
		{
			 Scanner in = new Scanner(System.in);   
		      System.out.println("Enter a string");  
		      String str = in.nextLine();
		    System.out.print(removeDuplicates(str));
		}
}
