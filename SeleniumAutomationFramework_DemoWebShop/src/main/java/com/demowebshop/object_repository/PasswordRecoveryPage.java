package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordRecoveryPage {
	
	public WebDriver driver;
	
	public PasswordRecoveryPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	@FindBy(name = "send-email")
	private WebElement recoverButton;
	
	@FindBy(css = "[class='result']")
	private WebElement recoveryMsg;
	
	//Getters Method
	
	public WebElement getYourEmeialAddressTextField()
	{
		return emailTextField;
	}
	
	public WebElement getRecoveryButton()
	{
		return recoverButton;
	}
	
	public WebElement getRecoveryMessage()
	{
		return recoveryMsg;
	}
	
	
	//Business Logic
	
	public void recoverPassword(String email)
	{
		getYourEmeialAddressTextField().sendKeys(email);
		getRecoveryButton().click();
	}
	
	public String fetchRecoveryMessage()
	{
		return getRecoveryMessage().getText();
	}
	
}
