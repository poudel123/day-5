package com.capgemini.day5.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day5.AgeNotWithinRangeException;
import com.capgemini.day5.NameNotValidException;
import com.capgemini.day5.Student;

class StudentTest {

	
	
	
	@Test
	void testStudentValidCases() {
		try {
			Student s1= new Student(12,18,"aman","CS") ;
		}
		catch(Exception e)
		{
			fail("Exception occured") ;
		}
		
	}
	
	@Test
	void testStudentInvalidCases() {
		assertThrows(AgeNotWithinRangeException.class,()->new Student(12,40,"aman","CS"));
		assertThrows(NameNotValidException.class,()->new Student(12,20,"aman@","CS"));
	}
	

}

