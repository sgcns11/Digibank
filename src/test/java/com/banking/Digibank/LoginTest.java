package com.banking.Digibank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTest {
	
	//Create a web driver reference variable
	ChromeOptions chromeOptions;
	WebDriver driver;
	
	public HotelLoginPage(WebDriver driver)
	{
		this .driver=driver;
	}
	
	By username=By.id("//imput[@id ='username']") ;
	By password=By.id(password) ;
	By btnLogin=By.id(Login) ;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
