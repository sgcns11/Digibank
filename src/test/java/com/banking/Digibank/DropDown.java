package com.banking.Digibank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDown {
	WebDriver driver ;
	String appurl="https://www.letskodeit.com/practice";
  @Test
  public void DropdownTest() throws InterruptedException {
	  
	  //code to select individual item
	  WebElement ddnCars=driver.findElement(By.id("carselect"));
	  Select s1=new Select(ddnCars);
	  s1.selectByVisibleText("Honda");
	  Thread.sleep(2000);
	  s1.selectByIndex(0);
	  Thread.sleep(2000);
	  s1.selectByValue("benz");
	  Thread.sleep(2000);
	  
	  //code to select all items in dropdown
	  /*
	  WebElement selectElem=driver.findElement(By.id("carselect"));
	  for(WebElement option : selectElem.findElements(By.tagName("option"))) {
		 option.click(); 
		 Thread.sleep(2000);
		  */
	  }
	  

  @BeforeMethod
  public void  hiturl() {
	  System.setProperty("webdriver.edge.driver","C:\\SeleniumDrivers\\edgedriver\\msedgedriver.exe");
	  driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(appurl);	
  }
  
  @AfterMethod
  public void CloseButton() 
		{
			System.out.println("Close Browser");
			driver.close();
		}
  
  
}

