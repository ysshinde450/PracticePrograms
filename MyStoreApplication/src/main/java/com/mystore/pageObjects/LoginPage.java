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
public class LoginPage extends Base	 {

	@FindBy(id="email") WebElement username;
	
	@FindBy(id="passwd") WebElement password;
	
	@FindBy(xpath="//*[@name='SubmitLogin']") WebElement signInBtn;
	
	@FindBy(name="email_create") WebElement emailForNewAccount;
	
	@FindBy(id="SubmitCreate") WebElement newEmailButton;
	

	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String uname, String pwd) {
		Action.type(username, uname);
		Action.type(password, pwd);
		Action.click(driver, signInBtn);
		return new HomePage();
	}
	
	public AddressPage login1(String uname, String pwd) {
		Action.type(username, uname);
		Action.type(password, pwd);
		Action.click(driver, signInBtn);
		return new AddressPage();
	}
	
	public AccountCreationPage createNewAccount(String newEmail) {
		Action.type(emailForNewAccount, newEmail);
		Action.click(driver, newEmailButton);
		return new AccountCreationPage();
	}
}