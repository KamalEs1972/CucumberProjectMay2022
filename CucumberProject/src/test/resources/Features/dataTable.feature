Feature: Test the login functionality of OrangeHRM using DataTable 

Scenario: Test valid login using DataTable 

	Given user is on loginPage 
	When user use valid credentials using DataTable 
		|Admin |admin123 | 
	And user clicks on loginButton 
	Then user should land on homePage 
	
	
