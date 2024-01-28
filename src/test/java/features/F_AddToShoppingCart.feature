Feature: Add products to the shopping cart
  I wnt to add product to shopping cart

  Scenario Outline: user can add products to the shopping cart

    Given the_user in home page
    When I click login button
    And enter "mail","password"
    And search for a product
    Then we can add product to shopping cart



    Examples:
      | mail | password|
    | mona@gmail.com | 123456 |