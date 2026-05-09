package com.demowebshop_RegisterPage;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.demowebshop.genericutility.BaseClass;



import com.demowebshop.object_repository.HomePage;
import com.demowebshop.object_repository.RegisterResultPage;
import com.demowebshop.object_repository.RegistrationPage;



public class RegisterNewUserTest extends BaseClass{
	
	
		
	@Test
	public void RegisterUserTest() throws EncryptedDocumentException, IOException {
		
		
		
		String gender = excel.FetchingStringDataFromExcelSheet("Users", 1, 0);
		
				
		String fn = excel.FetchingStringDataFromExcelSheet("Users", 1, 1);
		
		String ln = excel.FetchingStringDataFromExcelSheet("Users", 1, 2);
		
		String email = excel.FetchingStringDataFromExcelSheet("Users", 1, 3);
		
		String emailprovider = excel.FetchingStringDataFromExcelSheet("Users", 1, 4);
		
		String pass = excel.FetchingStringDataFromExcelSheet("Users", 1, 5);
		
		String cpass = excel.FetchingStringDataFromExcelSheet("Users", 1, 5);
		
		
		String Title = wdu.fetchTitle(driver);
		
		HomePage hp = new HomePage(driver);
		RegistrationPage r = new RegistrationPage(driver);
		
		
		System.out.println(Title);
		
		hp.clickOnRegistraitonLink();
		
		r.RegisterNewUser(gender, fn, ln,email,ju.getRandomNum(999), emailprovider, pass, cpass);

		
		//Object Creation For Success Message
		RegisterResultPage result = new RegisterResultPage(driver);
		
		Assert.assertTrue(result.getSuccessMessage().isDisplayed());
		
		Reporter.log("Test Case Execution is Passed for registeration success");
		
		
//		String SuccessMessage = succmsg.getText();
//		
//		 String msg = SuccessMessage.trim();
//		 
//		 if(msg.contains("Your registration completed"))
//		 {
//			 System.out.println("Registration Test Case Passed");
//		 }
//		 else
//		 {
//			 System.out.println("Registation test case is Failed");
//		 }
		
		 //wdu.closeBrowser(driver);
		 
		 wdu.quitBrowser(driver);
		
	}
}
