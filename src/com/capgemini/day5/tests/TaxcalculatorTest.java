package com.capgemini.day5.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.TaxCalculator;
import com.capgemini.day5.exception.CountryNotValidException;
import com.capgemini.day5.exception.EmployeeNameInvalidException;
import com.capgemini.day5.exception.TaxNotElgibleException;

class TaxcalculatorTest {

	@Test
	void testCalculateTaxWithValidInput() throws EmployeeNameInvalidException, TaxNotElgibleException, CountryNotValidException {
		assertEquals(8000.08,TaxCalculator.calculateTax("ram", true, 100001));
		assertEquals(16000,TaxCalculator.calculateTax("malyka", true, 200000));
		assertEquals(3600,TaxCalculator.calculateTax("lauki", true, 60000));
		assertEquals(2000,TaxCalculator.calculateTax("priyanka", true, 40000));
		
		
	}
  @Test
  void testCalculateTaxWithInValidName() {
	  Exception e;
		 e=assertThrows(EmployeeNameInvalidException.class,()->TaxCalculator.calculateTax("", true, 100001));
		 assertEquals("The employee name cannot be empty",e.getMessage());
  }
  @Test
  void testCalculateTaxWithInEligible() {
	  Exception e;
	 e= assertThrows(TaxNotElgibleException.class,()->TaxCalculator.calculateTax("varu", true, 500));
	 assertEquals("The employee dont need to pay tax",e.getMessage());
  } 
  @Test
  void testCalculateTaxWithInValidCountry() {
	  Exception e;
		 e=assertThrows(CountryNotValidException.class,()->TaxCalculator.calculateTax("sameera", false, 30000));
		 assertEquals("The employee should be Indian citizen for calculating tax",e.getMessage());
  } 
}
