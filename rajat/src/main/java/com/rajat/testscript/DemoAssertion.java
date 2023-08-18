package com.rajat.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAssertion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void verifyTitle() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		String eTitle="google";
		String aTitle = d.getTitle();
		if (eTitle==aTitle) {
			System.out.println("Title is matching and pass ");
		}
		else {
			System.out.println("Title is not matching and failed ");
		}
	}
}
