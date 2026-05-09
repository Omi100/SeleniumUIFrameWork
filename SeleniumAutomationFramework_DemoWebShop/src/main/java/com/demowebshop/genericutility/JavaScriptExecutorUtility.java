package com.demowebshop.genericutility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorUtility {
	
		public JavascriptExecutor js;
		
		public JavaScriptExecutorUtility(WebDriver driver)
		{
			this.js = (JavascriptExecutor)driver;
		}
		
		//Scrolling
		
		public void scrollTillCoordinateFromOrigin(int x, int y)
		{
			js.executeScript("window.scrollTo("+x+","+y+")");
		}
		
		public void scrollTillTheCoordinateFromCurrentPosition(int x , int y)
		{
			js.executeScript("window.scrollBy("+x+","+y+")");
		}
		
		public void scrollTillTheElementIsVisible(boolean upOrDown) {
			js.executeScript("arguments[0].scrollInto("+upOrDown+")");
		}
		//clicking
		public void leftClickOnElement(WebElement element) {
			js.executeScript("arguments[0].click()",element);
		}
		//Typing
		public void enterTextOnElement(WebElement element,String text) {
			js.executeScript("arguments[0].value="+text+"",element);
		}

		
}
