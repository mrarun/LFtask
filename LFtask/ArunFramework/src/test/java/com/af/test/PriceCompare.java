package com.af.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.af.base.TestBase;

public class PriceCompare extends TestBase{

public PriceCompare() {
		
		super();

	}

@Test
public void FindLowestPrice() {
	String Amazon = AmazonPrice;
	String Flipkart = FlipkartPrice;
	Amazon = Amazon.replaceAll("[₹,]", "");
	Reporter.log(Amazon);
	Flipkart = Flipkart.replaceAll("[₹,]", "");
	Reporter.log(Flipkart);
	int amzPrice=Integer.parseInt(Amazon);  
	int flpPrice=Integer.parseInt(Flipkart);

	if(amzPrice>flpPrice)
	{
		System.out.println("Flipkart has lower price: "+ flpPrice);
		System.out.println("FLipkart link: "+FlipkartLink);
	}
	else if(amzPrice==flpPrice)
	{
		System.out.println("Amazon & flipkart have same price: "+ amzPrice);
		System.out.println("FLipkart link: "+FlipkartLink);
		System.out.println("Amazon link: "+AmazonLink);
	}
	else
	{
		System.out.println("amzon has lower price: "+ amzPrice);
		System.out.println("Amazon link: "+AmazonLink);
	}
}
}
