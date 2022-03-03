Feature: Login
  @1 @smoke
  Scenario: User should be able to login with valid credentials
  Given URL should open successfully
   When User enters a valid email address
   And User enters correct password
   And User click Login button
   Then User should be able to login
    Then Close the browser.



  @2 @smoke
  Scenario: Provide invalid credential and verify error message
    Given URL should open successfully
    When User enters a invalid email address
    And User enters correct password
    And User click Login button
    Then An error message should appear.
    Then Close the browser.
  @3 @smoke
  Scenario: Provide invalid credential and verify error message
    Given URL should open successfully
    When User enters a valid email address
    And User enters incorrect password
    And User click Login button
    Then An error message should appear.
    Then Close the browser.
  @4 @smoke
  Scenario: User should be able to reset password using valid email address.
    Given URL should open successfully
    When User clicks FORGOT PASSWORD option.
    Then Enter Email address text box should appear.
    When User enters valid email address
    And  press send send password reset link.
    Then User should be able to send reset Link.
    And User opens email box and clicks reset link.
    And User click reset password button.
    Then Reset password page should open.
    And User enter new password.
    And User confirms new password.
    And user clicks Reset button.
    Then user should be able to login successfully.
    Then Close the browser.

  @5 @smoke
  Scenario: Verify forgot password with invalid email address.
    Given URL should open successfully
    When User clicks FORGOT PASSWORD option.
    Then Enter Email address text box should appear.
    When User enters invalid email address
    And  press send send password reset link.
    Then An invalid email error message should appear.
    Then Close the browser.

@6 @smoke
  Scenario: Verify the logout functionality.
  Given URL should open successfully
  When User enters a valid email address
  And User enters correct password
  And User click Login button
  Then User should be able to login
  When User Clicks user name on top right corner of dashboard.
  And User clicks on Logout Button

  @7 @smoke
  Scenario: Verify the logout functionality.
    Given URL should open successfully
    When User enters a valid email address
    And User enters correct password
    And User click Login button
    Then User should be able to login