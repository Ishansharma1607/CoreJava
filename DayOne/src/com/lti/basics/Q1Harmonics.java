package com.lti.basics;

import java.util.Scanner;

public class Q1Harmonics {

	public static void main(String[] args) {
	
		

		Scanner s = new Scanner (System.in);
		System.out.println("Enter Value Of n");
		int n = s.nextInt();
		double sum= 0;
		for (float i = 1; i<=n;i++){
		sum+=(1/i);
		}
		System.out.println(sum);
		
	}

}


