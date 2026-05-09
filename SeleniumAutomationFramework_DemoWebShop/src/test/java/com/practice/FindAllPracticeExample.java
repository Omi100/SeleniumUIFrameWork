package com.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FindAllPracticeExample {
	
	
	//Here we are dealing with 2 sites with same methods and annotation 
	
	WebDriver driver;
	
	public FindAllPracticeExample(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	static String orangeurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	static String saucedemourl = "https://www.saucedemo.com/";
	
	static String OrangeHrmUn = "Admin";
	static String SauceDemoUn = "standard_user";
	
	static String OrangePass = "admin123";
	static String SauceDemoPass = "secret_sauce";

	@FindAll({
		@FindBy(name ="username"),
		@FindBy(id ="user-name")
	})
	private WebElement UserNameTextField;
	
	@FindAll({
		@FindBy(name="password"),
		@FindBy(id="password")
	})
	private WebElement PasswordTextField;

	@FindAll({
		@FindBy(css="[type='submit']"),
		@FindBy(id="login-button")
	})
	private WebElement LoginBtn;
	
	public void loginToWebPage(String un , String pwd)
	{
		UserNameTextField.sendKeys(un);
		PasswordTextField.sendKeys(pwd);
		LoginBtn.click();
	}
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(saucedemourl);
		
		FindAllPracticeExample fib = new FindAllPracticeExample(driver);
		
		fib.loginToWebPage(SauceDemoUn,SauceDemoPass);
		
		
	}
}


