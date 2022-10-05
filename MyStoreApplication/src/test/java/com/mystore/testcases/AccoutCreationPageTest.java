package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.actiondriver.Action;
import com.mystore.base.Base;
import com.mystore.pageObjects.AccountCreationPage;
import com.mystore.pageObjects.IndexPage;
import com.mystore.pageObjects.LoginPage;

public class AccoutCreationPageTest extends  Base {
	public IndexPage indexpage;
	public LoginPage loginPage;
	public AccountCreationPage accCreatepage;
	@BeforeMethod
	public void setUp() throws InterruptedException {
		launchApp();	
	}

	@Test
	public void verifyCreateAccountPageTest() {
		indexpage = new IndexPage();
		loginPage=indexpage.clickOnSignIn();
		accCreatepage= loginPage.createNewAccount("yogesh@abc.com");
		boolean result=accCreatepage.validateAccCreatedPage();
		Assert.assertTrue(result);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}