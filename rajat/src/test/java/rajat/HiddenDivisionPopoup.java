package rajat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopoup {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String []args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("https://www.flipkart.com/");
	Thread.sleep(6000);
	d.findElement(By.xpath("(//button)[2]")).click();
	d.close();
}
}
