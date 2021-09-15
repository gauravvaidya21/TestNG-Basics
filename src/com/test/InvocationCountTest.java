package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test(invocationCount=10)
	public void arethmatic()
	{
		int a=100;
		int b=900;	
		System.out.print(a+b);
	}
}
