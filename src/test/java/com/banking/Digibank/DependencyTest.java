package com.banking.Digibank;

import org.testng.Assert;
import org.testng.annotations.Test;



public class DependencyTest {
  @Test(dependsOnMethods= {"Login"})
  public void FundTransfer() {
	  System.out.println("Fund Transfer method called");
	  
  }
  @Test
  
  public void Login() {
	  System.out.println("login method called");
	  Assert.assertTrue(false);//Login false hence the fund-transfer cannot be executed
	  }
}
