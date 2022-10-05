package com.mystore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.Base;

public class OrderPage extends Base {

	@FindBy(xpath="//*[@id='product_price_1_1_706116']") WebElement unitPrice;
	
	@FindBy(xpath="(//*[@class='price'])[6]") WebElement totalPrice;
	
	@FindBy(xpath="(//*[@title='Proceed to checkout'])[2]") WebElement proceedToCheckOut;
	
	public OrderPage() {
		PageFactory.initElements(driver, this);
	}
	
	public double getUnitPrice() {
		String unitPrice1=unitPrice.getText();
		String unit = unitPrice1.replaceAll("(^a-zA-Z0-9)","");
		double finalUnitPrice = Double.parseDouble(unit);
		return finalUnitPrice/100;
	}
	
	public double getTotalPrice() {
		String totalPrice1=totalPrice.getText();
		String total = totalPrice1.replaceAll("(^a-zA-Z0-9)","");
		double finalTotalPrice = Double.parseDouble(total);
		return finalTotalPrice/100;
	}
	
	public LoginPage clickOnCheckout() {
		Action.click(driver, proceedToCheckOut);
		return new  LoginPage();
	}
	
}
