package rajat;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String []args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.get("https://www.google.com/");
	Thread.sleep(1000);
	d.navigate().to("https://www.gmail.com");
	Thread.sleep(1000);
	d.navigate().back();
	Thread.sleep(1000);
	d.navigate().forward();
	Thread.sleep(1000);
	d.navigate().refresh();
	String title = d.getTitle();
	System.out.println(title);
	d.quit();
}
}
