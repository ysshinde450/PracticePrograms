package com.mystore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.Base;

public class AccountCreationPage extends Base{

	@FindBy(xpath="//h1[text()='Create an account']") WebElement pageHeader;
	
	public AccountCreationPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateAccCreatedPage() {
		return Action.isDisplayed(driver, pageHeader);
	}
}
