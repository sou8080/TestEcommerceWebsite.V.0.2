package com.mywebpage.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.mywebpage.authentication.SignUp;

public class HomePage extends SignUp
{
	protected WebElement txtboxSearch;
	protected WebElement dropdwnSort;
	protected WebElement getproduct;

	public HomePage() 
	{
		driver.get("http://automationpractice.com/index.php?controller=my-account");
		
		txtboxSearch = driver.findElement(By.id("search_query_top"));
		
		dropdwnSort = driver.findElement(By.id("selectProductSort"));
		Select selectsortby = new Select(dropdwnSort);
		selectsortby.selectByIndex(1);
		
		getproduct =  driver.findElement(By.linkText("Faded Short Sleeve T-shirts"));		
	}
	public HomePage(String url)
	{
		driver.get(url);
		
		txtboxSearch = driver.findElement(By.id("search_query_top"));
		
		dropdwnSort = driver.findElement(By.id("selectProductSort"));
		Select selectsortby = new Select(dropdwnSort);
		selectsortby.selectByIndex(1);
		
		getproduct =  driver.findElement(By.linkText("Faded Short Sleeve T-shirts"));
	}
	 public void getproduct()
	 {
		 txtboxSearch.sendKeys("dresses");
		 txtboxSearch.submit(); 
		 getproduct.click();
	 }	
}
