package com.capgemini.day5;

import com.capgemini.day5.InvalidInputException;
import com.capgemini.day5.FactorialException;

public class Factorial {
	public int getFactorial(int num) throws InvalidInputException,FactorialException{
		int fact=1 ;
		if(num<2)
		{
			throw new InvalidInputException() ;
		}
		for(int i=1;i<=num;i++)
		{
			fact=fact*i ;
			if(fact<0)
			{
				throw new FactorialException() ;
			}
			
		}
		return fact ;
	}
}