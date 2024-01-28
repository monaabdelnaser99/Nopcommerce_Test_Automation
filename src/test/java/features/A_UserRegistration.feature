Feature: User Registration
    I want to check that the user can register in our e-commerce website.

    Scenario Outline: User Registration
    Given the user in the home page
    When I click on register link
    And I entered "firstname" , "lastname" , "email" , "password"
    Then the registration page displayed successfuly

        Examples:
            | firstname | lastname  | email | password |
            | Mona  | Abdelnaser | mona@gmail.com | 123456|
            |Mona  | Ahmed       |test@gmail.com  |12345679|

