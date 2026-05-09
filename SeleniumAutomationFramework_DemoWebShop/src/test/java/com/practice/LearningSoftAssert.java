package com.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningSoftAssert {
	
	@Test 
	public void sumofTwo()
	{
		int a = 10;
		int b = 20;
		
		int sum = a - b;
		
		SoftAssert s = new SoftAssert();
		
		s.assertEquals(a+b, sum);	 //here its supposed to be fail but its getting passed because here tes-script is letting go this line 
		
		Reporter.log("Test casse is Failed",true);
		//s.assertAll(); //whenever we will call this method it will act like harddAssert
	}
}
