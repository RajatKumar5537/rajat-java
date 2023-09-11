package rajat;

import org.openqa.selenium.By;
//WAP to click on Login button present in facebbok without using click(), click method.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String [] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/login/");
		d.findElement(By.id("loginbutton")).submit();
		d.close();
	}
}
