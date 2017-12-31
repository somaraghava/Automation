package independent_dependent_xpath_axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://seleniumhq.org/download/");
	//using independent and dependent xpath and xpath axes locate the download button of selenium java file
	String xp = "//td[text()='Java']/following-sibling::td/a[text()='Download']";
	driver.findElement(By.xpath(xp)).click();
	
}
}
//1.login actiTIME 2.settings 3.type of work(set by default using testing).