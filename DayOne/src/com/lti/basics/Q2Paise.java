package com.lti.basics;
import java.io.*;
import java.util.Scanner;
public class Q2Paise {

	public static void main(String[] args) {
	

	
		  int paise,RsInInt;
	        float decimal;
		       
		        try{
		          	Scanner s = new Scanner (System.in);
		                System.out.print("Enter no. of Rupees : ");
		            	float RsInFloat = s.nextFloat();
		            	 RsInInt=(int)RsInFloat;
			              decimal=RsInFloat-(float)RsInInt;
			              paise=(int)((RsInInt*100) + (int)(decimal*100));
			              System.out.println(RsInFloat+" Rupees equals to "+paise+" Paise");
			              
		              }

		        catch (Exception e)
		        {}
		

	}

}
