package independent_dependent_xpath_axes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollToElement {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          WebDriver driver=new FirefoxDriver();
        driver.get("http://seleniumhq.org");
		 Thread.sleep(4000);
		// js.executeScript("window.scrollBy(0,1000)");
	
		 //navigate to specific element in webpage
		 //tagname{contains(@AN,'uniquie')]
	     WebElement applitools = driver.findElement(By.xpath("//img[contains(@src,'applitools')]"));
		 int xcor=applitools.getLocation().getX();
		 int ycor=applitools.getLocation().getY();
		 System.out.println(xcor+","+ycor);
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo("+xcor+","+ycor+")");
		 Thread.sleep(2000);
		 driver.close();
		
      /*   driver.get("http://docs.seleniumhq.org/support/");
         JavascriptExecutor js=(JavascriptExecutor) driver;
         WebElement crossbrowser = driver.findElement(By.xpath("//img[contains(@src,'CBT-Logo')]"));
         int x = crossbrowser.getLocation().getX();
	     int y = crossbrowser.getLocation().getY();
	     System.out.println(x+","+y);
	     js.executeScript("window.scrollTo("+x+","+y+")");
	     Thread.sleep(4000);
	     driver.close();
	    */ 
	
	
	
	
	
	
	}  

}
