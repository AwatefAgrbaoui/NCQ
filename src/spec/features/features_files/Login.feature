Feature: I want to test the connection page of the application Swag Labs
  As a registered buyer, I want to test the connection page of the application Swag Labs

  @Login_valid_credentials
  Scenario: I want to test the connection page with valid credentials
    Given I connect to the application Swag Labs
    When I enter the username "standard_user"
    And I enter the password "secret_sauce"
    And I click on the button Login
    Then I am redirected to the home page "Swag Labs"

  @Login_invalid_credentials
  Scenario: I want to test the connection page with invalid credentials
    Given I connect to the application Swag Labs
    When I enter the username "awatef"
    And I enter the password "123"
    And I click on the button Login
    Then Error message is displayed "Epic sadface: Username and password do not match any user in this service"
