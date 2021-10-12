package com.lti.handson;

import java.util.Scanner;

public class Q1Vovel {

	public static void main(String[] args) {
		  
        int vCount = 0, cCount = 0,n=0;  
          

        Scanner s=new Scanner(System.in);
	    String [] str = new String[100];
	    System.out.println("enter string");
		
		for(int i=0;i<100;i++)
	    {   
	       str[i]=s.next();
	       n++;
	        if(str[i].equals("!"))
	         break;
	        
	    }
		
//	    for(int i=0;i<n-1;i++) {
//	    System.out.println(str[i]);
//	}
//			
	  
          
        for(int i = 0; i < n; i++) {  
            
            if(str[i].equals("a")|| str[i].equals("e") || str[i].equals("i") || str[i].equals("o") || str[i].equals("u")||str[i].equals("A")||str[i].equals("E")||str[i].equals("I")||str[i].equals("O")||str[i].equals("U")) {  
                 
                vCount++;  
            }  
            
            else{    
              
                cCount++;  
            }  
        }  
        System.out.println("Number of vowels: " + vCount);  
        System.out.println("Number of consonants: " + cCount);
	}

}
