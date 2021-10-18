Feature: Automation test for policy expert

  Scenario: User to complete registration form

    Given Navigate to website
    When I enter firstname as "John" of new customer
    And I enter lastname as "smith" of new customer
    And I select title as "Mr"
    And I select occupation as "Book-Keeper"
    And I enter phonenumber "07656445566"
    And I enter email as "vketipisz@qmetric.co.uk "
    And I enter DOB as day "10" month "June" and year "1990"
    And I enter matrinal status "Single"
    And I enter another occupation as No
    And I enter address as area "tw3" and location "Royal Mail"
    And I enter occupation address yes
    When I select property as "House" and type in "Detached house"
