Feature: Add products to the WishList
  I wnt to add product to WishList

  Scenario Outline: user can add products to the WishList

    Given the_user0 in home page
    When I click login BTN
    And enterr "email","password"
    And click on computer category
    And choose a disktop
    And use scrollTo method
    Then we can add product to wishList
    Examples:
      | email | password|
    |mona@gmail.com|123456|