package com.testNg.www;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule1 {
	@Test(priority = 1, invocationCount = 3)
	public void createCustomer() {
		Reporter.log("Create Customer",true);
	}
	@Test(priority = 2, dependsOnMethods = "createCustomer")
	public void modifyCustomer() {
		Reporter.log("Modify Customer", true);
	}
	@Test(priority = 3,dependsOnMethods = {"modifyCustomer","createCustomer"})
	public void deleteCustomer() {
		Reporter.log("Delete Customer", true);
	}
}
