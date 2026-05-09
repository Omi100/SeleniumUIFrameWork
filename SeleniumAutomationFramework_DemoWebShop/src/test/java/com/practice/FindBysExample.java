package com.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FindBysExample {
	
	WebDriver driver;
	
	public FindBysExample(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBys({
		@FindBy(id="pollanswers-1"),
		@FindBy(xpath="//input[@value='1']")
	})
	private WebElement ExcellentRadioBtn;
	
	@FindBys({
		@FindBy(id="pollanswers-2"),
		@FindBy(xpath="//input[@value='2']")
	})
	private WebElement GoodRadioBtn;
	
	//Business Logic 
	
	public WebElement getExcellentRadioBtn()
	{
		return ExcellentRadioBtn;
	}
	
	public WebElement getGoodRadioBtn()
	{
		return GoodRadioBtn;
	}
	
	//main method 
	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		FindBysExample fbe = new FindBysExample(driver);
		
		fbe.getExcellentRadioBtn().click();
		
		fbe.getGoodRadioBtn().click();
	}
	
	
	
	
	
}
