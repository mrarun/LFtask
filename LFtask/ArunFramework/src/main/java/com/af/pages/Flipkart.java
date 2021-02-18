package com.af.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.af.base.TestBase;
import com.af.utils.TestUtil;

public class Flipkart extends TestBase {
	//Initializing the Page Objects:
		public Flipkart(){
			driver.get(prop.getProperty("flipkart_url"));

			PageFactory.initElements(driver, this);
			
			try {
				closePopUp();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//Page Factory
		@FindBy(xpath="//input[@placeholder='Search for products, brands and more']")
		WebElement searchBar;
		
		@FindBy(xpath="//button[@type='submit']//*[local-name()='svg']")
		WebElement searchButton;
		
		@FindBy(xpath="//div[contains(text(),'Apple iPhone 12 Pro (Pacific Blue, 128 GB)')]/../..//div[@class='_30jeq3 _1_WHN1']")
		WebElement iPhone12Pro128PacificBlue;
		
		@FindBy(xpath="//button[text()='✕']")
		WebElement closePopup;
		
		@FindBy(xpath="//a[@class='_1fQZEK']")
		WebElement link;
		
		
		//Actions:
		
		public void closePopUp() {
			closePopup.click();
		}
		
		public String validatePageTitle() {
			return driver.getTitle();
		}
		
		public void searchProduct() {
			searchBar.sendKeys(TestUtil.searchString);
			searchButton.click();
			FlipkartPrice = iPhone12Pro128PacificBlue.getText();
			FlipkartLink = link.getAttribute("href");
		}
		
	}