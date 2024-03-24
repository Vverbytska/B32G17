@B32G17-237
Feature: As a user, I should be able to add link in message

  Background: Login
    Given user is on the login page
    When user enters the "hr" information
    Then user should be able to login

  @B32G17-236
  Scenario:
    #Given user is already homepage
    And User hits the message tab
    And User hits the Link button
    And User types in the text area message
    And User in the link area "www.google.com"
    And User hits the save button
    And User hits the send button
    And User displayed sent message on the Activity Stream
    Then User hits the sent message
    And Verify that the link is opened in a new tab
