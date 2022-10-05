package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.mystore.base.Base;
import com.mystore.pageObjects.HomePage;
import com.mystore.pageObjects.IndexPage;
import com.mystore.pageObjects.LoginPage;

public class LoginPageTest extends Base {
	public LoginPage loginpage;
	public IndexPage indexpage;
	public HomePage homepage;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		launchApp();
	}

	@Test
	public void loginTest() {
		indexpage = new IndexPage();
		loginpage = indexpage.clickOnSignIn();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		String actualUrl=homepage.getCurrentUrl();
		String expectedUrl="http://automationpractice.com/index.php?controller=my-account";
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
