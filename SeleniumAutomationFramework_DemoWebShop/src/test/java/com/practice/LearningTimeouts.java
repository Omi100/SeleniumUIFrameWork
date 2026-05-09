package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningTimeouts {
	
	@Test(timeOut = 3000)//timeOut accept long millisecond
	public void testScript() throws InterruptedException
	{
		System.out.println("Executing Method in 1 millisecond");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2);
	}
}
