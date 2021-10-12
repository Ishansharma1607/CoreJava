package com.lti.handson;

public class Sample {
	
	 static int noOfObjects = 0;
	  
	  
	    {
	        noOfObjects += 1;
	    }
	  
	   
	    public Sample(){}
	    public Sample(int n){}
	    public Sample(String s){}
	  
	    public static void main(String args[])
	    {
	        Sample t1 = new Sample();
	        Sample t2 = new Sample(5);
	        Sample t3 = new Sample("Ishan");
	  
	    
	        System.out.println(Sample.noOfObjects);
	    }

}
