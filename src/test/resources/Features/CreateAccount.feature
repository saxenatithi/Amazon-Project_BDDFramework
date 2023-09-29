@Smoke
Feature: Amazon Account Registration

  Background: 
    Given the user is already on Amazon registration page
	@Regression
  Scenario: User registration required fields
    When user clicks on continue button
    Then user should see error message on username, email and password fields
	@Regression
  Scenario: Registration with Existing User
    When user entered existing account details as below
      | Name          | Testing                |
      | Email         | tithitesting@gmail.com |
      | Password      | testing                |
      | PasswordAgain | testing                |
    And user clicks on verify email button
    Then user should receive displayed message as "Are you a returning customer?"
