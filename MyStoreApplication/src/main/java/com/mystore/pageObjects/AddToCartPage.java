package com.mystore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.Base;

public class AddToCartPage extends Base{
	
	@FindBy(id="quantity_wanted") WebElement quantity;
	@FindBy(id="group_1") WebElement size;	
	@FindBy(id="add_to_cart") WebElement addtocartBtn;
	@FindBy(id="//*[@class='icon-ok']") WebElement addtocartMsg;
	@FindBy(xpath="//*[@title='Proceed to checkout']") WebElement checkoutBtn;
	
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterQuantity(String quantityNo) {
		Action.type(quantity, quantityNo);
	}
	public void selectSize(String size1) {
		Action.selectByVisibleText(size1, size);
	}
	
	public void clickAddtoCartBtn() {
		Action.click(driver, addtocartBtn);
	}
	
	public boolean validateAddtoCartSucceed() {
		return Action.isDisplayed(driver, addtocartMsg);
	}
	
	public OrderPage clickOnCheckOut() {
		Action.jsClick(driver, checkoutBtn);
		return new OrderPage();
	}
}
