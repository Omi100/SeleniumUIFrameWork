package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountCustomerInfoPage {
	
	WebDriver driver;
	
	public MyAccountCustomerInfoPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='header-links']/..//a[@class='account']")
	private WebElement goToAccountBtn;
	
	public WebElement getAccountBtn()
	{
		return goToAccountBtn;
	}
	
	//Business Logic
	
	public void clickOnAccountBtn()
	{
		getAccountBtn().click();
	}
}
