@Smoke
Feature: Signin to the Amazon Webpage

  Background: 
    Given User is already on the homepage of Amazon Website
    When user clicks on Hello, Sign in option

  @Smoke @Regression
  Scenario: User enter valid SignIn details
    Then user enter valid email "tithitesting@gmail.com" and password "testing"
    And user should be able to login successfully
	@Regression
  Scenario: User enter valid username and invalid password
    Then user enter valid email "tithitesting@gmail.com" and invalid password "TesTing"
    And user to receive error message to enter valid password
	 @Smoke
  Scenario: User enter blank username
    Then user click on continue without entering username
    And user should receive error to enter username
