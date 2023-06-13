package com.banking.Digibank;

import org.testng.annotations.Test;

public class DisabledTest {

	  @Test
	  public void testMethodone () {
		  
		  System.out.println("test method one");
	  
  }
	  @Test(enabled=false)
	  public void testMethodtwo () {
		  
		  System.out.println("test method two");
	  
  }
	  @Test
	  public void testMethodThree () {
		  
		  System.out.println("test method three");
	  
  }
}
