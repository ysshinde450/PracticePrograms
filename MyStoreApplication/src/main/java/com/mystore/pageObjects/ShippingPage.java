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
public class ShippingPage extends Base{
	
	@FindBy(xpath="//*[@id='cgv']") WebElement termsCheckBox;
	
	@FindBy(xpath="//*[@name='processCarrier']") WebElement proceedtoCheckOut;
	
	public ShippingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnTerms() {
		Action.click(driver, termsCheckBox);
	}
	
	public PaymentPage clickProceedToCheckOut() {
		Action.click(driver, proceedtoCheckOut);
		return new PaymentPage();
	}
	
	

}
