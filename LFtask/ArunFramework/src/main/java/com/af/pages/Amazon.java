package com.af.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.af.base.TestBase;
import com.af.utils.TestUtil;


public class Amazon extends TestBase{
	//Page Factory
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchBar;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement searchButton;
	
	@FindBy(xpath="//span[contains(text(),'New Apple iPhone 12 Pro (128GB) - Pacific Blue')]/../../../../../../..//span[@class='a-price-whole']")
	WebElement iPhone12Pro128PacificBlue;
	
	@FindBy(xpath="//span[contains(text(),'New Apple iPhone 12 Pro (128GB) - Pacific Blue')]/../../a")
	WebElement link;
	
	
		
		//Initializing the Page Objects:
		public Amazon(){
			driver.get(prop.getProperty("amazon_url"));

			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validatePageTitle() {
			return driver.getTitle();
		}
		
		public void searchProduct() {
			searchBar.sendKeys(TestUtil.searchString);
			searchButton.click();
			AmazonPrice = iPhone12Pro128PacificBlue.getText();
			AmazonLink = link.getAttribute("href");

		}
}
