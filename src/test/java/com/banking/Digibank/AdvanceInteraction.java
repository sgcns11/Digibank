package com.banking.Digibank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdvanceInteraction {
	WebDriver driver ;
	String appurl="http://jqueryui.com/selectable";
  @Test
  public void advanInter() throws InterruptedException {
	  driver.switchTo().frame(1);
	  WebElement item01=driver.findElement(By.xpath("//li[normalize-space()='Item 1']"));
	  item01.click();
	  Thread.sleep(2000);
	  
  }
  @BeforeMethod
  public void  hiturl() throws InterruptedException {
	  System.setProperty("webdriver.edge.driver","C:\\SeleniumDrivers\\edgedriver\\msedgedriver.exe");
	  driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(appurl);	
		Thread.sleep(2000);
  }
  
  @AfterMethod
  public void CloseButton() 
		{
			System.out.println("Close Browser");
			driver.close();
		}
  
  
}
