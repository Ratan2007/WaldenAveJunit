@smoke
Feature: Login Data Driven 

Scenario Outline: Login Data Driven 
	Given User launch browser and opens Url
	When User navigate to My account 
	And Click on login 
	And User enters Email as <"email"> and Password as<"password"> 
	And Click on login button 
	Then User nevagate to MyAccount Page 
	
	Examples: 
		|email               |password|
		|hafiz2001@gmail.com |B12345  |
		|hafiz@gmail.com     |test123 |
		
