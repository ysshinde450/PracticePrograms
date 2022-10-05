package com.mystore.actiondriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.mystore.base.Base;

public class Action extends Base{

	@SuppressWarnings("deprecation")
	public static void implicitWait(WebDriver driver, int timeout) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@SuppressWarnings("deprecation")
	public static void pageLoad(WebDriver driver, int timeout) {
		driver.manage().timeouts().pageLoadTimeout(timeout, TimeUnit.SECONDS);
	}

	public static void click(WebDriver Idriver, WebElement element) {
		Actions actions = new Actions(Idriver);	
		actions.moveToElement(element).click().build().perform();
	}
	
	public static boolean findElement(WebDriver Idriver, WebElement element) {
		boolean flag = false;
		try {
			element.isDisplayed();
			flag= true;
		} catch (Exception e) {
			flag= false;
		}
		return flag;
	}
	
	public static boolean isDisplayed(WebDriver Idriver, WebElement element) {
		boolean flag= false;
		flag=findElement(Idriver,element);
		if(flag) {
			if(flag)
			System.out.println("The element is displayed");
		else
			System.out.println("The element is not displayed");
		return flag;
		}else
			System.out.println("Not displayed");
		return flag;
	}
	
	public static boolean type(WebElement element,String text) {
		boolean flag=false;
		flag=element.isDisplayed();
		element.clear();
		element.sendKeys(text);
		flag=true;
		return flag;
	}
	
	public static boolean selectByVisibleText(String visibleTxt, WebElement  element) {
		boolean flag=false;
		Select s = new Select(element);
		s.selectByVisibleText(visibleTxt);
		flag=true;
		return flag;		
	}
	
	public static boolean jsClick(WebDriver driver, WebElement element) {
		boolean flag=false;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("arguments[0].click()", element);
		flag=true;
		return flag;
	}
}
