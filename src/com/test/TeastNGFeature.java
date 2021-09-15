package com.test;

import org.testng.annotations.Test;

public class TeastNGFeature {
	
	@Test
	public void loginTest()
	{
		System.out.println("login");
		int i=9/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homePage() {
		
		System.out.println("home page");
	}

}
