@sanity
Feature: Login with Valid Credentials 

Scenario: Successful Login with Valid Credentials 
	Given User launch browser and opens Url 
	When User navigate to MyAccount menu 
	And click on Login 
	And User enters Email as "hafiz2001@yahoo.com" and Password as "B12345" 
	And Click on Login button 
	Then User navigates to MyAccount Page