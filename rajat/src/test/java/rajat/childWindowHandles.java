package rajat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childWindowHandles {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main (String []args) {
	WebDriver d=new ChromeDriver();
	d.get("https://in.indeed.com/");
	String wh = d.getWindowHandle();
	System.out.println(wh);
	d.close();
}

}
