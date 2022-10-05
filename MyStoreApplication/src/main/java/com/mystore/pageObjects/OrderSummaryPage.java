/**
 * 
 */
package com.mystore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.Base;

/**
 * @author Yogesh
 *
 */
public class OrderSummaryPage extends Base{

	@FindBy(xpath="//*[@class=\"button btn btn-default button-medium\"]") WebElement confirmOrderBtn;
	
	public OrderSummaryPage() {
		PageFactory.initElements(driver, this);
	}
	
	public OrderConfirmationPage clickonConfirmOrder() {
		Action.click(driver, confirmOrderBtn);
		return new OrderConfirmationPage();
	}
	
}
