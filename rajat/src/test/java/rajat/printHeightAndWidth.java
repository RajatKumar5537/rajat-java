package rajat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printHeightAndWidth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/login/");
		WebElement login = d.findElement(By.name("login"));
		int height = login.getSize().getHeight();
		int width = login.getSize().getWidth();
		System.out.println("Height "+ height);
		System.out.println("Width "+ width);
		d.close();

	}
}
