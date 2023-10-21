Feature: Information

  Background:
    Given user at Swag Labs Login screen
    When user type standard_user in Username field
    And user type secret_sauce in Password field
    And user click Login button
    Then user navigated to Product page

  Scenario: User put valid information on Your Information screen
    When user click Add to cart on product Sauce Labs Backpack
    And user click Cart button
    And user click Checkout button
    And user type firstName in First Name field
    And user type lastName in Last Name field
    And user type 10000 in Postal Code field
    And user click Continue button
    And user click Finish button
    Then user navigated to Checkout: Complete!

  Scenario: User not put any information on Your Information screen
    When user click Add to cart on product Sauce Labs Backpack
    And user click Cart button
    And user click Checkout button
    And user click Continue button
    And user click Finish button
    Then user see error message Error: First Name is required displayed
