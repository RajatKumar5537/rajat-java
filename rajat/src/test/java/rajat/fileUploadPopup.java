package rajat;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUploadPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("file:///D:/Q%20Spider/Selenium/HTML/noukri.html");
		File f=new File("D:/Q Spider/Selenium/RAGHU V Y.pdf");
		String absoulutePath = f.getAbsolutePath();
		d.findElement(By.id("cv")).sendKeys(absoulutePath);
		Thread.sleep(3000);
		d.close();
	}
}
