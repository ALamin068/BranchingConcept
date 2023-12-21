package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Helper;

public class ProductDetailPage {
	
WebDriver driver;
	
	public ProductDetailPage(WebDriver x) {
		 driver = x;
		 PageFactory.initElements(driver, this);
		 
	}
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div/section/section[1]/section/div[4]/div/div[4]/button") WebElement button;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div/section/section[1]/section/div[6]/div[4]/button") WebElement carButton;
	
	public void clickOnSizeAndCart() {
		Helper.clickOnElemenet(button);
		Helper.clickOnElemenet(carButton);
	}
	
	
	
	
	
	
	

}
