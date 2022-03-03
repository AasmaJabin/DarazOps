Feature: Teachers
  @1 @smoke @regression
  Scenario: User should be able to add a teacher when all the mandatory fields are filled with valid values.
    Given URL should open successfully
    When User enters a valid email address
    And User enters correct password
    And User click Login button
    Then User should be able to login
    When User clicks on Teachers.
    And  User clicks on Add Teacher button.
    Then Add Teacher page should open.
    When User enters Employee ID
    And User enters First Name
    And User enters Last Name
    And User enters Username.
    And User enters a valid email.
    And User selects Venture from dropdown.
    And User selects role.
    And User clicks Submit Button
    Then User should be able to add a Teacher.
    And User should be redirected to Update Teacher Page.


  @2 @smoke @regression
  Scenario: User should be able to edit new added Teacher details.
    When User modifies Employee ID.
    And User modifies First Name
    And User modifies Last Name
    And User clicks Submit Button..
    Then User should be able to modify teacher details.

  @3 @smoke @regression
  Scenario: When user clicks on edit button from View teachers, user should be redirected to Update student page.
    When User clicks on Teachers.
    And  User clicks on View Teachers button.
    When User enters Employee ID.
    And  User enters Username.
    And User click search Button
    When User clicks edit from search.
    Then User should be redirected to Update Teachers page.

  @4 @smoke @regression
  Scenario: User should be able to search and delete updated teacher record.
    When Click on delete button of searched record.
    And Delete dialog box opens.
    And User clicks Delete.
    Then Record should be deleted successfully.

  @5 @smoke @regression
  Scenario: Verify Upload Teacher Function.
    When User clicks on Teachers.
    And  User clicks on Upload Teacher button.
    And  Send CSV file for teachers.
    Then Verify the Success message for upload teachers.
    Then Close the browser.

