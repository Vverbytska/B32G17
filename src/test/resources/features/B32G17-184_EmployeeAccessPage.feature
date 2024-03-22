Feature: Employee page access Verification
  User Story: As a user, I should be able to access the employee page.


  Scenario: User can see the modules in the employee page verification.
 Given user is already logged in and landed on the home page
  When User clicks on the Employees Modules
  Then User sees the following 8 Modules:
    #1. Verify that the user views the following 8 modules in the Employees page.
    #    Company Structure
    #    Find Employee
    #    Telephone Directory
    #    Staff Changes
    #    Efficiency Report
    #    Honored Employees
    #    Birthdays
    #    New page
