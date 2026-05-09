package com.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeAssertion {
	@Test
	public void add()
	{
		
		//Here if the condition fails it will execute else block either testNg will not look into java internal error it will not caught by tesng
		int a = 10;
		int b = 5;
		int sum = 15;
		
		if(a+b==sum)
		{
			System.out.println("Pass");
		}
		else
		{
			System.err.println("Fail");
		}
	}
	
	
	@Test
	public void addAssert()
	{
		int a = 10;
		int b = 20;
		int sum =a-b;
		
		Assert.assertEquals(a+b,sum); //Here our testng is showing test is failed
	}
	
	
}
