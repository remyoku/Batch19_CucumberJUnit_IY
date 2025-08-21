@regression
Feature: Login Function

  # for comment - yorum satırı

  #user story = feature
  #test case = scenario
  #test steps = given

  @admin @smoke
  Scenario: Login as remyoku
    Given The user is on the login page
    When The user enters remyoku's credentials
    Then The user should be able to see dashboard page

  @dev @smoke
  Scenario: Login as Mansimmo
    Given The user is on the login page
    When The user enters Mansimmo's credentials
    Then The user should be able to see Mansimmo's name on the dashboard page

    #class task create a scenario for login test with mike
  @qa @db
  Scenario: Login as Mike
    Given The user is on the login page
    When The user enters Mike's credentials
    Then The user should be able to see Mike's name on the dashboard page

   @qa @smoke @db
  Scenario: Login as Rosa
    Given The user is on the login page
    When The user enters Rosa's credentials
    Then The user should be able to see Rosa's name on the dashboard page

   @admin @paralel
  Scenario: Login as Leroy
    Given The user is on the login page
    When The user enters Leroy's credentials
    Then The user should be able to see Leeroy's name on the dashboard page