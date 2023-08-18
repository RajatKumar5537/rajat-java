package rajat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo {
	@Test
	public static void amazon() {
		String url = "https://www.amazon.in/";
		WebDriver d=new ChromeDriver();
		d.get(url);
		List<WebElement> allLinks = d.findElements(By.xpath("//a"));
		int count = allLinks.size();
		System.out.println("All Links count is "+count);
		
		for(int i=0;i<count;i++) {
			String text = allLinks.get(i).getText();
			System.out.println(text);
		}
		d.close();
	}
	

}
