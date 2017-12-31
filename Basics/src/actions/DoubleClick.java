package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
	
		driver.get("http://seleniumhq.org/download/");
		Actions action=new Actions(driver);
		WebElement version = driver.findElement(By.linkText("3.8.1"));
		Thread.sleep(2000);
		action.doubleClick(version).perform();
		
		
		
	}
	}
