Feature: Test the login functionality of OrangeHRM 

Scenario Outline: Test valid login 

	Given user is on loginPage 
	When user use valid <username> and <password> 
	And user clicks on loginButton 
	Then user should land on homePage 
	
	Examples: 
		|username|password|
		|Admin |admin123|
		|admin1|admin1234|
