package com.lti.basics;

import java.util.Scanner;

public class TwoDimenDemo {

	public static void main(String[] args) {
//		int[][] a = new int[][] {1,2,3},{4,5,6},{7,8,9}};
		int[][] a = new int[3][3];
		Scanner s = new Scanner(System.in) ;
		System.out.println("Enter the values");
		for(int i = 0;i<3;i++){//row
			for(int j = 0;j<3;j++)
				
			{//coloumn
				a[i][j] = s.nextInt();
			}		
		}
		//logics
		
		System.out.println("the values");
		for(int i = 0;i<3;i++){//row
			
			for(int j = 0;j<3;j++)//coloumn
			{
				System.out.print(a[i][j]+"\t");
			}		
			
			System.out.println();
		}
		
		

	}

}
//outer loop row
//innerloop column