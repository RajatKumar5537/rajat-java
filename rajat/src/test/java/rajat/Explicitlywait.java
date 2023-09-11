package rajat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitlywait {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://demo.actitime.com/login.do");
	d.findElement(By.name("username")).sendKeys("admin");
	d.findElement(By.name("pwd")).sendKeys("manager");
	d.findElement(By.xpath("(//div[contains(text(),'Login ')])[1]")).click();
	
	WebDriverWait wait = new WebDriverWait(d, 10);
	wait.until(ExpectedConditions.titleContains("Enter"));
}
}
