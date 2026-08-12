@SearchProduct
Feature: Product Search and Validation

  Scenario: Search for a Barcelona product and validate its details

Given User launches FootballMonk website
When User searches for "Barcelona"
And User opens the first product
Then Product name should be displayed
And User should select size "M"
And Add To Cart button should be clicked