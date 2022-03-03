Feature: Dashboard
  @1 @smoke @regression
  Scenario: After a successful login, user should be able to see the dashboard.
    Given URL should open successfully
    When User enters a valid email address
    And User enters correct password
    And User click Login button
    Then User should be able to login
    Then Verify Dashboard and student text on dashboard.
    When User clicks on view more from Courses.
    Then User should be redirected to View Courses Tab.
    When User clicks on view more from categories.
    Then User should be redirected to View Categories.
    When User clicks on View more from Teachers Tab.
    Then User should be redirected to View Teachers Page.
    Then Close the browser.