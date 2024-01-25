@AddToCart
Feature: This feature is used to test the AddToCart functionality of Swag Labs Applications

  Background: 
    Given I have launched the application
    When I enter username as "standard_user"
    And I enter password as "secret_sauce"
    And I click on Login button
    Then I should land to the home page
    
 

  Scenario: Add the product to Cart
    When I click on the Product name as "Sauce Labs Backpack"
    And I click on the Add to cart Button
    And I click on Shopping cart link
    Then I verify the item on the cart page
