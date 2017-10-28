package testCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import jxl.JXLException;
import pageElements.LoginPage;
import reusableFunctions.Callbrowser;
import reusableFunctions.ReadExcelData;

public class Testcaseone extends Callbrowser {
	@Test
	public void testOne() throws IOException, InterruptedException, JXLException
	{
		try{
		initialise();
		ReadExcelData readdata=new ReadExcelData("Sheet1","testdata.xls");
		driver.findElement(LoginPage.username).sendKeys(readdata.readData(0, 0));
		driver.findElement(LoginPage.password).sendKeys(readdata.readData(0, 1));
		driver.findElement(LoginPage.login).click();
		Thread.sleep(16000);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(LoginPage.listoficons));
		int counts=driver.findElements(LoginPage.listoficons).size();
		System.out.println(counts);
		}
		catch(Exception e)
		{
			Reporter.log("");
		}
		finally
		{
			
			quitBrowser();
		}
		
	}
}
