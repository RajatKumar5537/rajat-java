package rajat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopup {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String []args) {
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	d.get("https://demo.automationtesting.in/Alerts.html");
	d.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	/*WebDriverWait wb=new WebDriverWait(d, 10);
	wb.until(ExpectedConditions.alertIsPresent());*/
	Alert a=d.switchTo().alert();
	String text = a.getText();
	a.accept();
	System.out.println(text);
	d.close();
}
}
