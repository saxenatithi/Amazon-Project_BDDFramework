@Sanity
Feature: Guest User shopping on Amazon

  Scenario: Guest user visits Amazon website
    Given user must be on Amazon Webpage
    When user search a product in search bar by entering "HP Laptops"
    And upon clicking search icon, user should see search product results
    And user select an item and add to the cart
    Then user should see confirmation message that the product is added to the cart
    And user clicks on the "Proceed to Checkout (1 item)" option
    And user should be prompted to log in or create account
