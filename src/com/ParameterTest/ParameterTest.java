package com.ParameterTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;
	
	@Test
	@Parameters({"env","chrome","url","emailid"})
	public void yahooLoginTest(String env,String browser,String url,String emailid)
	{
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver 92.0.4515.107\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browser.equals("ff")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Downloads\\geckodriver\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get(url);
		
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys(emailid);
		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
	}
}
