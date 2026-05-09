package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(partialLinkText = "Log in")
	private WebElement LoginLink;
	
	@FindBy(partialLinkText = "Log out")
	private WebElement LogoutLink;
	
	@FindBy(xpath = "//h1[text()='My account - Customer info']")
	private WebElement MyAccountLink;
	
	@FindBy(partialLinkText = "Register")
	private WebElement RegistrationLink;
	
	public WebElement getLoginLink() {
		return LoginLink;
	}

	public WebElement getLogoutLink() 
	{
		return LogoutLink;
	}
	
	public WebElement getMyAccountLink()
	{
		return MyAccountLink;
	}
	
	public WebElement getRegistrationLink()
	{
		return RegistrationLink;
	}
	//Business Logic
	
	public void clickOnLoginLink()
	{
		getLoginLink().click();
	}
	
	public void clickOnLogoutLink()
	{
		getLogoutLink().click();
	}
	
	public void clickOnRegistraitonLink()
	{
		RegistrationLink.click();
	}
	
	
	
	
	
	
	
	
}
