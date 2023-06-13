package com.banking.Digibank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAsserts {
	WebDriver driver ;
	String appurl="https://www.letskodeit.com/practice";
  @Test(priority=1)
  public void VerifyRadiaButton() throws InterruptedException {	 
		WebElement Radiobmw = driver.findElement(By.id("bmwradio"));
		Radiobmw.click();
		Thread.sleep(2000);
		System.out.println("Radio button:"+Radiobmw.isSelected());	
		Assert.assertEquals(Radiobmw.isSelected(), false);
  }
  @Test(priority=2)
  public void VerifyCheckBox() throws InterruptedException {	
		WebElement Chkboxbmw = driver.findElement(By.id("bmwcheck"));
		Chkboxbmw.click();
		Thread.sleep(2000);
  }
  @BeforeTest
	public void LaunchBrows()
	{
		System.out.println("Launch Browser");
		 System.setProperty("webdriver.edge.driver","C:\\SeleniumDrivers\\edgedriver\\msedgedriver.exe");
		  driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(appurl);	
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		System.out.println("Close Browser");
		driver.close();
	}
	
	@BeforeMethod()
	public void VerifyTitle()
	{
		System.out.println("Run before each test in a class is executed");
		driver.get(appurl);
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Practice Page");// check for expected and actual test
	}
	
	@AfterMethod()
	public void VerifyHomePage()
	{
		System.out.println("Run after each test in a class is executed");
		WebElement Homelink = driver.findElement(By.linkText("HOME"));
		Homelink.click();
		System.out.println(driver.getTitle());
		
	}
	
}
