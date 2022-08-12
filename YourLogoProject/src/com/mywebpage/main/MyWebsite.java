package com.mywebpage.main;

import com.mywebpage.addtocart.AddToCart;
import com.mywebpage.authentication.Register;
import com.mywebpage.authentication.SignUp;
import com.mywebpage.homepage.HomePage;
import com.mywebpage.homepage.IndexPage;

public class MyWebsite
{
	public static void main(String[] args) 
	{
		int option = 5	;
		switch (option) 
		{
		case 1:
			IndexPage indexpage = new IndexPage();
			indexpage.signUp();
			indexpage.close();
			break;
			
		case 2:
			Register register = new Register("http://automationpractice.com/index.php?controller=authentication&back=my-account");
			System.out.println("Register is done succesfully");
			register.close();	
			
		case 3:
			SignUp signup = new SignUp("http://automationpractice.com/index.php?controller=authentication&back=my-account");
			try 
			{
				signup.login();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("SignUp is done successfully");
			signup.close();
			break;
		case 4:
			HomePage homepage = new HomePage("http://automationpractice.com/index.php");
			homepage.getproduct();
			homepage.close();
			break;
			
		case 5:
			AddToCart addtocart = new AddToCart();
			addtocart.placeorder();
			break;
			
		default:
			System.out.println("Incorrect option selected");
			break;
		}
		
		
	}

}
