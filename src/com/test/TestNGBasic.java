package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasic {

	/*   
	 * expected op
	 * 
	set up system properties
    Launch Chome browser
	enter url
	
	login to app
	gmail link test
	delete all cookies
	
	login to app
	google logo test
	delete all cookies
		
	login to app
	google title test
	delete all cookies
	
	
	close browser
	logout from app
	Generate test report for test cases
	 */
	
	
	
	
	//precondition annotation starting with----@Before
	@BeforeSuite
	public void setup()//1
	{
		System.out.println("set up system properties");
	}
	

	@BeforeTest//2
	public void launchBrowser()
	{
		System.out.println("Launch Chome browser");
	}
	
	
	@BeforeClass//3
	public void enterURL()
	{
		System.out.println("enter url");
	}
	
	
	@BeforeMethod//4   --run separately for every test case
	public void Login()
	{
		System.out.println("login to app");
	}
	
	
	//test condition starting with ---@test  
	@Test  //5
	public void googleTitle()
	{
		System.out.println("google title test");
	}
	
	@Test
	public void gmailTitle()
	{
		System.out.println("gmail link test");
	}
	
	@Test
	public void googleLogo()
	{
		System.out.println("google logo test");
	}
	
	//post condition start with----@After
	@AfterMethod   //6            --run separately for every test case
	public void deleteCookies()
	{
		System.out.println("delete all cookies");
	}
	
	@AfterClass  //7
	public void closeBrowser()
	{
		System.out.println("close browser");
	}
	
	@AfterTest   //8
	public void logOut()
	{
		System.out.println("logout from app");
	}
	
	@AfterSuite
	public void generateTestReport()
	{
		System.out.println("Generate test report for test cases");
	}
}
