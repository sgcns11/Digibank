package com.banking.Digibank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultiSelect {
	WebDriver driver ;
	String appurl="https://www.letskodeit.com/practice";
  @Test
  public void MulitSelect() throws InterruptedException {
	  WebElement ddfruits=driver.findElement(By.id("multiple-select-example"));
	  Select s1=new Select(ddfruits);
	  s1.selectByIndex(1);
	  s1.selectByIndex(2);
	  Thread.sleep(2000);
	  System.out.println(s1.getAllSelectedOptions().size());
	  s1.deselectByIndex(2);
	  Thread.sleep(2000);
	  System.out.println(s1.getFirstSelectedOption().getSize());
	  System.out.println(s1.getFirstSelectedOption().getText());
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


