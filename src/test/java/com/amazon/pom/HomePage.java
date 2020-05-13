package com.amazon.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.utility.TestBase;

public class HomePage extends TestBase {
	
	
	//Declare the elements
	@FindBy(xpath = "//a[@class='nav-logo-link']" )
	private WebElement icon;
	
	
	//Initialization
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateHomePageTitle() {
		return driver.getTitle();
	}

	public boolean validateAmazonImage() {
		return icon.isEnabled();
	}
	
	
	//Utilization
	public void icon()
	{
		icon.click();
	}
	
}
