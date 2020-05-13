package com.amazon.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features = "E:\\Project\\Amazon\\Userstories", //feature file
		glue = {"com/amazon/stepDefinitions"}, //step definition file
		monochrome = true, //display the console output in a proper readable format
		strict = true, // it will cross check whether every step having corresponding method implemented or not
		//dryRun = true, //to check mapping between feature file and step definition file
		dryRun = false,  // executes the test cases
		tags = {"~@Functionaltesting","@Integrationtesting","~@Smoketesting"},
		plugin = { "pretty",  "html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json"}
		
		)

public class Runner  extends AbstractTestNGCucumberTests{

}
