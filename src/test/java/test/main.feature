Feature: Check login

@tag1
Scenario: Check login with credentials
Given Landed on landing page
When Enter username and password
And click on login button
Then landed on home page