/**
 * 
 */
package com.mystore.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.Base;
import com.mystore.pageObjects.IndexPage;

/**
 * @author Yogesh
 *
 */
public class IndexPageTest extends Base {
	IndexPage index;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		launchApp();
	}
	
	@Test
	public void verifyLogo() throws Throwable {
		index = new  IndexPage();
		boolean result=index.validateLogo();
		Assert.assertTrue(result);
	}
	
	@Test
	public void verifyTitle() throws Throwable {
		index = new  IndexPage();
		String actTitle=index.getMyStoreTitle();
		Assert.assertEquals(actTitle, "My Store");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
