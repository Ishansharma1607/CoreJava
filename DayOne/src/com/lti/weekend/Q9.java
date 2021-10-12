package com.lti.weekend;

public class Q9 {

	public static void main(String[] args)
	{
		int x;
		int a[] = {25,105,78,96,20};
	    int  l = a.length;
	      for(int i = 0; i<l; i++ )
	      {
	         for(int j = i+1; j<l; j++)
	         {
	            if(a[i]>a[j])
	            {
	               x = a[i];
	               a[i] = a[j];
	               a[j] = x;
	            }
	         }
	      }
	      System.out.println("Second largest number is: "+a[l-3]);		
	}
}
