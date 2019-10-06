Feature: Buy Discounted Books

  Scenario: Buy book 0, 1, 2, 3, 4
    Given the user chose book 0
    Given the user chose book 1
    Given the user chose book 2
    Given the user chose book 3
    Given the user chose book 4
    When the user checks out
    Then the system should charge 30 EUR

  Scenario: Buy book 1 and 2
    Given the user chose book 1
    Given the user chose book 2
    When the user checks out
    Then the system should charge 15.2 EUR
