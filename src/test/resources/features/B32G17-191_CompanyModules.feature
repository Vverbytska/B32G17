@B32G17-235
Feature: As a user, I should be able to access to the Company page

  Background: Login by user type
    Given user is on the login page
    When user enters the "hr" information
    Then user should be able to login


  @B32G17-234
  Scenario: Verify that the user can see 8 modules on the Company page
    Given user is on Home page
    When user clicks on Company option
    Then user should be able to see the following modules
      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Gallery        |
      | Video                |
      | Career               |
      | Business News (RSS)  |
      | More                 |