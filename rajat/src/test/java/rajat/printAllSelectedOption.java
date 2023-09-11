package rajat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printAllSelectedOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main (String []args) {
		WebDriver d=new ChromeDriver();
		d.get("file:///D:/Q%20Spider/Selenium/HTML/Hotel.html");
		WebElement slvList = d.findElement(By.id("slv"));
		Select s=new Select(slvList);
		List<WebElement> allOption = s.getAllSelectedOptions();
		int count = allOption.size();
		for (int i=0; i<count; i++) {
			String text = allOption.get(i).getText();
			System.out.println(text);
		}
		d.close();
	}
}
