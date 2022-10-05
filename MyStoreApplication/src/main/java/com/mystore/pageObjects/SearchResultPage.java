package com.mystore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.Base;

public class SearchResultPage extends Base{
	
	@FindBy(xpath="//*[@title='Add to cart']") WebElement prodImage;
	
	@FindBy(xpath="//a[@title='View my shopping cart']") WebElement clickCart;
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean isProductAvailable() {
		return Action.isDisplayed(driver, prodImage);
	}
	
	public AddToCartPage clickOnProduct() {
		Action.click(driver, prodImage);
		return new AddToCartPage();
	}

}
