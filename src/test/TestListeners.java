package test;

import org.testng.ITestListener;
import org.testng.annotations.Test;

public class TestListeners implements ITestListeners {
  @Test
  public void onStart(ITestContext context)
  {
	 System.out.println("Test01"); 
  }
}
