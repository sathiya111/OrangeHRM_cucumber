Feature: verifying OrangeHRM site
Scenario: verifying login credential
Given user is on the login page
When user enters valid username and password
Then user navigate to the home page