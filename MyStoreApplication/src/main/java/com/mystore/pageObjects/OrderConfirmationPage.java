/**
 * 
 */
package com.mystore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.Base;

/**
 * @author Yogesh
 *
 */
public class OrderConfirmationPage extends Base{
	
	@FindBy(xpath="(//*[@class='dark'])[6]") WebElement orderConfimationHeader;
	
	public OrderConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateConfirmMsg() {
		String s = orderConfimationHeader.getText();
		return s;
	}
}
