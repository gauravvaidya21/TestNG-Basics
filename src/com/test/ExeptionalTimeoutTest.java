package com.test;

import org.testng.annotations.Test;

public class ExeptionalTimeoutTest {

	/*
	@Test(invocationTimeOut=2,expectedExceptions=NumberFormatException.class)
	public void infiniteLoop() {
		int i=1;
		while(i==1)
		{
			System.out.println(i);
		}
	}
 */
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test()
	{
		String s="1000A";
		Integer.parseInt(s);
	}
}
