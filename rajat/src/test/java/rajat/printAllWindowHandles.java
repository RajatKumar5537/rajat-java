package rajat;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printAllWindowHandles {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String []args) {
		WebDriver d=new ChromeDriver();
		d.get("https://in.indeed.com/");
		d.findElement(By.id("CompanyReviews")).click();
		Set<String> allWh = d.getWindowHandles();
		int count = allWh.size();
		System.out.println(count);
		for (String wh:allWh) {
			System.out.println(wh);
		}
		d.quit();
	}
}
