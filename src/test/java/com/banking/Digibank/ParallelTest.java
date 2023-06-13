package com.banking.Digibank;

import org.testng.annotations.Test;

public class ParallelTest {
  @Test
  public void testMethodone() {
	 long id=Thread.currentThread().getId();
	 System.out.println("Thread C2 id is :"+id);
  }
  @Test
  public void testMethodtwo() {
	 long id=Thread.currentThread().getId();
	 System.out.println("Thread C2 id of methodtwo  is :"+id);
  }
}
