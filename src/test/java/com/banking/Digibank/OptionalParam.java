package com.banking.Digibank;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParam {
  @Test
  @Parameters({"username"})
  public void testMethodone(@Optional("Stoumee") String name) 
  {
	  System.out.println("Parameters one for test method one:" + name);
  }
}
