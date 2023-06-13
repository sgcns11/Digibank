package com.banking.Digibank;

import org.testng.annotations.Test;

public class TimeTest {
  @Test
  public void Testone() throws InterruptedException {
	  Thread.sleep(1000);
	  System.out.println("Test Method one called");
  }
  @Test
  public void Testtwo() throws InterruptedException {
	  Thread.sleep(200);
	  System.out.println("Test Method two called");
  }
}
