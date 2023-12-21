package utility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Helper {
	
	//hover over method
	public static void hoverOver( WebDriver driver, WebElement element) {
		
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}
	
	//click on a single element method
	public static void clickOnElemenet(WebElement element) {
		element.click();
	}
	
	//click on multiple elements method
	public static void clickOnAllElements(WebDriver driver, List<WebElement> elements) {
		for(int i = 0; i<elements.size(); i++) {
			elements.get(i).click();
			driver.navigate().back();
			
		}
		
	}
	
	
	
	
}
