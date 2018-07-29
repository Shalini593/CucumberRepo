Feature: Facebook login
As a fb user, I want to enter username and pwd as a prameter

Scenario: validate fb login Scenario
Given the user is on facebook login page
When he enters "shalini" as user name
And he enters "pwd" as password
Then check username is present in textbox
And he clicks on Log In