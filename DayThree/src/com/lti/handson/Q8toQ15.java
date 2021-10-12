package com.lti.handson;

public class Q8toQ15 {

	public static void main(String[] args) {
		String s="Try to learn something about everything and everything about something";
		char a=s.charAt(10);
		System.out.println("Char at index 10 is:"+a);
		
		      if(s.contains("is")) {
				System.out.println("Yes ");
			}
		      else {
		    	  System.out.println("No");
		        }
			s=s.concat(" otherwise fix it");
			System.out.println("New string :"+s);
            if(s.endsWith("how")) {
            	System.out.println("Yes it is present ");
            }
            else {
            	System.out.println("No it's not present");
            }
            	
            if(s.equals("Try to learn something about everything and everything about something"))
            {
            	System.out.println("Yes it is equal");
            }
            else {
            	System.out.println("not equal");
            	}
            if(s.equals("TRY TO LEARN SOMETHING ABOUT EVERYTHING AND EVERYTHING ABOUT SOMETHING"))
            {
            	System.out.println("yes they are equal");
            }
            else
            {
            	System.out.println("no they are not equal");
            }
            int i=s.indexOf("a");
            System.out.println("index of a is "+i);
            int l=s.lastIndexOf("c");
            System.out.println("index of last c"+l);
            int len=s.length();
            System.out.println("String length :"+len);
            s=s.replaceFirst("to", "A");
            System.out.println("replaced string : "+s);
            
             String temp[]=s.split("and");
             for(String f:temp) {
            	 System.out.println(f);
             }
             
             for (String word : s.split(" "))
            	 if (word.length() / 9== 1||word.length()%10==0)
            		 System.out.println(word);
             
             s=s.toLowerCase();
             System.out.println("lower class :"+s);
             s=s.toUpperCase();
             System.out.println("upper class :"+s);
}

}
