Feature: Role
  @1 @smoke @regression
  Scenario: User Should be able to create new roles.
    Given URL should open successfully
    When User enters a valid email address
    And User enters correct password
    And User click Login button
    Then User should be able to login
    When User clicks on Roles.
    And  User clicks on Add Roles button.
    Then Add Role page should open.
    And User enters role name.
    And User Chooses permissions.
    And User clicks submit.
  @2 @regression @smoke
  Scenario: User should be able to search the newly added role.
    When User clicks on Roles.
    And  User clicks on View Roles button.
    And User enter the newly added role name in search box.
    Then User should be able to search role.

  @3 @regression @smoke
  Scenario: When user clicks on Create button from view roles, it should redirects to Add Role page.
    When User clicks on Roles.
    And  User clicks on View Roles button.
    And User clicks on Create button.
    Then User should be redirected to Create Role Page.
    Then Close the browser.
