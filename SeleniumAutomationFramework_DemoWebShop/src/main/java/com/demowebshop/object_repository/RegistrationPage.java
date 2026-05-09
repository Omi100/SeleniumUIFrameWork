package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class RegistrationPage {
	
	WebDriver driver;
	
		
	public RegistrationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="gender-male")
	private WebElement MalegenderRadioBtn;
	
	@FindBy(id="gender-female")
	private WebElement FemalegenderRadioBtn;
	
	@FindBy(id="FirstName")
	private WebElement firstNameTextField;

	@FindBy(id="LastName")
	private WebElement lastNameTextField;
	
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPassTextField;
	
	@FindBy(id="register-button")
	private WebElement registerButton;


	public WebElement getMalegenderRadioBtn() {
		return MalegenderRadioBtn;
	}

	public WebElement getFemalegenderRadioBtn() {
		return FemalegenderRadioBtn;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getConfirmPassTextField() {
		return confirmPassTextField;
	}
	
	public WebElement getRegisterButton()
	{
		return registerButton;
	}
	
	
	//Business Logic
	
	public void RegisterNewUser(String gender,String fn,String ln,String email,int randomNumber,String emailprovider,String pass , String cpass)
	{
		
		if(gender=="Male")
		{
			MalegenderRadioBtn.click();
		}
		else
		{
			FemalegenderRadioBtn.click();
		}
		
		firstNameTextField.sendKeys(fn);
		lastNameTextField.sendKeys(ln);
		emailTextField.sendKeys(email+randomNumber+emailprovider);
		passwordTextField.sendKeys(pass);
		confirmPassTextField.sendKeys(cpass);
		registerButton.click();
		
	}
	
}
