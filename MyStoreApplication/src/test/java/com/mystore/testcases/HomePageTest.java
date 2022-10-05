package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.Base;
import com.mystore.pageObjects.HomePage;
import com.mystore.pageObjects.IndexPage;
import com.mystore.pageObjects.LoginPage;

public class HomePageTest extends Base{
	public LoginPage loginpage;
	public HomePage homepage;
	public IndexPage indexpage;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		launchApp();
	}
	@Test
	public void wishList() {
		indexpage = new IndexPage();
		loginpage=indexpage.clickOnSignIn();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		boolean result = homepage.validateMyWishlist();
		Assert.assertTrue(result);
	}
	@Test
	public void  orderHistoryDetailsTest() {
		indexpage = new IndexPage();
		loginpage=indexpage.clickOnSignIn();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		boolean result = homepage.validateOrderHistoryDetails();
		Assert.assertTrue(result);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
