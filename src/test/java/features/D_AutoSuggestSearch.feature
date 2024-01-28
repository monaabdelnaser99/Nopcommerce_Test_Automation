Feature: User can Use AutoSuggestSearch
  I want check AutoSuggest

  Scenario Outline: User can  Use AutoSuggestSearch
    Given the user in home page can search for aproduct
    When  enter "product"
    And i click on suggestProduct
    Then display produt


    Examples:
      | product |
      | mac |