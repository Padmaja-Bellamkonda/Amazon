package com.amazon.stepDefinitions;

import org.testng.Assert;

import com.amazon.pom.HomePage;
import com.amazon.pom.LoginPage;
import com.amazon.pom.PrimePage;
import com.amazon.utility.TestBase;

import cucumber.api.java.en.*;

public class END_to_END_SD extends TestBase {

	LoginPage lgnpg;
	HomePage hmpg;
	PrimePage prmpg;

	@Given("^the user opens chrome browser$")
	public void the_user_opens_chrome_browser() {
		TestBase.initialization();
	}

	@When("^the user enters url$")
	public void the_user_enters_url() {
		driver.get(prop.getProperty("url"));
	}

	@Then("^hover on Accounts and Lists$")
	public void hover_on_Accounts_and_Lists() {
		lgnpg = new LoginPage();
		lgnpg.acntndlsts(driver);
	}

	@When("^the user click on Sign in button$")
	public void click_on_Sign_in_button() {
		lgnpg.signinButton();
	}

	@Then("^the user enters email-id$")
	public void the_user_enters_email_id() {
		lgnpg.entrml(prop.getProperty("email"));
	}

	@And("^click on continue$")
	public void click_on_continue() {
		lgnpg.clickoncontinue();
	}

	@Then("^the user enters password$")
	public void the_user_enters_password() {
		lgnpg.entpwd(prop.getProperty("password"));
	}

	@And("^Login to application$")
	public void login_to_application() {
		lgnpg.clickonlogin();
	}

	// functioning of icon

	@Given("^the user checks the presence of Amazon Icon$")
	public void the_user_checks_the_presence_of_Amazon_Icon() {
		hmpg = new HomePage();
		String title = hmpg.validateHomePageTitle();
		Assert.assertEquals(
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in",
				title);
		System.out.println(title);
		boolean b = hmpg.validateAmazonImage();
		Assert.assertTrue(b);
		System.out.println(b);
	}

	@And("^click on Amazon icon$")
	public void click_on_Amazon_icon() {
		hmpg.icon();
	}

	// Validate the user prime creation
	
	@Given("^the user hover on try prime link$")
	public void the_user_hover_on_try_prime_link() {
		prmpg = new PrimePage();
		prmpg.prime(driver);

	}

	@And("^click on that link$")
	public void click_on_that_link() {
		prmpg.link();
	}

	@Then("^choose one offer button$")
	public void choose_one_offer_button() {
		prmpg.choose();
	}
	
	@And("^select the payment method$")
	public void select_the_payment_method() {
	    prmpg.slct();
	}

	@Then("^give the details$")
	public void give_the_details() {
	prmpg.number(prop.getProperty("card_number"));
	   prmpg.date();
	}

	@And("^add the card$")
	public void add_the_card() throws InterruptedException  {
	    prmpg.verify();
	    Thread.sleep(2000);
	}

	@Then("^signout from the application$")
	public void signout_from_the_application() {
		prmpg.acntndlsts(driver);
		prmpg.sgnt();
	}

}
