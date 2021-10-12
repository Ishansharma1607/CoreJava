package com.lti.weekend;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		int a[] = new int[5];
		for(int i=0;i<5;i++)
		{
			a[i] = sc.nextInt();
			
		}
		System.out.println("Enter number to find");
		int num= sc.nextInt();
			    boolean found = false;
			    for (int n : a) {
			      if (n == num) {
			        found = true;
			        break;
			      }
			    }
			    
			    if(found)
			      System.out.println(num + " is found.");
			    else
			      System.out.println(num + " is not found.");
			  }

}
