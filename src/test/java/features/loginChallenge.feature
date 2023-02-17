Feature: Login

  Scenario: Loggin ok
    Given The username and password are entered correctly
    When Click in log in button
    Then Login successfully

  Scenario: Wrong log in
    Given El nombre de usuario es invalido
    When clickeo en el boton de login
    Then obtengo un mensaje de error

  Scenario: Add a item to the shopping cart
    Given I add a item to the shop cart
    When  i click on ADD TO CART button
    Then  the shopping cart must show the quantity correctly

  Scenario: Remove a item from the cart
    Given I have one item in the shopping cart
    When  i click on REMOVE button
    Then  the shopping cart must show one item less
