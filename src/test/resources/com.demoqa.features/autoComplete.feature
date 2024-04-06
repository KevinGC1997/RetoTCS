Feature: the user go to auto complete

  Scenario Outline: the user wants to test the website in the autocomplete
    Given that user access successfully to the <website>
    When the user go to auto complete to enter <colorBlack> <colorWhite>
    Then the user validate <colorBlack> <colorWhite>
    Examples:
      | website             | colorBlack | colorWhite |
      | https://demoqa.com/ | Black      | White      |