package com.vyaparapp.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class orderPlace  {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void orderPlaceItem() {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://vyaparapp.in/store/simplyvyaparappspvtltd31");
		productOrder po=new productOrder(d);
		po.placeOrder("Rajat Kumar", "9984200397", "Banglore, Karnataka, PIN- 560019");
	}
}
