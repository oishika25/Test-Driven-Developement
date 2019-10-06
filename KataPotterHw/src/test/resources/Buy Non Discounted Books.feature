Feature: Buy Non Discounted Books

  Scenario: Buy book 1
    Given the user chose book 1
    When the user checks out
    Then the system should charge 8 EUR

  Scenario: Buy book 1 and 1
    Given the user chose book 1
    Given the user chose book 1
    When the user checks out
    Then the system should charge 16 EUR
