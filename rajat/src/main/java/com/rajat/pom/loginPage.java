package com.rajat.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	private WebElement untbx;

	public void LoginPage(WebDriver driver) {
		untbx = driver.findElement(By.id("username"));
	}
	public void setUser(String un) {
		untbx.sendKeys(un);
	}
}
