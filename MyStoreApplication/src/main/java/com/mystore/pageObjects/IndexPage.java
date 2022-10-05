package com.mystore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.Base;

public class IndexPage extends Base {

	@FindBy(xpath = "//*[@class='login']")
	WebElement signInBtn;

	@FindBy(xpath = "//*[@class='logo img-responsive']")
	WebElement myStoreLogo;

	@FindBy(id = "search_query_top")
	WebElement searchbox;

	@FindBy(xpath = "//*[@class='btn btn-default button-search']")
	WebElement searchbtn;

	public IndexPage() {
		PageFactory.initElements(driver, this);
	}

	public LoginPage clickOnSignIn() {
		Action.click(driver, signInBtn);
		return new LoginPage();
	}

	public boolean validateLogo() {
		return Action.isDisplayed(driver, myStoreLogo);
	}

	public String getMyStoreTitle() {
		String myStoreTitle = driver.getTitle();
		return myStoreTitle;
	}
	
	public SearchResultPage searchProduct(String productName) {
		Action.type(searchbox, productName);
		Action.click(driver, searchbtn);
		return new SearchResultPage();
	}
	


}
