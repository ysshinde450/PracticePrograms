package com.mystore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.Base;

public class HomePage extends Base {

	@FindBy(xpath="//*[@class='icon-list-ol']//parent::a") WebElement orderhistorydetails;
	
	@FindBy(xpath="//*[@id='center_column']//div/div[2]//ul/li//a//span") WebElement myWishlist;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateMyWishlist() {
		
		return Action.isDisplayed(driver,myWishlist);
	}
	
	public boolean validateOrderHistoryDetails() {
		return Action.isDisplayed(driver, orderhistorydetails);
	}
	
	public String getCurrentUrl() {
		String homepageurl= driver.getCurrentUrl();
		return homepageurl;
	}
	
}
