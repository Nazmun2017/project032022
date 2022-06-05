Feature: Amazon signin

Scenario: Validate Amazon signin

Given user visits Amazon homepage
When user clicks on sign in
Then user will type email and click on continue button
Then user will type password and click on sign in
And validate customer is on his own page
