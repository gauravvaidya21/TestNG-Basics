package com.dataprovider.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HalfEbeyTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver 92.0.4515.107\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2Fb%2FBaby-Essentials%2F2984%2Fbn_1854104");
	}
	
	@DataProvider
	public void getTestdata() {
		
		
	}
	
	@Test
	public void ebeyregistrationpagetest() {
		
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("gaurav");	
		
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("vaidya");
		
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("gauravvaidya13@yahoo.in");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("gaurav@1234");
	}
	
	@AfterMethod
	public void tearDown() {
		
		//driver.quit();
	}
}
