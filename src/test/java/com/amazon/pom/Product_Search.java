package com.amazon.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.utility.TestBase;

public class Product_Search extends TestBase {

	// Declare the elements
	@FindBy(id = "twotabsearchtextbox")
	WebElement disp;
	
	@FindBy(xpath = "//parent::div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")
	WebElement srch;


	// Initialization
	public Product_Search() {

		PageFactory.initElements(driver, this);
	}

	// Utilization
	public void display() {
		disp.isDisplayed();
	}
	
	public void prdctnm(String nm) {
		disp.sendKeys(nm);
	}
	
	public void search() {
		srch.click();
	}
	
}
