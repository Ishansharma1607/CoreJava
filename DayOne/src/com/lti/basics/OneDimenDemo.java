package com.lti.basics;

import java.util.Scanner;

public class OneDimenDemo {

	public static void main(String[] args) {
		//int[] a = new int[];//error (Unlimited array)
		//int a[]  = new int[5];
//		int[] a = new int[] {1,2,4,5,6}
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values");
		int a[] = new int[5];
		for(int i=0;i<5;i++) {
		a[i] = s.nextInt();
		}
		//logics
		System.out.println("The values are");
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
			
		
	}

}
}