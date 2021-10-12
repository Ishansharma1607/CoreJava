package com.lti.weekend;

public class Q4 {

	public static void main(String[] args) {
		int n;
	      int status = 1;
	      int num = 3;
	      System.out.println("Cubic Root Of First 5 prime numbers are:");
	
	      System.out.println(Math.cbrt(2));
	      for ( int i = 2 ; i <=5 ;  )
	      {
	         for ( int j = 2 ; j <= num/2 ; j++ )
	         {
	            if ( num%j == 0 )
	            {
	               status = 0;
	               break;
	            }
	         }
	         if ( status != 0 )
	         {
	            System.out.println(Math.cbrt(num));
	            i++;
	         }
	         status = 1;
	         num++;
	      }         
	   }

	}


