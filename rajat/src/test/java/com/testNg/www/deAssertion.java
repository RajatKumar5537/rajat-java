package com.testNg.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class deAssertion {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

public void verifyTitle() {
	WebDriver d=new ChromeDriver();
	d.get("https://www.google.com/");
	String aT = d.getTitle();
	String eT = "Ramaaa";
	SoftAssert s=new SoftAssert();
	s.assertEquals(aT, eT);
	d.close();
	s.assertAll();
				
}
}
