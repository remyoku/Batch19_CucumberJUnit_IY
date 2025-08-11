@regression
Feature: Login Tests With Cucumber Parameters

  Background:
    Given The user is on the login page

  Scenario: Login as remyoku - Cucumber Parameters
   # Given The user is on the login page
    When The user logins with "liorariven@gmail.com" and "Irem.2113"
    Then The user should be able to "remyoku" on dashboard page


  Scenario: Login as Rosa - Cucumber Parameters
   # Given The user is on the login page
    When The user logins with "rosa@test.com" and "Test123456"
    Then The user should be able to "Rosa" on dashboard page


  Scenario: Login as Leeroy - Cucumber Parameters
   # Given The user is on the login page
    When The user logins with "leeroyjenkins@email.com" and "1234.Asdf"
    * The user should be able to "Leeroy" on dashboard page


  Scenario: Login as mike - Cucumber Parameters
   # Given The user is on the login page
    When The user logins with "mike@gmail.com" and "mike1234"
    Then The user should be able to "mike" on dashboard page
    And The number is 46
    And The number also is 5.56
    And The number can be 12.7

  #manssimo yapılcak

  Scenario: Login as Mansimmo - Cucumber Parameters
   # Given The user is on the login page
    When The user logins with "Ramanzi@test.com" and "Test123456"
    Then The user should be able to "Mansimmo" on dashboard page

