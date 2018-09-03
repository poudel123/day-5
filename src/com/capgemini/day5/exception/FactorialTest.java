package com.capgemini.day5.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.Factorial;
import com.capgemini.day5.FactorialException;
class FactorialTest {

	@Test
	void testGetFactorial() throws Exception,FactorialException {
		Factorial f1=new Factorial() ;
		assertThrows(FactorialException.class,()->f1.getFactorial(100));
		assertEquals(120,f1.getFactorial(5));
	}

}