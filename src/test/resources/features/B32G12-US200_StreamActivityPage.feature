Feature: As a user, I should be able to send message by clicking on Message tab in the Stream Activity

  Scenario Outline: Verify that user can send message by filing in the mandatory fields
    When user is log in as "<userType>"
    And user clicks on the "Stream Activity"
    And user clicks "Message" in Stream Activity
    And user writes a message "Hi"
    And user clicks on send button
    Then user should be able to see "Hi" which is sent

    Examples:
    |userType|
    | hr     |
    |helpdesk|
    |marketing|


