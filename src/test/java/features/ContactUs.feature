Feature:user can contact us
  I want to check that user can contact us
  Scenario Outline:User ContactUs
    Given User in home
    When I click in ContactUs in homePage
    And entered "name","email","enquiry"
    And click submit
    Then display success message


    Examples:
      | name | email | enquiry|
    |Mona  | mona@gmail.com|sss|