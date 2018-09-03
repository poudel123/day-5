package com.capgemini.day5;

import com.capgemini.day5.exception.CountryNotValidException;
import com.capgemini.day5.exception.EmployeeNameInvalidException;
import com.capgemini.day5.exception.TaxNotElgibleException;

public class TaxCalculator {

	public static double calculateTax(String empName, boolean isIndian, double empSal ) throws EmployeeNameInvalidException, TaxNotElgibleException, CountryNotValidException {
		// TODO Auto-generated method stub
		double taxAmount;
			if((empName == "" || empName == null) && isIndian == true)  {
				throw new EmployeeNameInvalidException("The employee name cannot be empty");
				
			}
			 if(empSal>100000 && isIndian == true)
		    {
			    taxAmount=empSal*8/100;
			    return taxAmount;
		    }
			  if(empSal>50000 && empSal<100000 && isIndian == true)
				{
					taxAmount=empSal*6/100;
					return taxAmount;
				}
		
			  if(empSal>30000 && empSal<50000 && isIndian == true)
				{
				taxAmount=empSal*5/100;
				return taxAmount;
				}
		      if(empSal>10000 && empSal<30000 && isIndian == true)
				{
				taxAmount=empSal*4/100;
				//System.out.println("Tax Amount is" +taxAmount);
				return taxAmount;
				}
		        if(empSal < 10000)
		       {
		    	 throw new TaxNotElgibleException("The employee dont need to pay tax");
		     }
	
		if(isIndian == false)
		
		{
			throw new CountryNotValidException("The employee should be Indian citizen for calculating tax");
		}
		return 0;
	}
}
