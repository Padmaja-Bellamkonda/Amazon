@Smoketesting
Feature: Product Selection Test without login

Scenario: Validate the product selection

	 Given the user is on home page 
	 And enters productname
	 Then searches for product category
	 And selects a particular product	