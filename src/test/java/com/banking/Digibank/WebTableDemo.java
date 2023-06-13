package com.banking.Digibank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTableDemo {
	WebDriver driver ;
	String appurl="https://www.letskodeit.com/practice";
  @Test
  public void WebTableDemoTest() {
	  
	  /*th=header. tr=row and td=column ,cell
	   Step1 - Identify rows and columns of a table
	   */
	  int row_count=driver.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
	  System.out.println("Number of rows:"+ row_count);
	  //no of column in a table
	  int col_count=driver.findElements(By.xpath("//table[@id='product']/tbody/tr[2]/td")).size();
	  System.out.println("Number of Columns:"+ col_count);
	  
	  for(int i=2;i<=row_count;i++)
	  {
		  for (int j=1; j<=col_count;j++)
		  {
	  System.out.println(driver.findElement(By.xpath("//table[@id='product']/tbody/tr["+i+"]/td["+j+"]")).getText());
	  System.out.print("\u0009");
		  }
		  System.out.println("");
	  }//Fetching all the values of the second column
	  
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



