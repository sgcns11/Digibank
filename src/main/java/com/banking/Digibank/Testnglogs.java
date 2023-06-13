package com.banking.Digibank;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Testnglogs {
	@Test(priority =1)
	public void Login()
	{
		System.out.println("Executing Login");
	}
	@Test(priority =3)
	public void Fundtransfer()
	{
		System.out.println("Executing Fundtransfer");
	}
	@Test(priority =2)
	public void UpdateAddress()
	{
		System.out.println("Executing UpdateAddress");
	}	
	
	@BeforeTest
	public void LaunchBrows()
	{
		System.out.println("Launch Browser");
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		System.out.println("Close Browser");
	}
	
	
}
