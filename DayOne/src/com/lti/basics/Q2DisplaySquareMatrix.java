package com.lti.basics;

import java.util.Scanner;

public class Q2DisplaySquareMatrix {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values");
		int a[] = new int[5];
		for(int i=0;i<5;i++) {
		a[i] = s.nextInt();
		}

		System.out.println("Square of original array : ");  
        for (int i = 0; i < a.length; i++) {   
           System.out.print(a[i]*a[i] + " ");  
        }   
		
		
	}

}
