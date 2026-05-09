package com.practice;

import org.testng.annotations.Test;

public class LearningDependsOnMethod {
	
	@Test(priority = 1)
	//if this method fails to run other methods which are dependent will not run 
	public void createContact()
	{
		System.out.println("Creating new Contact");
	}
	
	@Test(priority = 2,dependsOnMethods = "createContact",enabled=false)
	public void editContact()
	{
		System.out.println("Editing Existing Contact");
	}
	
	@Test(priority = 3,dependsOnMethods = {"createContact","editContact"})
	//if one method is depending on Multiple methods then we will write the methods inside {"method1","method2"}
	public void deleteContact()
	{
		System.out.println("Delete a Contact");
	}
	
	@Test(priority = 4)
	public void viewContactHistory()
	{
		
	}
}
