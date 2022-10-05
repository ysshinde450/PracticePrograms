package com.mystore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.Base;

public class PaymentPage extends Base{
	
	@FindBy(xpath="//*[@title='Pay by bank wire']") WebElement paymentOptionByWire;
	
	@FindBy(xpath="//*[@title='Pay by check.']") WebElement paymentOptionByCheck;
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	
	public OrderSummaryPage clickOnPaymentmethods() {
		Action.click(driver, paymentOptionByWire);
		return new OrderSummaryPage();
	}
}
