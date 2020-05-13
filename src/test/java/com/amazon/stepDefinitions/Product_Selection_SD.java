package com.amazon.stepDefinitions;

import com.amazon.pom.Product_Search;
import com.amazon.pom.Product_Selection;
import com.amazon.utility.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class Product_Selection_SD extends TestBase {

	Product_Search pdct;
	Product_Selection ps;

	// Usage of Hooks

	@Before
	public void setUP() {
		TestBase.initialization();
	}

	@Given("^the user is on home page$")
	public void the_user_is_on_home_page() {
		driver.get(prop.getProperty("url"));
	}

	// Searching a product

	@And("^enters productname$")
	public void enters_productname() {
		pdct = new Product_Search();
		pdct.prdctnm(prop.getProperty("name"));
	}

	@Then("^searches for product category$")
	public void searches_for_product_category() {
		pdct.search();
	}

	// Selecting a particular product

	@And("^selects a particular product$")
	public void selects_a_particular_product() {
		ps = new Product_Selection();
		ps.product();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
