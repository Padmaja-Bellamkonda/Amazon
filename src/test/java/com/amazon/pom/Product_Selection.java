package com.amazon.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.utility.TestBase;

public class Product_Selection extends TestBase {

	// Declare the elements
	
	@FindBy(xpath = "//span[text()='Tata Sampann Unpolished Toor Dal/Arhar Dal, 1kg']")
	WebElement pdt;
	
	
	// Initialization
	public Product_Selection() {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void product() {
		pdt.click();
	}
	
	
	
	
	

	
	
}
