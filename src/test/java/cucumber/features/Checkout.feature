Feature: Checkout product

  Background:
    Given user at Swag Labs Login screen
    When user type standard_user in Username field
    And user type secret_sauce in Password field
    And user click Login button
    Then user navigated to Product page

  Scenario: User checkout all the product
    When user click Add to cart on product Sauce Labs Backpack
    And user click Add to cart on product Sauce Labs Bike Light
    And user click Add to cart on product Sauce Labs Bolt T-Shirt
    And user click Add to cart on product Sauce Labs Fleece Jacket
    And user click Add to cart on product Sauce Labs Onesie
    And user click Add to cart on product Test.allTheThings T-Shirt Red
    And user click Cart button
    And user click Checkout button
    And user type firstName in First Name field
    And user type lastName in Last Name field
    And user type 10000 in Postal Code field
    And user click Continue button
    And user click Finish button
    Then user navigated to Checkout: Complete!

  Scenario: User checkout without any product
    When user click Cart button
    And user click Checkout button
    Then user see Error message Please add at least 1 product
