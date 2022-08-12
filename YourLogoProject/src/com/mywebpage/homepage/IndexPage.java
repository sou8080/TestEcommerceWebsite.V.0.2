package com.mywebpage.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mywebpage.drivers.BaseDriver;


public class IndexPage extends BaseDriver
{
	protected WebElement testSignIn;
	public IndexPage()
	{
		driver.get("http://automationpractice.com/index.php");
		testSignIn = driver.findElement(By.className("login"));
	}
	public void signUp()
	{
		testSignIn.click();	
	}
}
