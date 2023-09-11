package com.rajat.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethodcls {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver d1=new ChromeDriver();
	d1.get("https://demo.actitime.com/login.do");
	loginPage l= new loginPage();
	l.setUser("admin");
	
}
}
