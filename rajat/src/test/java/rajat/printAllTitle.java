package rajat;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printAllTitle {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://secure.indeed.com/");
		d.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		Set<String> allWh = d.getWindowHandles();

		for ( String wh:allWh) {
			d.switchTo().window(wh);
			String title = d.getTitle();
			System.out.println(title);
		}
		d.quit();
	}
}
