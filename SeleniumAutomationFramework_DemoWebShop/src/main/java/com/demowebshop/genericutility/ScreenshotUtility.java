package com.demowebshop.genericutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {
	public void TakeScreenShotOfPage(WebDriver driver ) throws IOException
	{
		JavaUtility ju = new JavaUtility();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		File  permanant = new File("./FailureScreenshot/Failed_Demoweb_ss"+ju.getTimeStamp()+".jpg");
		
		FileHandler.copy(temp, permanant);
		
	}
	
	public void TakeScreenShotOfElement(WebElement TargetEle ) throws IOException
	{
		JavaUtility ju = new JavaUtility();
		
	//WebElement interface directly attahed to TakeScreenshot means there is relation between them 
		
		File temp = TargetEle.getScreenshotAs(OutputType.FILE);
		
		File  permanant = new File("./FailureScreenshot/Failed_Demoweb_ss"+ju.getTimeStamp()+".jpg");
		
		FileHandler.copy(temp, permanant);
		
	}
	
	
}
