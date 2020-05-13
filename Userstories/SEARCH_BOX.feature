@Functionaltesting
Feature: Search Box Test

Scenario Outline: Validate the Product Search

	Given the user opens the application
	When the user checks the presence of search box
	Then enters "<Productname>"
	And searches for that
		
Examples:
	| Productname |
	| Mobile |
	| Pendrive |