package com.rajat.testscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoScreenshot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void screenshot() throws IOException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		TakesScreenshot s= (TakesScreenshot) d;
		File src = s.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Scrrenshot/rajat.png");
		FileUtils.copyFile(src, dest);
		d.close();

	}

}
