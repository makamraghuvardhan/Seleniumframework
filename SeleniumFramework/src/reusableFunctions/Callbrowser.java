package reusableFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Callbrowser 
{
	public WebDriver driver;
	public Properties pro=new Properties();
	public String propertypath="src\\configurations\\Globalconfig.properties";
	
	public void initialise() throws IOException
	{
		FileInputStream fis=new FileInputStream(propertypath);
		pro.load(fis);
		System.setProperty("webdriver.chrome.driver", pro.getProperty("chromepath"));
		driver=new ChromeDriver();
		getAndMaximise();
			
	}
	private void getAndMaximise()
	{
		driver.get(pro.getProperty("URL"));
		driver.manage().window().maximize();
	}
	public void quitBrowser()
	{
		if(driver!=null)
		{
			driver.close();
		}
	}
}
