package com.banking.Digibank;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo01 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe"); 
		//ChromeDriver driver=new ChromeDriver();
		System.setProperty("webdriver.edge.driver","C:\\SeleniumDrivers\\edgedriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.amazon.com/");
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Iphone 14");
		searchBox.submit();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@id='p_89/Apple']//i[@class='a-icon a-icon-checkbox']")).click();
		//Thread.sleep(500);
		driver.findElement(By.xpath("//li[@id='p_n_feature_twelve_browse-bin/14674911011']//i[@class='a-icon a-icon-checkbox']")).click();
		//Thread.sleep(500);
		driver.findElement(By.linkText("Apple iPhone 14 Pro, 128GB, Deep Purple - Unlocked (Renewed Premium)")).click();
		//Thread.sleep(500);
		Select quantity = new Select(driver.findElement(By.xpath("//select[@id='quantity']")));
		quantity.selectByIndex(1);
		
	}

}
