package com.practice;

import org.testng.annotations.Test;

public class LearningThreadPoolSize {
	
	@Test(invocationCount = 20,threadPoolSize = 5)
	public void runMultipleTimes()
	{
		System.out.println("--Rerunning Execution--");
	}
}
