package com.banking.Digibank;

import org.testng.annotations.Test;

public class GroupsDemo2 {

  @Test(priority = 5,groups="Module02")
  public void TestCase01() {
	  System.out.println("Executing method1");
  }
  
  @Test(priority = 3,groups="Module02")
  public void TestCase02() {
	  System.out.println("Executing method2");
  }
}
