package com.vyaparapp.testscript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyLogo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://vyaparapp.in/store/simplyvyaparappspvtltd31");
		String text = d.findElement(By.xpath("//p[text()='Simply Vyapar Apps Pvt. Ltd.']")).getText();
		boolean logo = d.findElement(By.xpath("//img[@src='https://vyapar-catalog.vypcdn.in/e66a189317ae8/firmDetails/firmLogo.jpg?v1690376024.376']")).isDisplayed();
		if (logo==true) {
			System.out.println("Logo is Displayed and pass");
		}
		else {
			System.out.println("Logo is not displayed and fail");
		}
		System.out.println(text);
		Set<String> wh = d.getWindowHandles();
		int count = wh.size();
		System.out.println(count);
		for( String alwh:wh) {
			System.out.println(alwh);
		}

		d.close();
	}
}
