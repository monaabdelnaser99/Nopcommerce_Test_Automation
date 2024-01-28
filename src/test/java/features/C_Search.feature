Feature: User can search
  I want to search for a product
Scenario Outline: User can search
Given user2 in home page
When  search  by "product"
  And i click search


  Examples:
  | product |
  | Apple MacBook Pro 13-inch |