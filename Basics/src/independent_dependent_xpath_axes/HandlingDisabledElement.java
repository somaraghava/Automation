package independent_dependent_xpath_axes;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDisabledElement extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		//enter url
		driver.get("https://en-gb.facebook.com/login/");
		//maximize the window
		driver.manage().window().maximize();
		//downcasst to the remote webdriver for accessing Javascript executor interface methods
		RemoteWebDriver r = (RemoteWebDriver) driver;
		//locate the user name text field using javascript exector method
		r.executeScript("document.getElementById('email').value='somaraghava588@gmail.com'");
		//locate password text field
		r.executeScript("document.getElementById('pass').value='somagirija'");
	   //locate and click on the login button
	    r.executeScript("document.getElementById('loginbutton').click()");
	    //webdriverexception displayed.so,use thread ststement for locating the web element
	    Thread.sleep(4000);
	    //locate drop-down menu
	    driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
	 //locate and perform action on LogOut link
	    String xp = "//span[text()='Log Out']";
	    Thread.sleep(4000);
	    driver.findElement(By.xpath(xp)).click();
	    driver.close();
	  
	}

}
