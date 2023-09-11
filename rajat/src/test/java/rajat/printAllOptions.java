package rajat;
import java.util.List;

// WAS to print all the options of SLV Listbox
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printAllOptions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("file:///D:/Q%20Spider/Selenium/HTML/Hotel.html");
		WebElement slvListbox = d.findElement(By.id("slv"));
		Select s=new Select(slvListbox);
		List<WebElement> allOptions = s.getOptions();
		for (WebElement option:allOptions) {
			String text = option.getText();
			System.out.println(text);
		}
		d.close();
	}
}
