package com.demowebshop_LoginPage;


import java.io.IOException;




import org.openqa.selenium.WebElement;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demowebshop.genericutility.BaseClass;

import com.demowebshop.object_repository.HomePage;
import com.demowebshop.object_repository.LoginPage;
import com.demowebshop.object_repository.MyAccountCustomerInfoPage;
import com.demowebshop.object_repository.PasswordRecoveryPage;

@Listeners(com.demowebshop.genericutility.ListnersImplimetation.class)
public class LoginPageTest extends BaseClass{
	
	@Test
	public void loginAsValidUserTest() throws IOException {
		
		
		//Create an Object of HomePage
		
		HomePage home = new HomePage(driver);
		LoginPage login = new LoginPage(driver);
		MyAccountCustomerInfoPage account = new MyAccountCustomerInfoPage(driver);
		
		//2)Navigate to DemoWebShop Application
		
				
				
				//3)Click On Login Link
				home.clickOnLoginLink();
				
				//4)Enter Valid Email Id and Password
				
				login.loginWithValidUserr(username, password);
				
				
				//5)Click on the Profile Link - > We will redirected to myAccount Page
				
				account.clickOnAccountBtn();
				
				//6)verify if user is navigated to myAccount Page
				
				WebElement accountProfile = home.getMyAccountLink();
				
				Assert.assertEquals(accountProfile.isDisplayed(),"abc.com");		
				
//				if(accountProfile.isDisplayed())
//				{
//					System.out.println("Test Case is Passed");
//				}
//				else
//				{
//					System.out.println("Test Case is Failed");
//					TakesScreenshot ts = (TakesScreenshot)driver;
//					File scr = ts.getScreenshotAs(OutputType.FILE);
//					
//					File Des = new File("./Screenshot/error.jpg");
//					
//					FileHandler.copy(scr, Des);
//					
//					
//				}
				
				account.getAccountBtn().click();
				
				
				String Expected_Title = f.fetchDataFromKeyOfPropertiesFile("ExpectedTitle");
				
				//System.out.println(Expected_Title);
				
				String Actual_Title = wdu.fetchTitle(driver);
				
				System.out.println(Actual_Title);
				
				
				if(Actual_Title.equals(Expected_Title))
				{
					System.out.println("Log Out Test Case Passed");
				}
				else
				{
					System.out.println("Logout Test Case Failed");
				}
				
				//wdu.closeBrowser(driver);
				
				wdu.quitBrowser(driver);	
	}
	
	@Test
	public void forgotPassword()
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnLoginLink();
		LoginPage lp = new LoginPage(driver);
		lp.clickOnForgotPass();
		PasswordRecoveryPage prp = new PasswordRecoveryPage(driver);
		prp.recoverPassword(username);
		
		String expectedMessage = "Email with instructions has been sent to you.";
		
		Assert.assertEquals(expectedMessage, prp.fetchRecoveryMessage(),"Recovvery Message Test Pass");
		
//		if(expectedMessage.contains(prp.fetchRecoveryMessage()))
//		{
//			System.out.println("Test Status: Passed");
//		}
//		else
//		{
//			System.out.println("Test status: Failed");
//		}
		
	}
	
	
}
