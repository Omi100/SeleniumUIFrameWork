package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	
	@FindBy(css = "[value='Log in']")
	private WebElement LoginBtn;

	@FindBy(partialLinkText = "Forgot password?")
	private WebElement ForgotPassLink;
	
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
	public WebElement getForgotPassLink()
	{
		return ForgotPassLink;
	}
	
	//Business Logic
	
	public void loginWithValidUserr(String email,String password)
	{
		getEmailTextField().sendKeys(email);
		getPasswordTextField().sendKeys(password);
		getLoginBtn().click();
	}
	
	
	public void clickOnForgotPass()
	{
		ForgotPassLink.click();
	}
		
		
}
