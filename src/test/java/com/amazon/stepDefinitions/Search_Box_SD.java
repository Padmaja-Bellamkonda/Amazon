package com.amazon.stepDefinitions;

import com.amazon.pom.Product_Search;
import com.amazon.utility.TestBase;

import cucumber.api.java.en.*;

public class Search_Box_SD extends TestBase {
	
	Product_Search pdct;
	
	//Searching for a Product
	
	@Given("^the user opens the application$")
	public void the_user_is_on_home_page() {
		TestBase.initialization();
		driver.get(prop.getProperty("url"));
	}
	
	@When("^the user checks the presence of search box$")
	public void the_user_checks_the_presence_of_search_box() {
	    pdct = new Product_Search();
	    pdct.display();
	}

	@Then("^enters \"([^\"]*)\"$")
	public void enters(String arg1) {
	    pdct.prdctnm(arg1);
	}

	@And("^searches for that$")
	public void searches_for_that() {
	   pdct.search();
	}
	
	
	
}
