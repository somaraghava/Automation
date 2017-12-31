package independent_dependent_xpath_axes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

	
	static	WebDriver driver=new ChromeDriver();
		
	}

