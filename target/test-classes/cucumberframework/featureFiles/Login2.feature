Feature: Login to the Stackoverflow website2
	I want to use this template to validate the credentials of an existing user

  Scenario: Login to the Stackoverflow website with valid credentials2
    Given User navigates to the Stackoverflow website2
    And User clicks on Login button2
    And User enters valid username2
    And User enters valid password2
    When User clicks on the Submit2
    Then User is taken to home page successfully2
    