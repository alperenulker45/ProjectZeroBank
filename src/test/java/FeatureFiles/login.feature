Feature: Login Function

  Scenario: Login with valid username and password

    Given Navigate to zerobank
    And Enter login name "username" and "password"
    When Click sign in button
    And Proceed to website
    Then User should login successfully


  Scenario Outline: Login with invalid credentials

    Given Navigate to zerobank
    And Enter login name "<username>" and "<password>"
    When Click sign in button
    Then User should see error message

    Examples:
    |username | password |
    |alpierro | 454545   |
