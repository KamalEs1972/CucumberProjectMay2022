Feature: Test the login functionality of OrangeHRM 

Scenario: Test valid login

	Given user is on loginPage
	When user use valid name and password
	And user clicks on loginButton
	Then user should land on homePage
	
Scenario: Test invalid login

	Given user is on loginPage
	When user use valid name and password
	And user clicks on loginButton
	Then user should land on homePage
