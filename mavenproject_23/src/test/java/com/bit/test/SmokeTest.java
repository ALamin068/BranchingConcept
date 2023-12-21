package com.bit.test;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pages.HomePage;
import pages.ProductDetailPage;
import pages.ShirtPage;



public class SmokeTest  extends baseTest {
	
	HomePage hp; 
	
	ShirtPage sp;
	
	ProductDetailPage pdp;
	
	
	@Test
	public void test1(){
		
		hp = new HomePage(driver);
		//driver.switchTo().alert().dismiss();
		hp.hoverOveronMenMenue();
		sp = hp.click_on_Shirt();
		sp.verifyAllTshirtClickable();
		pdp  = sp.clickAnyShirt();
		
		pdp.clickOnSizeAndCart();
		
		
	}

}
