package com.amazon.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.utility.TestBase;

public class LoginPage extends TestBase {

	//Declare the elements
		@FindBy(xpath = "//a[@id='nav-link-accountList']")
		private  WebElement account_list;

		@FindBy(xpath = "//div[@id='nav-flyout-ya-signin']")
		private WebElement sgn;

		@FindBy(xpath="//input[@type='email']")
		private WebElement email;

		@FindBy(xpath="//input[@id='continue']")
		private WebElement ctn_btn;

		@FindBy(xpath="//input[@type='password']")
		private WebElement password;

		@FindBy(xpath="//input[@id='signInSubmit']")
		private WebElement submit_button;
		
		
		//Initialization 
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		

		//Utilization
		public void acntndlsts(WebDriver driver) {
			Actions a = new Actions(driver);
			a.moveToElement(account_list).perform();	
		}
		
		public void signinButton() {
			sgn.click();
		}
		
		public void entrml(String uml) {
			email.sendKeys(uml);
		}
		
		public void clickoncontinue() {
			ctn_btn.click();
		}
		
		public void entpwd(String pwd) {
			password.sendKeys(pwd);
		}
		
		public void clickonlogin() {
			submit_button.click();
		}

}
