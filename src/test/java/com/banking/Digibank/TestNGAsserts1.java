package com.banking.Digibank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAsserts1 {
	WebDriver driver ;
	String appurl="https://www.gmail.com";
	 @BeforeTest
		public void LaunchBrows()
		{
			System.out.println("Launch Browser");
			 System.setProperty("webdriver.edge.driver","C:\\SeleniumDrivers\\edgedriver\\msedgedriver.exe");
			  driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.get(appurl);	
  }
	 @Test
	 public void testmethodone() {
		 System.out.println("Test method executed");
		 SoftAssert softAssert = new SoftAssert();
		 
		softAssert.assertEquals(true,  true);
		 System.out.println("Mext statement1  method executed");
		 softAssert.assertEquals(true, false);
		 System.out.println("Mext statement2  method executed");
		 softAssert.assertAll();
	 }
	 @Test
	 public void testmethodotwo() {
		 System.out.println("Test method two  executed");
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(true, false);
		 softAssert.assertAll();
		 }
	 @Test
	 public void CloseBrowser()
		{
			System.out.println("Close Browser");
			driver.close();
}

	 @Test
	 public void testmethodothree() {
		 System.out.println("Test method two  executed");
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(true, true);
		 softAssert.assertAll();
		 }
	 
}
