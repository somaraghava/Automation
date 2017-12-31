package independent_dependent_xpath_axes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class SubmitMethod_WebElement  {
	static {
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
           driver.get("http://localhost/login.do");
          driver.findElement(By.xpath("//div[text()='Login ']")).click();
    /*      WebElement user = driver.findElement(By.id("username"));
          user.sendKeys("admin");
          Thread.sleep(2000);
		user.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
      */    
           
          Thread.sleep(2000);
           WebElement errmsg = driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
           String text = errmsg.getText();
	       System.out.println(text);
	       
	       String colour = errmsg.getCssValue("color");
	        System.out.println(colour+"not equals to ----> =#ce0100");
	       
	       String colour1 = Color.fromString(colour).asHex();
	       System.out.println(colour1+" == #ce0100");
	       
	       if(colour1.equals("#ce0100")) {
	    	   System.out.println("Error msg in RED colour");
	       }
	       else {
	    	   System.out.println("Error msg not in RED colour");
	       }
	
	}

}
