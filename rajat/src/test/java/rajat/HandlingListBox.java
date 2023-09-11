package rajat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String []args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d.get("https://www.facebook.com/");
	d.findElement(By.linkText("Create new account")).click();
	d.findElement(By.name("firstname")).sendKeys("Rajat");
	d.findElement(By.name("lastname")).sendKeys("Pradhan");
	d.findElement(By.name("reg_email__")).sendKeys("9986200397");
	d.findElement(By.name("reg_passwd__")).sendKeys("tnikkjbkjd");
	WebElement dayList = d.findElement(By.id("day"));
	Select s1=new Select(dayList);
	s1.selectByIndex(19);
	WebElement monthList = d.findElement(By.name("birthday_month"));
	Select s=new Select(monthList);
	s.selectByIndex(2);
	WebElement yearList = d.findElement(By.id("year"));
	Select sy= new Select(yearList);
	sy.selectByValue("1997");
	d.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
	Thread.sleep(3000);
	d.findElement(By.name("websubmit")).click();
	Thread.sleep(3000);
	d.close();
}
}
