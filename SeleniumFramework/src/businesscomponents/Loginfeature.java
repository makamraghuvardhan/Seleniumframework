package businesscomponents;

import java.io.IOException;
import jxl.JXLException;
import pageElements.LoginPage;
import reusableFunctions.Callbrowser;
import reusableFunctions.ReadExcelData;

public class Loginfeature extends Callbrowser{
	
	public void login() throws JXLException, IOException
	{
	ReadExcelData readdata=new ReadExcelData("Sheet1","testdata.xls");
	driver.findElement(LoginPage.username).sendKeys(readdata.readData(0, 0));
	driver.findElement(LoginPage.password).sendKeys(readdata.readData(0, 1));
	driver.findElement(LoginPage.login).click();
	}

}
