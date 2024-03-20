
Background:
Given the user is logged into the system
TC1
Scenario: Verify that the Company Structure is visible for all user types
When the user navigates to the Employee menu
Then the Company Structure option should be visible

TC 2
Given that user is already on the homepage
When user clicks the "Employee Module"
Then user should be able to see "Company Structure" as default.

Examples:

|useType|
|Human resource|
|Helpdesk|
|Marketing|
Tc3
Scenario Outline: Verify that the “ADD DEPARTMENT” button is not displayed for Helpdesk and Marketing users
Given the user type is "<UserType>"
And the user is on the Company Structure page
Then the "ADD DEPARTMENT" button should not be displayed

Examples:
| UserType   |
| Helpdesk   |
| Marketing  |
