package com.mywebpage.drivers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseDriver
{
	public  WebDriverWait driverwait;
	public WebDriver driver;
	 
	
	
	public BaseDriver() 
	{
		InputStream inputstream = BaseDriver.class.getResourceAsStream("webdriver.properties");
		Properties p = new Properties();
		driver= null;
		 
		try 
		{
			p.load(inputstream);
			String browser = p.getProperty("browser");
			System.out.println("Currently the browser we are using is " + browser);
			
			if(browser!= null && browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Tania\\Desktop\\webdrivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);	
			}
			else if (browser!= null && browser.equals("edge")) 
			{
				System.setProperty("webdriver.edge.driver","C:\\Users\\Tania\\Desktop\\webdrivers\\msedgedriver.exe");
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);	
			}
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public void close()
	{
	 driver.close();	
	}
}
