Feature: the user go to alert

  Scenario Outline: the user wants to test the website in the alert
    Given that user access successfully to the <website>
    When the user go to alert Frame
    Then the validate <confirmAlert>  <promptAlert>

    Examples:
      | website             | confirmAlert    | promptAlert      |
      | https://demoqa.com/ | You selected Ok | You entered test |