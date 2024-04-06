Feature: the user go to cart

  Scenario Outline: the user wants to test the website in the cart
    Given that user access successfully to the <website>
    When the user filters by <filters> to add cart
    Then validate that object was <object>
    Examples:
      | website                    | filters             | object                   |
      | https://www.saucedemo.com/ | Price (high to low) | Sauce Labs Fleece Jacket |