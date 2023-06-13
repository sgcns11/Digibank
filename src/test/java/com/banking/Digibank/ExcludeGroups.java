package com.banking.Digibank;

import org.testng.annotations.Test;

public class ExcludeGroups {
  @Test(groups ="include-group")
  public void testMethodone () {
	  
	  System.out.println("test method one belongs to include group");
  }
	  @Test(groups ="include-group")
	  public void testMethodtwo () {
		  
		  System.out.println("test method two belongs to include group");
	  }
		  @Test(groups ={"include-group","exclude-groups"})
		  public void testMethodthree () {
			  
			  System.out.println("test method three belongs to include group");
  }
		  @Test(groups ="exclude-groups")
		  public void Regression () {
			  
			  System.out.println("test method three belongs to include group");
  }
}
