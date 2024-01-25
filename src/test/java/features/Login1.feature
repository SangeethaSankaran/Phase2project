@Login1Feature
Feature: This feature is used to check the login functionality of Swag Labs

  Scenario: Validate the login scenarios using parameters
    Given I have launched the application
    When I enter username as "standard_user"
    And I enter password as "secret_sauce"
    And I click on Login button
    Then I should land to the home page

  Scenario Outline: validate the login failure scenarios using examples
    Given I have launched the application
    When I enter username as "<UserName>"
    And I enter password as "<Password>"
    And I click on Login button
    Then I should get the error message as "<Error>"

    Examples: 
      | UserName        | Password     | Error                                                                     |
      | standard_user   |       123456 | Epic sadface: Username and password do not match any user in this service |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.                    |
