package com.lti.weekend;

public class Q2 {

	public static void main(String[] args) {
		int  a, d, r = 0;
		int min =10 ;int max = 99;
		int n = (int)(Math.random()*(max-min+1)+min);  
		System.out.println("Number "+ n);
       a = n;
       while (a != 0)
        {
            d = a % 10;
            r += Math.pow(d, 3);
            a /= 10;
        }
       if(r == n)
            System.out.println(" is an Armstrong number.");
        else
            System.out.println(" is not an Armstrong number.");
}
}
