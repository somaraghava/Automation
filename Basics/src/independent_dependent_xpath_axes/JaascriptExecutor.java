package independent_dependent_xpath_axes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JaascriptExecutor {

	static{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/hdh/Desktop/javascriptdemo.html");
		JavascriptExecutor js= (JavascriptExecutor) driver;
          js.executeScript("document.getElementById('user').value='admin'");
          
         
          
          
          
	}

}
