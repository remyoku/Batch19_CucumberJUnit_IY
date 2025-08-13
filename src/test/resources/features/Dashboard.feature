@regression
Feature: Dashboard Tests

  @smoke
  Scenario: Developers Page Test
    Given The user is on the login page
    When The user enters remyoku's credentials
    Then The user should be able to see dashboard page
    When The user clicks on developers link
    Then The user should be able to see developers page title

  @wip
  Scenario: Developers Page Test - Cucumber Parameters
    Given The user is on the login page
    When The user logins with "liorariven@gmail.com" and "Irem.2113"
    Then The user should be able to "remyoku" on dashboard page
    When The user clicks on tab : "JavaScript" and module: "Draggable"
    Then The user should be able to see related page title with three parts : "Draggable"
    When The user clicks on tab : "Developers" and module: ""
    Then The user should be able to see related page title with two parts : "Developers"


  Scenario: Dashboard Tabs Check
    Given The user is on the login page
    When The user logins with "liorariven@gmail.com" and "Irem.2113"
    Then The user should be able to "remyoku" on dashboard page
    And The user should verify the dashboard tabs with follows
      | Dashboard  |
      | Developers |
      | Components |
      | Forms      |
      | JavaScript |
      | remyoku    |




