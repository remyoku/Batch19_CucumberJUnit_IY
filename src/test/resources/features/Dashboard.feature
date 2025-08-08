@regression
Feature: Dashboard Tests
   @smoke
  Scenario: Developers Page Test
    Given The user is on the login page
    When The user enters remyoku's credentials
    Then The user should be able to see dashboard page
    When The user clicks on developers link
    Then The user should be able to see developers page title

