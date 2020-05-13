package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.utility.TestBase;

public class PrimePage extends TestBase {

	Actions a;
	Select s;
	
	
	// Declare the elements
	@FindBy(linkText = "Try Prime")
	private WebElement trpm;
	
	@FindBy(xpath = "//span[@id='prime-header-monthly-CTA']")
	private WebElement chs;
	
	@FindBy(xpath = "//a[@id='nav-link-accountList']")
	private  WebElement acnt_lst;

	@FindBy(xpath = "//input[@name='ppw-instrumentRowSelection']")
	private WebElement rd;
	
	@FindBy(name = "addCreditCardNumber")
	private WebElement nmbr;

	@FindBy(name = "ppw-widgetEvent:AddCreditCardEvent")
	private WebElement add;
	
	@FindBy(name = "ppw-expirationDate_month")
	private WebElement epry;

	@FindBy(xpath = "//a[@id='nav-item-signout']")
	private WebElement sgot;

	// Initialization
	public PrimePage() {

		PageFactory.initElements(driver, this);
	}

	// Utilization
	public void prime(WebDriver driver) {
		a = new Actions(driver);
		a.moveToElement(trpm).perform();
	}
	
	public void link() {
		trpm.click();
	}
	
	public void choose() {
		chs.click();
	}
	
	public void slct() {
		rd.click();
	}
	
	public void number(String crd) {
		nmbr.sendKeys(crd);
	}
	
	public void date() {
		s = new Select(epry);
		s.selectByValue("12");	
	}
	
	public void verify() {
		add.click();
	}
	
	public void acntndlsts(WebDriver driver) {
		a.moveToElement(acnt_lst).perform();	
	}
	
	public void sgnt() {
		sgot.click();
	}		
	
}
