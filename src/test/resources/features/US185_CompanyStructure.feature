Feature: Login functionality
Background:
Given the user is logged into the system

 Scenario Outline : Verify that the Company Structure is visible for all user types
When the user navigates to the Employees menu
Then the Company Structure option should be visible

Given that user is already on the homepage
When user clicks the 'Employees'
Then user should be able to see "Company Structure" as default.

Examples:

|useType|
|Human resource|
|Helpdesk|
|Marketing|

Scenario Outline: Verify that the “ADD DEPARTMENT” button is not displayed for Helpdesk and Marketing users
Given the user type is 'UserType'
And the user is on the Company Structure page
Then the "ADD DEPARTMENT" button should not be displayed

Examples:
| UserType   |
| Helpdesk   |
| Marketing  |

