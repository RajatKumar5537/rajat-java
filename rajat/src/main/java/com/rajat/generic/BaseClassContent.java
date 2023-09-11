package com.rajat.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseClassContent {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public WebDriver d;
	@BeforeClass
		public void openBrowser() {
		d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close Browser", true);
		d.close();
	}
	@BeforeMethod
	public void login() {
		Reporter.log("Login",true);
		d.get("https://www.google.com/");
		String title = d.getTitle();
		String Et="Soogle";
		SoftAssert s=new SoftAssert();
		s.assertEquals(title, Et);
		
	}
}
