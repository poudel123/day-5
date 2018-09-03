package com.capgemini.day5;

public class Student {
	long rollNo ;
	int age ;
	String name ;
	String course ;
	
	public Student(long rollNo, int age, String name, String course) throws AgeNotWithinRangeException,NameNotValidException  {
		super();
		this.rollNo = rollNo;
		if(age>21 || age<15)
			throw new AgeNotWithinRangeException() ;
		this.age = age;
		if(name.matches("[a-zA-Z]+")==false)
			throw new NameNotValidException() ;
		this.name = name;
		this.course = course;
	}
}
