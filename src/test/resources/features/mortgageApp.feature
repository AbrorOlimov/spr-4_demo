Feature: User fills fields in Mortgage Application

  Scenario: User fills fields preapproval details section with valid data
    Given The user is in preapproval details page
    When user enter valid details to all fields and presses next button
    Then the page should switch to personal information section

  Scenario: User fills fields personal information section with valid data
    Given The user is in personal information page
    When user enter valid details to all personal information fields and presses next button
    Then the page should switch to expenses section

  Scenario: User fills fields expenses section with valid data
    Given The user is in expenses page
    When user enter valid expenses details to all fields and presses next button
    Then the page should switch to employment and income section

  Scenario: User fills fields employment and income section with valid data
    Given The user is in employment and income page
    When user enter valid employment and income details to all fields and presses next button
    Then the page should switch to credit report section

  Scenario: User fills fields in credit report section with valid data
    Given The user is in credit report page
    When user enter valid credit report details to all fields and presses next button
    Then the page should switch to e-consent section

  Scenario: User fills fields in e-consent section with valid data
    Given The user is in e-consent page
    When user enter valid details to all e-consent fields and presses next button
    Then the page should switch to summary section

  Scenario: User fills fields in summary section with valid data
    Given The user is in summary page
    When user enter valid details to all summary fields and presses save button
    Then the page should switch to mortgage application main page