package com.banking.Digibank;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleDataProvider {
	@DataProvider(name ="browserdata")
	public Object[][] dataProviderMethod()
	{
		return new Object[][] {{"chrome"},{"firefox"},{"safari"}};
	}
	
  @Test(dataProvider="browserdata")
  public void testMethod(String data) {
	  System.out.println("Browser executed:"+ data );
  }
}
