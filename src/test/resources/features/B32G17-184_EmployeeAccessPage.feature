

Feature: Employee page access Verification
  User Story: As a user, I should be able to access the employee page.


  Background:
When user is at login page
    Then user enters username
    And user enters password
    Then user clicks login button
    Then user sees the dashboard


  Scenario: User can see the modules in the employee page verification.
    When User has already clicked on employee module
  Then User sees the following Modules:
    | Company Structure|
    |Find Employee|
    |Telephone Directory|
    |Staff Changes|
    |Efficiency Report|
    |Honored Employees|
    |Birthdays|
    |New page|



    Scenario: User sees Company Structure  by default
     When User has already clicked on employee module
      Then user is able to see the company structure sign
