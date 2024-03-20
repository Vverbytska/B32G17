@B32G17-204
Feature: Default

	Background: Login by user type
		Given user is on the login page
		When user enters the "helpdesk" information
		Then user should be able to login

	#*US:*
	#As a user, I should be able to send messages by clicking on Message tab in the Activity Stream
	#
	#*AC:*
	#Verify that the user can send a message by filling in the mandatory fields.
	#Mandatory fields: 'Message content & 'Recipient'.
	#        Error messages for mandatory fields:
	#       "The message title is not specified."
	#       "Please specify at least one person."
	@B32G17-196
	Scenario: US181_AC1_TC1_Verify that the user can send a message to all employees
		Given user is on Home page
		When user clicks on MESSAGE button
		And user types message content "text"
		And All employees are selected
		Then user clicks on SEND button
		And sent message is displayed on Activity Stream	

	#*US:*
	#As a user, I should be able to send messages by clicking on Message tab in the Activity Stream
	#
	#*AC:*
	#Verify that the user can send a message by filling in the mandatory fields.
	#Mandatory fields: 'Message content & 'Recipient'.
	#Error messages for mandatory fields:
	#"The message title is not specified."
	#"Please specify at least one person."
	@B32G17-197
	Scenario: US181_AC1_TC2_Verify that the user can send a message to selected employee
		Given user is on Home page
		When user clicks on MESSAGE button
		And user types message content "text"
		Then user delete All employees option
		And user add recipient "hr76@cydeo.com"
		Then user clicks on SEND button
		And sent message is displayed on Activity Stream	

	#*US:*
	#As a user, I should be able to send messages by clicking on Message tab in the Activity Stream
	#
	#*AC:*
	#Verify that the user can send a message by filling in the mandatory fields.
	#Mandatory fields: 'Message content & 'Recipient'.
	#        Error messages for mandatory fields:
	#       "The message title is not specified."
	#       "Please specify at least one person."
	@B32G17-198
	Scenario: US181_AC1_TC3_Verify that "The message title is not specified." error message is displayed 
		Given user is on Home page
		When user clicks on MESSAGE button
		And All employees are selected
		And user clicks on SEND button
		Then "The message title is not specified" error message is displayed	

	#*US:*
	#As a user, I should be able to send messages by clicking on Message tab in the Activity Stream
	#
	#*AC:*
	#Verify that the user can send a message by filling in the mandatory fields.
	#Mandatory fields: 'Message content & 'Recipient'.
	#        Error messages for mandatory fields:
	#       "The message title is not specified."
	#       "Please specify at least one person."
	@B32G17-199
	Scenario: US181_AC1_TC4_Verify that "Please specify at least one person." error message is displayed 
		Given user is on Home page
		When user clicks on MESSAGE button
		And user types message content "text"
		And user deselects All employees
		And user clicks on SEND button
		Then "Please specify at least one person." error message is displayed	

	#*US:*
	#As a user, I should be able to send messages by clicking on Message tab in the Activity Stream
	#
	#*AC:*
	#Verify that the message delivery is to 'All employees' by default.
	@B32G17-200
	Scenario: US181_AC2_TC1_Verify that the message delivery is to "All employees" by default.
		Given user is on Home page
		When user clicks on MESSAGE button
		Then All employees are selected	

	#*US:*
	#As a user, I should be able to send messages by clicking on Message tab in the Activity Stream
	#
	#*AC:*
	#Verify that the user can cancel sending message at any time before sending.
	@B32G17-201
	Scenario: US181_AC3_TC1_Verify that the user can cancel message before typing content.
		Given user is on Home page
		When user clicks on MESSAGE button
		Then user should be able to click on CANCEL button

	#*US:*
	#As a user, I should be able to send messages by clicking on Message tab in the Activity Stream
	#
	#*AC:*
	#Verify that the user can cancel sending message at any time before sending.
	@B32G17-202
	Scenario: US181_AC3_TC2_Verify that the user can cancel message after typing content.
		Given user is on Home page
		When user clicks on MESSAGE button
		And user types message content "text"
		Then user should be able to click on CANCEL button

	#*US:*
	#As a user, I should be able to send messages by clicking on Message tab in the Activity Stream
	#
	#*AC:*
	#Verify that the user can cancel sending message at any time before sending.
	@B32G17-203
	Scenario: US181_AC3_TC3_Verify that the user can cancel message after typing content and changing recipient.
		Given user is on Home page
		When user clicks on MESSAGE button
		And user types message content "text"
		Then user delete All employees option
		And user add recipient "hr76@cydeo.com"
		Then user should be able to click on CANCEL button