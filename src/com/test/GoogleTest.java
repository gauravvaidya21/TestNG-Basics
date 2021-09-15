package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver 92.0.4515.107\\chromedriver_win32\\chromedriver.exe");
	     driver =new ChromeDriver(); //launch chrome
	     
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.get("http://www.google.com");
	}
	
	
	@Test(priority=3,groups="Title")
	
	public void googleTitleTest()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=1,groups="Logo")
	public void googleLogoTest()
	{
		boolean visible=driver.findElement(By.cssSelector(".lnXdpd")).isDisplayed();	
		System.out.println(visible);
      
	}
	
	@Test(priority=2,groups="Linktest")
	public void gmailLinkTest()
	{
		boolean visible=driver.findElement(By.xpath("//a[@class='gb_f' and @data-pid='23']")).isDisplayed();
		System.out.println(visible);
	}
	
	@Test(groups="simple test")
	public void test1()
	{
		System.out.println("first test");
	}
	
	@Test(groups="simple test")
	public void test2()
	{
		System.out.println("second test");
	}
	
	@AfterMethod
	
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
