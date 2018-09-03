package com.capgemini.day5.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day5.Television;

class TelevisionTest
{

Television television;
	
	@BeforeEach
	void setup()
	{
		television=new Television(50,200);
	}
	
	@Test
	void testfindPower()
	{
		assertEquals("on",Television.findPower(true));
	}
	
	
	
	@Test
	void testfindState() {
		assertEquals("on", Television.findState(true));
		assertEquals("off", Television.findState(false));
	}

	@Test
	void testchangeVolume()
	{
		assertEquals(51,Television.changeVolume());
		assertEquals(52,Television.changeVolume());
	}
	
	@Test
	void test()
	{
		assertEquals(201,Television.changeChannel());
		assertEquals(202,Television.changeChannel());
		assertEquals(203,Television.changeChannel());
	}
	
	@AfterEach
	void tearDown()
	{
		television=null;
	}
	
}

	
