Feature: User can login with valid email and password

  Scenario Outline: User login
    Given  user1 in home page
    When entered "<email>","<password>"
    And click login button
    Then the login page display successful

    Examples:

      | email | password |
      | mona@gmail.com | 123456 |
#     | test@gmail.com | 12345679 |