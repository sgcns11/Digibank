package com.banking.Digibank;

import org.testng.annotations.Test;

public class ParallelTestone {
  @Test
  public void testMethodone() {
		 long id=Thread.currentThread().getId();
		 System.out.println("Thread C1 id is :"+id);
	  }
	  @Test
	  public void testMethodtwo() {
		 long id=Thread.currentThread().getId();
	 System.out.println("Thread C1 id of methodtwo  is :"+id);
	  }
}
