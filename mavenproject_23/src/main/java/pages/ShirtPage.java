package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Helper;

public class ShirtPage {
WebDriver driver;
	
	public ShirtPage(WebDriver x) {
		 driver = x;
		 PageFactory.initElements(driver, this);
		 
	}
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div/div[2]/div[1]/div[1]/div/div") List<WebElement> allTshirt;
	@FindBy(xpath ="//*[@id=\"app\"]/div/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/a/img") WebElement oneTshirt;
	
	public void verifyAllTshirtClickable() {
		Helper.clickOnAllElements(driver, allTshirt);
	}
	
	
	public ProductDetailPage clickAnyShirt() {
		Helper.clickOnElemenet(oneTshirt);
		return new ProductDetailPage(driver);
	}
}
