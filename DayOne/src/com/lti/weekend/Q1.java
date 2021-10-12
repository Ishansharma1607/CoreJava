package com.lti.weekend;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		int min =0 ;int max = 10000;
		int n = (int)(Math.random()*(max-min+1)+min);  
		System.out.println("Number "+ n);
		 int i,f=0;
	
		 if(n==0||n==1) 
		 {
			
			 System.out.println("Not Prime");
			 f=1;
		 }
		    
		 else
		 {
			 for(i=2;i<=(n/2);i++)
				 if(n%i==0) {
					 System.out.println("Not Prime");
					 f=1;
					 break;
				 }
		 }
		 if(f==0)
			 System.out.println("Prime Number");
	 }
}
