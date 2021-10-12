package com.lti.handson;

import java.util.Scanner;

public class Q5 {

	static int wordcount(String string)  
    {  
      int count=0;  
  
        char ch[]= new char[string.length()];     
        for(int i=0;i<string.length();i++)  
        {  
            ch[i]= string.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count++;  
        }  
        return count;  
    }  
  public static void main(String[] args) {  
	   Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string");  
	      String str = in.nextLine();  
	      System.out.println(wordcount(str) + " words");   
}
}
