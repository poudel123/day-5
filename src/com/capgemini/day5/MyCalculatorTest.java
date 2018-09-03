package com.capgemini.day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyCalculatorTest {
	MyCalulator1 c1;
  @BeforeEach
  void setup() {
	  c1= new MyCalulator1();
  }
	@Test
	void testpower() throws ZeroException, NegativeException{
		//fail("Not yet implemented");
		assertEquals(2401,c1.power(7, 4));
		assertEquals(512,c1.power(2, 9));
		assertThrows(ZeroException.class, () -> c1.power(0, 0));
		assertThrows(NegativeException.class, () -> c1.power(-6, 0));
	}

}
