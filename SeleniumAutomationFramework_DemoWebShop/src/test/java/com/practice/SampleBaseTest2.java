package com.practice;

import org.testng.annotations.Test;

//In SampleBaseTest we have all the BaseTest and now we are extending this following class to that baseTestclass 

class SampleBaseTest2 extends SampleBaseTest {
	
	//Now if we try to run any of this method individually according to annotation it will run 
	@Test
	public void m1()
	{
		System.out.println("Executing m1 method from sampleBaseTest2");
	}
	@Test
	public void m2()
	{
		System.out.println("Executing m2 method from samplebaseTest2");
	}
}


class SampleBase3 extends SampleBaseTest{
	@Test
	public void m3()
	{
		System.out.println("Executing m3 method from sampleBase3");
	}
	
	@Test
	public void m4()
	{
		System.out.println("Executing m4 method from sampleBase3");
	}
}