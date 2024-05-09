@LoginPage
Feature: Login Page Test Scenarios

  @check
  Scenario: Check Login Page Components
    When Click to Don't Allow Button
    When  Click to Myaccount Symbol
    When Click to LoginButton
    Then Check to Girisyap Button is Available in Login Page
    Then  Check E-Posta Box is Available in Login Page

  @FalseEmailAdresse
  Scenario Outline: False e-mails
    When Click to Don't Allow Button
    When Click to Myaccount SYMBOL
    When  Click to LoginButton
    When wRITE false Email
    When Check to <Error> Message

    Examples:
      | Error   |
      | invalid |



