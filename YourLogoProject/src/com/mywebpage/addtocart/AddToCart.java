package com.mywebpage.addtocart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.mywebpage.drivers.BaseDriver;

public class AddToCart extends BaseDriver
{
	protected WebElement addtobtn;
	protected WebElement orderpagechkout;
	protected WebElement addresspagechkout;
	protected WebElement testcheckbox;
	protected WebElement shippingpagechkout;
	protected WebElement paymentpage;
	protected WebElement confirmOrderPage;
	public AddToCart()
	{
		driver.get("http://automationpractice.com/index.php?id_product=1&controller=product");
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);	
		addtobtn = driver.findElement(By.name("Submit")); // adding items to cart
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);	
		WebElement ptochck = driver.findElement(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ptochck);
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		orderpagechkout = driver.findElement(By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span"));
		
		addresspagechkout = driver.findElement(By.cssSelector("#center_column > form > p > button > span"));
		
		testcheckbox = driver.findElement(By.cssSelector("#cgv"));	
		
		shippingpagechkout = driver.findElement(By.cssSelector("#form > p > button > span"));
		
		paymentpage = driver.findElement(By.partialLinkText("Pay by bank wire"));
		
		confirmOrderPage = driver.findElement(By.cssSelector("#cart_navigation > button > span"));		
	}
	
	public void placeorder()
	{
		addtobtn.click();
		orderpagechkout.click();
		addresspagechkout.click();
		testcheckbox.click();
		shippingpagechkout.click();
		paymentpage.click();
		confirmOrderPage.click();
	}

}
