package com.testNg.www;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class customerModule2 {
	@Test
	public void createModule() {
		Reporter.log("Crate Module", true);
	}
	@Test
	public void deleteModule() {
		Reporter.log("Delete Module", true);
	}
	@Test
	public void modifyModule() {
		Reporter.log("Modify Module", true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("Login", true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("Logout",true);
	}
	@BeforeClass
	public void openBrowser() {
		Reporter.log("Open Browser", true);
	}
	@AfterClass
	public void closeBrowser () {
		Reporter.log("Close Browser",true);
	}
}
