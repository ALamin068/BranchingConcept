package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Helper;

public class HomePage {
WebDriver driver;
	
	public HomePage(WebDriver x) {
		 driver = x;
		 PageFactory.initElements(driver, this);
		 
		
		 
	}
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ol[1]/li[2]/a[1]") WebElement menMenuBar;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ol[1]/li[2]/div[1]/ol[1]/li[1]/ol[1]/li[9]/a[1]") WebElement shirtSubMenu;
	
	
	public void hoverOveronMenMenue() {
		Helper.hoverOver(driver, menMenuBar);
		
	}
	
	public ShirtPage click_on_Shirt() {
		Helper.clickOnElemenet(shirtSubMenu);
		return new ShirtPage(driver);
	}
}
