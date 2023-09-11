package com.vyaparapp.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	d.get("https://vyaparapp.in/store/simplyvyaparappspvtltd31");
	d.findElement(By.xpath("//img[@alt='Car']")).click();
	d.findElement(By.xpath("//span[text()='Add to Cart']")).click();
	d.findElement(By.xpath("//span[text()='1']")).click();
	d.findElement(By.xpath("//input[@id='customerName']")).sendKeys("Rajat Kumar Pradhan");
	d.findElement(By.xpath("//input[@class='form-control catalogue-cart_phone-input__Fu8RP']")).sendKeys("878959938");
	d.findElement(By.xpath("//textarea[@id=\"customerAddress\"]")).sendKeys("At- Bangalore, Po- Govipura, PIN-765898");
	d.findElement(By.xpath("//div[text()='Place Order']")).click();
	Thread.sleep(2000);
	d.close();
}
}
