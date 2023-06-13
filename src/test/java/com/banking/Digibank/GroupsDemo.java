package com.banking.Digibank;

import org.testng.annotations.Test;

public class GroupsDemo {
	
  @Test(priority = 2,groups="Module01")
  public void TestCase01() {
	  System.out.println("Executing method1");
  }
  
  @Test(priority = 1,groups="Module01")
  public void TestCase02() {
	  System.out.println("Executing method2");
  }
  
  @Test(priority = 4,groups="Module01")
  public void TestCase03() {
	  System.out.println("Executing method3");
  }
  
  @Test(priority = 5,groups="Module02")
  public void TestCase04() {
	  System.out.println("Executing method4");
  }
  
  @Test(priority = 3,groups="Module02")
  public void TestCase05() {
	  System.out.println("Executing method5");
  }
  
}
