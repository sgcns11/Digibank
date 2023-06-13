package com.banking.Digibank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButton {
	WebDriver driver ;
	String appurl="https://www.letskodeit.com/practice";
  @Test
  public void TestRadioButton() throws InterruptedException {	
		WebElement rdbutton1=driver.findElement(By.xpath("//input[@name='cars' and @value='honda']"));
		rdbutton1.click();
		Thread.sleep(500);
		System.out.println(rdbutton1.isSelected());
		WebElement rdbutton2=driver.findElement(By.xpath("//input[@name='cars' and @value='bmw']"));
		System.out.println(rdbutton2.isSelected());
		
		for (WebElement rb : driver.findElements(By.xpath("//input[@name='cars' and @type='radio']"))) { // select multiple option 
						rb.click();
						Thread.sleep(500);
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
