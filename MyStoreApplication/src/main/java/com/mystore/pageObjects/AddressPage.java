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
 * @author user
 *
 */
public class AddressPage extends Base{

	@FindBy(xpath="//*[@name='processAddress']") WebElement proceedToCheckOut;
	
	public  AddressPage() {
		PageFactory.initElements(driver, this);
	}
	
	public ShippingPage clickOnCheckOut() {
		Action.click(driver, proceedToCheckOut);
		return new ShippingPage();
	}
}
