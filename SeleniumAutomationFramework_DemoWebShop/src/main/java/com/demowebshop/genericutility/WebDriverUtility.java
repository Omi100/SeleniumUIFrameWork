package com.demowebshop.genericutility;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	//Open Web Page
		public void openWebPage(WebDriver driver,String Url)
		{
			driver.get(Url);
		}
		
		//Maximize the Window
		public void maximizeThWindow(WebDriver driver)
		{
			driver.manage().window().maximize();
		}
		
		//Add Implicit wait
		public void addGloablWait(WebDriver driver , long sec)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		}
		
		//Fetch Title
		public String fetchTitle(WebDriver driver)
		{
			return driver.getTitle();
		}
		
		//Close Browser
		
		public void closeBrowser(WebDriver driver)
		{
			driver.close();
		}
		
		//Quit Browser
		
		public void quitBrowser(WebDriver driver)
		{
			driver.quit();
		}
		
		//Manage
		
		
		//1.Minimize Browser Window
		
		public void minimizeWindow(WebDriver driver)
		{
			driver.manage().window().minimize();
		}
		
		//2.FullScreen Browser Winodw
		
		public void fullScreenWindow(WebDriver driver)
		{
			driver.manage().window().fullscreen();
		}
		
		
		
		//3.getSize
		
		public Dimension fetchSizeOfWinodw(WebDriver driver)
		{
			return driver.manage().window().getSize();
		}
		
		
		
		//SetSize of The window
		
		public void changeDimensionOfTheWindow(WebDriver driver,int width,int height)
		{
			driver.manage().window().setSize(new Dimension( width, height));
		}
		
		
		//4.getPosition
		
		public Point fetchCoordinatesOfBrowser(WebDriver driver)
		{
			return driver.manage().window().getPosition();
		}		
			
		//setPosition
		
		public void changeTheCoordinatesOfBrowserWinodw(WebDriver driver,int x,int y)
		{
			driver.manage().window().setPosition(new Point(x, y));
		}
		
		//Navigation Methods
		
		//to
		
		public void navigateToWebUrl(WebDriver driver,String url)
		{
			driver.navigate().to(url);
		}
		
		//back
		
		public void navigateBackToWebPage(WebDriver driver)
		{
			driver.navigate().back();
		}
		
		public void navigateFowardToWebPage(WebDriver driver)
		{
			driver.navigate().forward();
		}
		
		public void RefreshTheWebPage(WebDriver driver)
		{
			driver.navigate().refresh();
		}
		
		//switch using window and break by verifying url
		public void SwitchingControlToWChildWindowOrTab(WebDriver driver,String url)
		{
			Set<String> AllId = driver.getWindowHandles();
			
			for(String childId: AllId)
			{
				driver.switchTo().window(childId);
				if(driver.getCurrentUrl().contains(url))
				{
					break;
				}
			}
		}
		
		//switch using window title
		public void SwitchingControlToWChildWindowOrTab(String title,WebDriver driver)
		{
			Set<String> AllId = driver.getWindowHandles();
			
			for(String childId: AllId)
			{
				driver.switchTo().window(childId);
				if(driver.getTitle().contains(title))
				{
					break;
				}
			}
		}
		
		//Open new Window and Switch the control
		
		public void launchingWindowandSwitchingControlToWindow(WebDriver driver)
		{
			driver.switchTo().newWindow(WindowType.WINDOW);
		}
		
		//Open new Tab and switch the Control
		public void launchWindowAndSwitchingControlToTab(WebDriver driver)
		{
			driver.switchTo().newWindow(WindowType.TAB);
		}
		
		//Handle JavaScript Popup
		
		public void acceptJavaScriptPopup(WebDriver driver)
		{
			driver.switchTo().alert().accept();
		}
		
		public void dismissJavaScriptPopup(WebDriver driver)
		{
			driver.switchTo().alert().dismiss();
		}
		
		public void enterTextAndDismissJavaScriptPopup(WebDriver driver,String inputText)
		{
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(inputText);
			alert.dismiss();
		}
		
		public void enterTextAndAcceptJavaScriptPopup(WebDriver driver,String inputText)
		{
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(inputText);
			alert.accept();
		}
		
		public String fetchMessageFromJavaScriptPopup(WebDriver driver)
		{
			return driver.switchTo().alert().getText();
		}
		
		public void switchControlToFrame(WebDriver driver,int frameIndex)
		{
			driver.switchTo().frame(frameIndex);
		}
		
		public void switchControlToFrame(WebDriver driver,String nameorId)
		{
			driver.switchTo().frame(nameorId);
		}
		
		public void switchControlToFrame(WebDriver driver,WebElement frameelement)
		{
			driver.switchTo().frame(frameelement);
		}
		
		public void switchControlToParentFrame(WebDriver driver)
		{
			driver.switchTo().parentFrame();
		}
		
		public void switchControlToMainPage(WebDriver driver,WebElement frameelement)
		{
			driver.switchTo().defaultContent();
		}
		
		 //Explicit wait
		 public void waitTillTheElementIsVisible(WebDriver driver,long seconds,WebElement element) {
			 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(seconds));
			 wait.until(ExpectedConditions.visibilityOf(element));
			 }
		 public void waitTillTheElementIsClickable(WebDriver driver,long seconds,WebElement element) {
			 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(seconds));
			 wait.until(ExpectedConditions.elementToBeClickable(element));
			 }
}

