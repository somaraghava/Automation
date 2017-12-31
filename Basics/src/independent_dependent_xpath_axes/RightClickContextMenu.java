package independent_dependent_xpath_axes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightClickContextMenu extends BaseClass{

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

	//	WebDriver driver=new FirefoxDriver();
		//open url (http://localhost/login.do)
         driver.get("http://localhost/login.do");
         driver.manage().window().maximize();
		//find the link using linktext() locator
             WebElement actiTIME = driver.findElement(By.linkText("actiTIME Inc."));
		
             //Right-click 0n link(Using COntextClick in Actions class)
             Thread.sleep(2000);
             Actions action =  new Actions(driver);
             action.contextClick(actiTIME).perform();
                     
		//select option using keyboard(using robot class)
		     Thread.sleep(2000);
             Robot r = new Robot();
             r.keyPress(KeyEvent.VK_W);
		     r.keyRelease(KeyEvent.VK_W);
		
		    Thread.sleep(3000);
		    
		    driver.quit();
		
		
		
		
		
		
	}

}
