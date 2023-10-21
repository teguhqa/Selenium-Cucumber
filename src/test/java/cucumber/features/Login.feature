Feature: Login to saucedemo
  Scenario: User can login with valid credential
    Given user at Swag Labs Login screen
    When user type standard_user in Username field
    And user type secret_sauce in Password field
    And user click Login button
    Then user navigated to Product page

  Scenario: User can't login with invalid password
    Given user at Swag Labs Login screen
    When user type standard_user in Username field
    And user type invalid_password in Password field
    And user click Login button
    Then user see error message Epic sadface
