package com.lti.basics;
import java.util.Scanner;

public class Q4Duplicates {

	public static void main(String[] args) {
		



				
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the values");
				int a[] = new int[5]; //{1,2,2,2,4};
				for(int i=0;i<5;i++) {
				a[i] = s.nextInt();
				}

				
				
				for (int i = 0; i < a.length; i++) {  
	        	for (int j = i+1; j < a.length; j++) { 	        		
		        	if(a[i]==a[j] && i!=j)
		        		
			           System.out.print(a[j]);  
		        		
		        	
				        
		        	}
		           
		        }  
				
	}

}
