Feature: Login tests with scenario outline


  Scenario Outline: Positive Login Tests <username>
    Given The user is on the login page
    When The user logins with "<email>" and "<password>"
    Then The user should be able to "<username>" on dashboard page
    Examples:
      | email                | password   | username    |
      | liorariven@gmail.com | Irem.2113  | remyoku     |
      | rosa@test.com        | Test123456 | Rosa        |
      | mgezer@gmail.com     | Mg12345678 | Melih Gezer |
      | user33@test.com      | Test123456 | User33      |
      | mike@gmail.com       | mike1234   | mike        |


  Scenario Outline: Negative Login Tests
    Given The user is on the login page
    When The user logins with "<email>" and "<password>"
    Then The user should be able to see warning "<message>"
    Examples:
      | email             | password      | message                                  |
      | wrongmail@aaa.com | Irem.2113     | Email address is incorrect. Please check |
      | rosa@test.com     | wrongPassword | Password is incorrect. Please check      |
      |                   | mike1234      | Please enter your email.                 |
      | mgezer@gmail.com  |               | Please enter your password!              |
      |                   |               | Please enter your email.                 |