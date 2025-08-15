@regression
Feature: Education Tests


  Scenario: Add Education Form Label Check
    Given The user is on the login page
    When The user logins with "liorariven@gmail.com" and "Irem.2113"
    Then The user should be able to "remyoku" on dashboard page
    When The user clicks on tab : "remyoku" and module: "My Profile"
    Then The user should be able to see related page title with two parts : "User Profile"
    When  The user navigates user profile tab menu with :"Add Education"
    Then The user should be able to verify add education form labels with following list
      | School or Bootcamp *    |
      | Degree or Certificate * |
      | Study                   |
      | From Date               |
      | To Date                 |
      | Program Description     |


  Scenario Outline: Filling Education Form For Different Persons <user name>
    Given The user is on the login page
    When The user logins with "<email>" and "<password>"
    Then The user should be able to "<username>" on dashboard page
    When The user clicks on tab : "<username>" and module: "My Profile"
    Then The user should be able to see related page title with two parts : "User Profile"
    When  The user navigates user profile tab menu with :"Add Education"
    Then The user verify that add education page is displayed
    When The user fills the education form with "<schoolName>" and "<degree>" and "<study>" and "<fromDate>" and "<toDate>" and "<desc>"
    Then The user should be able to verify added education record with "<schoolName>"
    Then The user should be able to delete last added education record with "<schoolName>"
    Examples:
      | email                | password   | username      | schoolName  | degree   | study                  | fromDate | toDate   | desc         |
      | liorariven@gmail.com | Irem.2113  | remyoku       | ITU         | Bachelor | QA Tester              | 11112024 | 12112025 | IT Program   |
      | rosa@test.com        | Test123456 | Rosa          | IBU         | Master   | Medicine               | 11112024 | 12112025 | Hard Program |
      | mgezer@gmail.com     | Mg12345678 | Melih Gezer | ODTU        | Licence  | Public Finance         | 11112024 | 12112025 | Nice Program |
      | mike@gmail.com       | mike1234   | mike          | Galatasaray | Doctor   | International Relation | 11112024 | 12112025 | Good Program |