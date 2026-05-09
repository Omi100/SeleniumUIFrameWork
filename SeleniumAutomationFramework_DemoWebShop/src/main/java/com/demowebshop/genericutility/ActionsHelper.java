package com.demowebshop.genericutility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ActionsHelper {
	
	//Actions 
	
	public Actions action;
	
	public ActionsHelper(WebDriver driver)
	{
		this.action = new Actions(driver);
	}
	
	//Mouse
	
	public void mouseLeftClickOnElement(WebElement element)
	{
		action.click(element).perform();
	}
	
	public void mouseRightClickOnElement(WebElement element)
	{
		 action.contextClick(element).perform();
	}
	
	public void doubleClickOnElement(WebElement element)
	{
		action.doubleClick(element).perform();
	}
	
	//Scrolling
	
	public void scrollToTheLocatedElement(WebElement element)
	{
		action.scrollToElement(element).perform();
	}
	
	public void scrollToTheCoordinates(int x, int y)
	{
		action.scrollByAmount(x, y).perform();;
	}
	
	public void HoverTheMouseOverTheElement(WebElement element)
	{
		action.moveToElement(element).perform();
	}
	
	public void hoverTheMouseOverTheElementWithPrecision(WebElement element,int x,int y)
	{
		action.moveToElement(element, x, y).perform();;
	}
	
	public void hoverTheMousePointerOnCoordinates(int x , int y)
	{
		action.moveToLocation(x, y).perform();;
	}
	
	//Drag And Drop
	
	public void dragAndDropTheElementOnElement(WebDriver element1,WebElement element2)
	{
		action.dragAndDrop(element2, element2).perform();;
	}
	
	public void dragAndDropTheElementOnCoordinate(WebElement ele,int x , int y)
	{
		action.dragAndDropBy(ele, x, y).perform();;
	}
	
	//Click Hold And Release
	
	public void clickAndHoldTheElementAndReleaseTheElement(WebElement element,long sec)
	{
		action.clickAndHold(element).pause(sec).release(element).perform();
	}
	
	public void clickAndHoldOneElementAndReleaseAnotherElement(WebElement source,WebElement target,long sec)
	{
		action.clickAndHold(source).pause(sec).release(target).perform();
	}
	
	//Press Enter
	public void PreseeEnter()
	{
		action.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	}
	
	//ArrowDown
	public void PressArrowDown(int numOfPress)
	{
		for(int i = 0;i<numOfPress;i++)
		{
		action.keyDown(Keys.DOWN).keyUp(Keys.DOWN).perform();
		}
	}
	
	//ArrowUp
	public void PressArrowUp(int numOfPress)
	{
		for(int i = 0;i<numOfPress;i++)
		{
			action.keyDown(Keys.UP).keyUp(Keys.UP).perform();
		}
	}

	
		
	
}

