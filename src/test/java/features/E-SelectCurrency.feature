
Feature: Switch Currency
  I want to change currency

  Scenario Outline: Logged user could switch between any currencies US-euro

    Given  home_page
    When  I click login
    And I entered "<email>","<password>"
    And login button
    Then choose the Euro currency
    And Try search for product to certain that Currenvy Changed

    Examples:
      | email | password |
      | mona@gmail.com | 123456 |