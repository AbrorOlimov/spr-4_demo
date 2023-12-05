Feature: User logs in with valid credentials

  Scenario: Login with valid email and password
    Given The user is in login page
    When User fills email and password fields
    And presses sign in button
    Then user should be navigated to the mortgage application page
