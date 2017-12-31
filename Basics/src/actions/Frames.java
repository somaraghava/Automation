package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Frames extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		driver.get("file:///G://Selenium//html/DemoB.html");
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("f1");
		WebElement frameobj = driver.findElement(By.id("f1"));
		driver.switchTo().frame(frameobj);
		Thread.sleep(2000);
		driver.findElement(By.id("t2")).sendKeys("a11111");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("a22222");
		
		
		Thread.sleep(4000);
		driver.close();
		
	}
	
}
