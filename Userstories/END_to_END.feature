@Integrationtesting
Feature: Amazon Icon Test

Background:

	Given the user opens chrome browser 
	When the user enters url 
	Then hover on Accounts and Lists
	When the user click on Sign in button
	Then the user enters email-id 
	And click on continue
	Then the user enters password
	And Login to application 

Scenario: Validate the functioning of Amazon Icon

	Given the user checks the presence of Amazon Icon
	And click on Amazon icon
	
	
Scenario: Validate the user prime creation 

	Given the user hover on try prime link
	And click on that link
	Then choose one offer button
	And select the payment method
	Then give the details 
	And add the card
	Then signout from the application