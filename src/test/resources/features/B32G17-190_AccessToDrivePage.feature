@B32G17_US190
Feature: Access To Drive Page


  Scenario: Verifying the visibility of modules on the Drive page
Given user is on the home page
When the user navigates to the Drive page
And  user should click on Drive option
Then the user should be able to see the following 6 modules:
|1. My Drive|
|2. All Documents|
|3. Company Drive|
|4. Sales and Marketing|
|5. Top Management's documents|
|6. Drive Cleanup             |
|7. More                      |


