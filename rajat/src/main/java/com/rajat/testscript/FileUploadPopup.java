package com.rajat.testscript;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("file:///D:/Q%20Spider/Selenium/HTML/noukri.html");
	File f=new File("./data/Framework.docx");
	String absoulutePath = f.getAbsolutePath();
	d.findElement(By.id("cv")).sendKeys(absoulutePath);
}
}
