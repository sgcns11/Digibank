package com.banking.Digibank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameDemo {
	WebDriver driver ;
	String appurl="https://www.letskodeit.com/practice";
  @Test
  public void frmaeDemoTest() throws InterruptedException {
	  driver.switchTo().frame("courses-iframe");
	    WebElement txtSearch=driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));
	    txtSearch.click();
	    System.out.println("success");
	    driver.switchTo().defaultContent();
	    for (WebElement rb : driver.findElements(By.xpath("//input[@name='cars' and @type='radio']"))) {
			rb.click();
			System.out.println(rb.isSelected());
			Thread.sleep(2000);
	    }

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
