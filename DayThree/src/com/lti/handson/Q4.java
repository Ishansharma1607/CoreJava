package com.lti.handson;

import java.util.Scanner;

public class Q4 {

	public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string...");
        String s1=sc.nextLine();
        int l=s1.length();
      
        for(int i=0;i<l;i++)
        {
            
            if(s1.contains(" "))
            {
            System.out.println("spaces are Present ");
            break;
            
            }
            else
            {
            System.out.println("no spaces are there");
            break;
        }
    }
    }
}


