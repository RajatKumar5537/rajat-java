package com.rajat.generic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class customerModule extends BaseClass{
	@Test
	public void createCustomer() {
		Reporter.log("Create Customer in Generic",true);
	}
	@Test
	public void modifyCustomer() {
		Reporter.log("Modify Customer in Generic", true);
	}
	@Test
	public void deleteCustomer() {
		Reporter.log("Delete Customer in Generic",true);
	}
}
