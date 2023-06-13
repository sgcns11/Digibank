package com.Excel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.Utilities.ExcelReader;

public class LoginData {
public static ExcelReader excel =new ExcelReader (System.getProperty("user.dir")+ "\\src\\resources\\TestData.xlsx");
String SheetName="LoginData";
  @Test
  public void testReadExcelData() {

  }
  @DataProvider(name ="browserdata")
	public Object[][] dataProviderMethod()
	{
	int rows = excel.getRowCount(SheetName);
	int cols =	excel.getColumnCount(SheetName);
	   Object [][] data = new Object [rows -1][cols];
	   for(int rowNum=2; rowNum<=rows;rowNum++)
	   {
		   for (int colNum=0;colNum<cols;colNum++)
		   {
			   //System.out.println(excel.getCellData(SheetName, colNum, rowNum)) ;
			   data [rowNum-2][colNum]  = excel.getCellData(SheetName, colNum, rowNum);
		   }
	   }
		return data;
	  //return new Object[][] {{"chrome"},{"firefox"},{"safari"}};
	}
	
@Test(dataProvider="browserdata")
public void testReadExcelData(String NAME, String EmpId) {
	  System.out.println("NAME:"+ NAME );
	  System.out.println("Emp Id:"+ EmpId );
}
}
