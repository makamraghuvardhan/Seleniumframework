package reusableFunctions;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.Select;

public class ResuseFunctions extends Callbrowser  {
	public void sendkeys()
	{
		driver.findElement(By.id("")).click();
		driver.findElement(By.id("")).clear();
		driver.findElement(By.id("")).sendKeys("  ");
	}
	public void selectvalue()
	{
	Select sel=new Select(driver.findElement(By.id("")));
	sel.selectByIndex(5);
	sel.selectByValue("");
	sel.selectByVisibleText("");
	}
    public void actionclass()
    {
    	Actions act=new Actions(driver);
    	act.moveToElement(driver.findElement(By.id(""))).click().build().perform();
    	act.clickAndHold();
    	act.doubleClick();
    	act.dragAndDrop(driver.findElement(By.id("")), driver.findElement(By.className("")));
    	act.keyUp(Keys.ALT);
    }
    public void javascrpt()
    {
    	JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)", "");
		jse.executeScript("aurgument[0].click();", "tempelement");	
    }
    
    
}
