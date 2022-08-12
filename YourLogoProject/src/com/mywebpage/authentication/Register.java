package com.mywebpage.authentication;

import org.openqa.selenium.WebElement;

import com.mywebpage.drivers.BaseDriver;

public class Register extends BaseDriver
{
	 protected WebElement email;
	public Register(String url)
	{
		driver.get(url);
		
	}
}
