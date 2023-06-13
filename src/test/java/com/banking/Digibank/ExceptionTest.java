package com.banking.Digibank;
import java.io.IOException;

import org.testng.annotations.Test;

public class ExceptionTest {
  @Test(expectedExceptions=IOException.class)
  public void Test01() throws Exception {
	  throw new IOException();
	 
  }
  
  @Test(expectedExceptions= NullPointerException.class)
  public void Test02() throws Exception {
	  throw new NullPointerException();
	  
  }
}
