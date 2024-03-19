@B32G17-214
Feature: Login functionality

	#US:
	#
	#As a user, I should be able to login
	#
	#AC:
	#
	#Verify that the user can log in with valid credentials and land on the home page after successful login.
	#   (We have 3 types of users such as {color:#de350b}HR use{color}r, Marketing user, and Helpdesk user).
  @B32G17-207
  Scenario Outline: US178_AC01_TC01 Verify user can log in as HR user
    Given user is on the login page
    When the user login with HR user "<username>","<password>"
    Then the user should be able to log in and see home page
    Examples:
      | username       | password |
      | hr1@cydeo.com  | UserUser |
      | hr19@cydeo.com | UserUser |
      | hr41@cydeo.com | UserUser |

	#US:
	#
	#As a user, I should be able to login
	#
	#AC:
	#
	#Verify that the user can log in with valid credentials and land on the home page after successful login.
	#   (We have 3 types of users such as {color:#172b4d}HR use{color}r, Marketing user, and {color:#de350b}Helpdesk{color} user).
  @B32G17-208
  Scenario Outline: US178_AC01_TC02 Verify user can log in as Help Desk user
    Given user is on the login page
    When the user login with Help Desk user "<username>","<password>"
    Then the user should be able to log in and see home page
    Examples:
      | username             | password |
      | helpdesk1@cydeo.com  | UserUser |
      | helpdesk37@cydeo.com | UserUser |
      | helpdesk46@cydeo.com | UserUser |

	#US:
	#
	#As a user, I should be able to login
	#
	#AC:
	#
	#Verify that the user can log in with valid credentials and land on the home page after successful login.
	#   (We have 3 types of users such as {color:#172b4d}HR use{color}r, {color:#de350b}Marketing {color}user, and Helpdesk user).
  @B32G17-209
  Scenario Outline: US178_AC01_TC03 Verify user can log in as Marketing user
    Given user is on the login page
    When the user login with Marketing user "<username>","<password>"
    Then the user should be able to log in and see home page
    Examples:
      | username               | password |
      | marketing1@cydeo.com   | UserUser |
      | marketing24@cydeo.com  | UserUser |
      | marketing100@cydeo.com | UserUser |

	#US:
	#
	#As a user, I should be able to login
	#
	#AC:
	#
	#Verify that "{color:#de350b}Incorrect login or password{color}" error message is displayed for invalid (valid username-invalid password and invalid username-valid password) credentials.
  @B32G17-210
  Scenario Outline: US178_AC02_TC01 Verify error message is displayed for invalid credentials
    Given user is on the login page
    When the user login with invalid "<username>","<password>"
    Then user should not be able to log in and error message is displayed

    Examples:
      | username             | password      |
      | wrongUserName        | UserUser      |
      | someUser@cydeo.com   | UserUser      |
      | marketing1@cydeo.com | wrongPassword |
      | helpdesk46@cydeo.com | abcd          |
      | hr1@cydeo.com        | wrongPassword |
      | wrongUser            | wrongPassword |

	#US:
	#
	#As a user, I should be able to login
	#
	#AC:
	#
	#Verify that the "{color:#de350b}Please fill out this field{color}" error message is displayed if the password or username is empty.
  @B32G17-211
  Scenario Outline: US178_AC03_TC01 Verify error message is displayed if credential is left empty
    Given user is on the login page
    When the user login with "<username>","<password>"
    Then user should not be able to log in and sees an error message

    Examples:
      | username             | password |
      |                      | UserUser |
      | hr1@cydeo.com        |          |
      | helpdesk46@cydeo.com |          |
      | marketing1@cydeo.com |          |
      |                      |          |

	#US:
	#
	#As a user, I should be able to login
	#
	#AC:
	#
	#Verify that the "{color:#4c9aff}Remember me on this computer{color}" link exists and is clickable on the login page.
  @B32G17-212
  Scenario: US178_AC04_TC01 Verify "Remember me" link exists and is clickable
    Given user is on the login page
    And user sees Remember me on this computer checkbox
    Then user is able to click the checkbox

	#US:
	#
	#As a user, I should be able to login
	#
	#AC:
	#
	#Verify that the password is in {color:#4c9aff}bullet{color} signs by default
  @B32G17-213
  Scenario Outline: US178_AC05_TC01 Verify the password is hidden when typing
    Given user is on the login page
    And user enters "<password>"
    Then user should see the password hidden as bullet signs
    Examples:
      | password      |
      | UserUser      |
      | wrongPassword |
      | 123456        |
      | ^%$()*        |