package com.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
	
	@DataProvider(name = "TestDataProvider")
	public Object[][] getData()
	{
		return new Object[][] {
			{"admin","admin123"},
			{"user","user123"},
			{"tester","tester123"}
			
		};
	}



@Test(dataProvider = "TestDataProvider")
public void sampleLoginTest(String username,String password)
{
	System.out.println("My Username is:"+username+"My Password is:"+password);
}
}