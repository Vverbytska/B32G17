Feature: Login functionality

  Scenario: Login by user type
    Given user is on the login page
    When user enters the "helpdesk" information
    Then user should be able to login