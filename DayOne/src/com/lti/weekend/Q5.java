package com.lti.weekend;

public class Q5 {

   
	public static void main(String args[])   
	{    

	int i, j, row = 7;         
	for (i=0; i<row; i++)   
	{      
	for (j=row-i; j>1; j--)   
	{  
	System.out.print(" ");   
	}   
 
	for (j=0; j<=i; j++ )   
	{      
		
	System.out.format("%c ",j+65);
	
	
	}   
	System.out.println();   
	}   
	}  
	
//	
//	int i,j,n,l=1;
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the no of lines");
//	n=sc.nextInt();
//	for(i=1;i<=n;i++)
//	{
//	for(j=1;j<=n-i;j++)
//	{
//	System.out.printf(" ");
//	}
//	System.out.printf(" %c",(char)(l+96));
//
//	for(j=2;j<=i;j++,l++)
//	{
//	System.out.printf(" %c",(char)(l+64));
//	System.out.printf(" %c",(char)(l+1+96));
//	}
//	System.out.println();
//	}
	}  

