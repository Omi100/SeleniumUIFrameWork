package com.demowebshop.genericutility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectHelper {
	
		public Select select;
		
		//Select Option
		public SelectHelper(WebElement dropDown)
		{
			this.select = new Select(dropDown);
		}
		
		public void selectOptionElementByValue(String value)
		{
			select.selectByValue(value);
		}
		
		public void selectOptionByIndex(int index)
		{
			select.selectByIndex(index);
		}
		
		public void selectOptionByVisibleText(String value)
		{
			select.selectByVisibleText(value);
		}
		
		public void selectOptionByContainsVisibleText(String value)
		{
			select.selectByContainsVisibleText(value);
		}
		
		
		//Deselect Options
		
		public void deselectOptionByIndex(int value)
		{
			select.deselectByIndex(value);
		}
		
		public void deselectOptionByValue(String value)
		{
			select.deselectByValue(value);
		}
		
		public void deselectOptionByVisibleText(String str)
		{
			select.deselectByVisibleText(str);
		}
		
		public void deselectOptionByContainsVisibleText(String str)
		{
			select.deSelectByContainsVisibleText(str);
		}
		
		public void deselectAllOption()
		{
			select.deselectAll();
			
		}
		
		//Fetch All Options
		public List<WebElement> FetchAllOptions()
		{
			
			List<WebElement> Options = select.getOptions();
			
			for(WebElement s : Options )
			{
				System.out.println(s.getText());
			}
			
			return Options;
		}
		
		
		//fetch All SelectedOptions
		public List<WebElement> fetchAllSelectedOptions()
		{
			
		  List<WebElement> Options = select.getAllSelectedOptions();
		  
		  for(WebElement s : Options)
		  {
			  System.out.println(s.getText());
		  }
		  
		  return Options;
		}
		
		//verify the Dropdown is Multi-select
		
		public boolean verifyDropdownIsMultiSelect()
		{
			return select.isMultiple();
		}
		
		
}

