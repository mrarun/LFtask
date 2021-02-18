package com.af.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.af.base.TestBase;
import com.af.pages.Flipkart;

public class FlipkartTest extends TestBase{
	Flipkart flipkartObj;
	
	public FlipkartTest() {
		
		super();

	}
	
	
	@BeforeMethod
	public void setUp() throws IOException{
		initialization();
		flipkartObj = new Flipkart();
	}
	
	@Test
	public void flipkartHomePageTitleTest() {
		String title = flipkartObj.validatePageTitle();
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}
	
	@Test
	public void searchAndGetProductPriceForFlipkart() {
		flipkartObj.searchProduct();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
