package independent_dependent_xpath_axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Hoverover extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
				
		//enter url (http://www.istqb.in)
       
		driver.get("http://www.istqb.in");
      Thread.sleep(4000);
		//find the element 'foundation'
           WebElement foundation = driver.findElement(By.xpath("//span[text()='FOUNDATION']"));

		//hover over the element using moveTo() of Actions class
             Actions action=new Actions(driver);
             action.moveToElement(foundation).perform();
             Thread.sleep(2000);
       //hover over the element 'ENROLLMENT'
	
	   //hover over element 'CORPORATE ENROLLMENT'
	       
         WebElement enrollment = driver.findElement(By.xpath("//span[text()='ENROLLMENT']"));
	       action.moveToElement(enrollment).perform();
	       Thread.sleep(2000);
	  //hover over 'CORPORATE ENROLLMENT'
	       WebElement coerl = driver.findElement(By.xpath("//span[text()='CORPORATE ENROLLMENT']"));
	       action.moveToElement(coerl).perform();
	       Thread.sleep(2000);
	 //perform action on online enrollment
	      WebElement result = driver.findElement(By.xpath("//span[text()='ONLINE ENROLLMENT']"));
	      result.click();
	      Thread.sleep(2000);
	      driver.close();
	      
	      //driver.findElement(By.id("signin_username")).sendKeys("somaraghava588@gmail.com");
	      //Thread.sleep(2000);
	      //driver.findElement(By.id("nopassword")).click();
	
	}

}
