@regression
Feature: Experience Tests


  Scenario: Add Experience Form Label Check
    Given The user is on the login page
    When The user logins with "liorariven@gmail.com" and "Irem.2113"
    Then The user should be able to "remyoku" on dashboard page
    When The user clicks on tab : "remyoku" and module: "My Profile"
    Then The user should be able to see related page title with two parts : "User Profile"
    When  The user navigates user profile tab menu with :"Add Experience"
    Then The user should be able to verify add experience form labels with following list
      | Job Title *     |
      | Company *       |
      | Location        |
      | From Date       |
      | To Date         |
      | Job Description |