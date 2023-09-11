package com.testNg.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAssertion {
static {
	System.setProperty("webdrive.chrome.driver", "./driver/chromedriver.exe");
}
@Test
public void verifyTitle() {
	WebDriver d=new ChromeDriver();
	d.get("https://www.google.com/");
	String aT = d.getTitle();
	String eT ="soogle";
	if (aT==eT) {
		System.out.println("Title is match ");
	}
	else {
		System.out.println("Title is mismatch");
	}
}
}
