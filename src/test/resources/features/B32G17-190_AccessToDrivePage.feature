@B32G17_US190
Feature: Access To Drive Page

  Background: Login by user type
    Given user is on the login page
    When user enters the "hr" information
    Then user should be able to login


  Scenario: Verifying the visibility of modules on the Drive page
Given user is on the home page
When the user navigates to the Drive page
And  user should click on Drive option
Then the user should be able to see the following  modules:
|My Drive|
|All Documents|
|Company Drive|
|Sales and Marketing|
|Top Management's documents|
|Drive Cleanup             |
|More                      |


