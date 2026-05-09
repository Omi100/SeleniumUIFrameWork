package com.practice;

import org.testng.annotations.Test;

public class LearningInvocationCount {
	@Test(priority = 0,invocationCount = 1)
	public void register()
	{
		System.out.println("---Register New Patient---");
	}
	
	@Test(priority = 1,invocationCount = 3)
	public void appointment()
	{
		System.out.println("---Appointing Patient To Doctor---");
	}
	
	@Test(priority = 2,invocationCount = 2)
	public void diagnosis()
	{
		System.out.println("---Diagnosing the Patient---");
	}
	
	@Test(priority = 3,invocationCount = 0)
	public void bloodTesting()
	{
		System.out.println("---Performing The Blood Test on Patient---");
	}
	
}
