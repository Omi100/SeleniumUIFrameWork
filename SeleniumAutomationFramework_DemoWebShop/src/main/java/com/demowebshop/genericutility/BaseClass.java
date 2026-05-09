package com.demowebshop.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static FileUtility f;
	public static ExcelUtility excel;
	public static JavaUtility ju;
	public static String url;
	public static String username;
	public static String password;
	public static String browser;
	public static WebDriver driver;
	public static WebDriverUtility wdu;
	
	
	
	
	@BeforeSuite
	public void configbeforeSuite()
	{
		System.out.println("--Triggering Suite execution and connceting to the DataBase---");
	}
	
	@BeforeTest
	public void configBeforeTest()
	{
		System.out.println("---Triggering test Execution and configuring- The Environment Setting--");
	}
	
	@BeforeClass
	public void configBeforeClass() throws IOException
	{
		
		
		f = new FileUtility();
		
		ju = new JavaUtility();
		
		excel = new ExcelUtility();
		
		wdu = new WebDriverUtility();
		
		url = f.fetchDataFromKeyOfPropertiesFile("URL");
		
		browser = f.fetchDataFromKeyOfPropertiesFile("Browser");
		
		username = f.fetchDataFromKeyOfPropertiesFile("Email");
		
		password = f.fetchDataFromKeyOfPropertiesFile("Password");
		
	
		
	}
	
	@BeforeMethod
	public void configBeforeMethod()
	{
		
		
		if(browser.contains("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.contains("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.contains("Safari"))
		{
			driver = new SafariDriver();
		}
		else
		{
			driver = new EdgeDriver();
		}
		
		wdu.maximizeThWindow(driver);
		wdu.addGloablWait(driver, 15);
		wdu.openWebPage(driver, url);
		
		
	}
	
	@AfterMethod
	public void configAfterMethod()
	{
		wdu.quitBrowser(driver);
	}
	
	@AfterClass
	public void configAfterClass()
	{
		System.out.println("--Class Execution Terminated--");
	}
	
	@AfterTest
	public void configAfterTest()
	{
		System.out.println("--Test Execution Terminated--");
	}
	
	@AfterSuite
	public void configAfterSuite()
	{
		System.out.println("--suite execcution is terminated and disconnecting from databse--");
	}
	
	
}
