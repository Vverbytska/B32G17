@B32G17-195
Feature: Default

	
	@B32G17-192
	Scenario: Company Structure is visible for all user types
		Given I am logged in as a "<all user >" user
		When I navigate to the Company Structure page
		Then I should be able to see the Company Structure	

	
	@B32G17-193
	Scenario: HR user can add a department from the Company Structure
		Given I am logged in as an "HR" user
		    When I navigate to the Company Structure page
		    And I click on the "Add Department" button
		    And I enter department details
		    And I save the department
		    Then I should see the newly added department in the Company Structure	

	
	@B32G17-194
	Scenario:  The “AD DEPARTMENT” button is not displayed for Helpdesk and Marketing users.
		Given I am logged in as a "<hr>" user
		    When I navigate to the Company Structure page
		    Then I should  see the 'ADD DEPARTMENT' button