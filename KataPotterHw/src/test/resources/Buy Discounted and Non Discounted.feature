Feature: Buy Discounted and Non Discounted
 
  Scenario: Buy book 0, 1, 3
    Given the user chose book 0
    Given the user chose book 1
    Given the user chose book 3
    When the user checks out
    Then the system should charge 22.8 EUR

    
   