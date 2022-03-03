Feature: Department
  @1 @smoke @regression
  Scenario: Add new Department
    Given URL should open successfully
    When User enters a valid email address
    And User enters correct password
    And User click Login button
    Then User should be able to login
    When User clicks department
    And  User clicks Add department
    And User enters unique Department Name
    And User click submit button
    Then User should be able to add a new department
 @2 @regression
  Scenario: User should be able to see all the department
    When User clicks department
    And  User clicks view Departments.
    Then User should be able to see all departments.
  @3 @regression
  Scenario: User should be able to search new department using search button on department screen.
    When User click search button and enter an existing department.
    Then Department should appear in search results.
  @4 @regression
  Scenario: User should be able to edit the name of the newly added department.
  When User clicks Edit button
  Then An edit prompt should appear.
  When User edits the name
  And User clicks submit button.
  Then User should be able to edit the name and a success message should appear.


  @5 @regression
  Scenario: User should be able to delete existing department.
    When User clicks department
    And  User clicks view Departments.
    And  User should be able to search edited department.
    When User clicks Delete button
    Then A Delete prompt should appear.
    When When user clicks delete button.
    Then The record should be deleted and success message should appear.


