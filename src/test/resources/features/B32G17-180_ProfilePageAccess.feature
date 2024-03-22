@B32G17-180
Feature: Profile page access feature
  User story: As a user, I should be able to access my profile page.

  Background: login
    Given user is on the login page
    When user enters the "helpdesk" information
    Then user should be able to login

  Scenario: Verify that the user can view the following options on My Profile page.
    Given user clicks on the profile icon
    And user clicks on My Profile link
    Then user should see five options as below
      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |

    Scenario: Verify that the email under the General tab is the same as the user’s account.
      Given user clicks on the profile icon
      And user clicks on My Profile link
      Then user should see the email address under contact info is the same as in header
