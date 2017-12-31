package actions;

import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;

public class Switch extends BaseClass {
	
	public static void main(String[] args) {
	
	driver.get("http://localhost/login.do");
	
	
/*	TargetLocator switchTo = driver.switchTo();
	WebElement usernameobj = switchTo.activeElement();
	usernameobj.sendKeys("admin");
	*/
	
	driver.switchTo().activeElement().sendKeys("admin");
	
	
	
	
	
	
	}

}
