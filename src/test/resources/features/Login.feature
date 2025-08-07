Feature: Login Function

  # for comment - yorum satırı

  #user story = feature
  #test case = scenario
  #test steps = given


  Scenario: Login as remyoku
    Given The user is on the login page
    When The user enters remyoku's credentials
    Then The user should be able to see dashboard page

  Scenario: Login as Mansimmo
    Given The user is on the login page
    When The user enters Mansimmo's credentials
    Then The user should be able to see dashboard page

    #class task create a scenario for login test with mike

  Scenario: Login as Mike
    Given The user is on the login page
    When The user enters Mike's credentials
    Then The user should be able to see dashboard page