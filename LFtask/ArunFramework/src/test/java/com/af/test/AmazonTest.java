package com.af.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.af.base.TestBase;
import com.af.pages.Amazon;

public class AmazonTest extends TestBase{
	Amazon amazonObj;
	
	public AmazonTest() {
		
		super();

	}
	
	
	@BeforeMethod
	public void setUp() throws IOException{
		initialization();
		amazonObj = new Amazon();
	}
	
	@Test
	public void amazonHomePageTitleTest() {
		String title = amazonObj.validatePageTitle();
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	@Test
	public void searchAndGetProductPriceForAmazon() {
		amazonObj.searchProduct();
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
