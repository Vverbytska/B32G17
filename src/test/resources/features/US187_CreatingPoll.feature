@B32G17-222
Feature: Default

	Background: Login by user type
		Given user is on the login page
		When user enters the "helpdesk" information
		Then user should be able to login




	
	@B32G17-215
	Scenario: The delivery is 'All employees' by default when clicking poll tab
		Given User is on Home page
				When User clicks POLL tab
				Then User sees "All employees" by default

	
	@B32G17-216
	Scenario: Creating a poll by adding questions and multiple answers
		Given User is on Home page
		When User clicks POLL tab
		And User clicks Question box
		And User types a question "What is your favorite language" into question box
		And User clicks Answer1 box
		And User types the Answer1 "Java" into Answer1 box
		And User clicks Answer2 box
		And User types the Answer2 "Python" into Answer2 box
		And User clicks the SEND button to send the message
		Then User sees "<expectedPollTitle>" is in the table header

	@B32G17-217
	Scenario: Selecting the “Allow multiple choice” checkbox
		Given User is on Home page
		When User clicks POLL tab
		And User clicks Allow multiple choice checkbox
		Then User sees Allow multiple choice checkbox clicked
	
	@B32G17-218
	Scenario: Verifying the 'The message title is not specified' error message
		Given User is on Home page
				When User clicks POLL tab
				And User clicks SEND button to send empty message
				Then User sees error message 'The message title is not specified'	

	
	@B32G17-219
	Scenario: Verifying the 'Please specify at least one person.' error message
		Given User is on Home page
				When User clicks POLL tab
				And User deselects All employees option
				And User clicks SEND button to send empty message
				Then User sees error message 'Please specify at least one person.'	

	
	@B32G17-220
	Scenario: Verifying the 'The question text is not specified.' error message
		Given User is on Home page
		When User clicks POLL tab
		And User clicks message box to type a message
		And User types a message "How are you today?"
		And User clicks Answer1 box
		And User types the Answer1 "I am good" into Answer1 box
		And User clicks Answer2 box
		And User types the Answer2 "Not bad" into Answer2 box
		And User clicks SEND button to send the message
		Then User sees error message 'The question text is not specified.'

	
	@B32G17-221
	Scenario: Verifying the 'The question has no answers.' error message
		Given User is on Home page
		When User clicks POLL tab
		And User clicks message box to type a message
		And User types a message "How are you today?"
		And User clicks Question box
		And User types a question "What is your favorite language" into question box
		And User clicks SEND button to send the message
		Then User sees error message {string} has no answers.

	
