package com.demowebshop.genericutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnersImplimetation extends BaseClass implements ITestListener{

	@Override
	public void onStart(ITestContext context) {
	
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test Case Execution Started",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Case Execution passed",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		
		Reporter.log("Test Case Execution Failes",true);
		
		ScreenshotUtility su = new ScreenshotUtility();
		try {
			su.TakeScreenShotOfPage(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		 Reporter.log("Test case Execution Skipped");
	}

	

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
