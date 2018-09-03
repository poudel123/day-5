package com.capgemini.day5;



public class MyCalulator1 {

	

		 public  long power(int n, int p) throws ZeroException,NegativeException {
		        if(n==0 && p==0) {
		            throw new ZeroException("n and p should not be zero.");
		        } else if(n<0 || p<0) {
		            throw new NegativeException("n or p should not be negative.");
		        } else {
		            return (long)Math.pow(n, p);
		        }
		 }
		   
}
