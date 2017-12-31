package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	
		Actions action=new Actions(driver);
		WebElement srcblock = driver.findElement(By.xpath("//h1[text()='Block 1']"));
	    WebElement desblock = driver.findElement(By.xpath("//h1[text()='Block 3']"));
        action.dragAndDrop(srcblock, desblock).perform();
        Thread.sleep(4000);
        driver.close();
	}
}
