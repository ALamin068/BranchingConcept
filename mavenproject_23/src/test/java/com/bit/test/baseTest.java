package com.bit.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dB.ReadPropFile;



public class baseTest {
	WebDriver driver;
	@Before
	public void openBrowser() throws IOException {
	
		Properties prop;
		
		
		prop = ReadPropFile.innitProfile("C:\\Users\\TheJDMGod\\Desktop\\mavenproject_23\\config.properties");
				
		String b = prop.getProperty("browser");		
		
		if(b.equals("chrome")) {
			driver = new ChromeDriver();
			
		}
		else if(b.equals("fireFox")) {
			driver = new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
			
		
	}

}
