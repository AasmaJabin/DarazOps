Feature: Students
  @1 @smoke @regression @test
  Scenario: User should be able to add a student when all the mandatory fields are filled with valid values.
    Given URL should open successfully
    When User enters a valid email address
    And User enters correct password
    And User click Login button
    Then User should be able to login
    When User clicks on Students.
    And  User clicks on Add Student button.
    Then Add student page should open.
    When User enters employee id
    And User enters WFM id.
    And User enters First Name.
    And User enters Last Name.
    And User enters User name.
    And User enters a valid password.
    And User selects Venture.
    And User selects Department.
    And User clicks Submit Button.
    Then User should be able to add a student.
    And User gets redirected to Update student Page.


  @2 @smoke @regression @test
   Scenario: User should be able to edit new added student details.
    When User modifies employee id.
    And User modifies WFM id.
    And User modifies First Name.
    And User modifies Last Name.
    And User modifies User name.
    And User modifies Venture.
    And User modifies Department.
    And User click Set Password.
    Then User should be redirected to Set Password Screen.
    And User enters an invalid password.
    And confirms the password.
    Then An error related to password length message should appear.
    And User enters password of equal to or more than 8 characters.
    And User clicks Update Button again.
    And User clicks Submit Button again.
    Then User should be able to modify student details.

  @3 @smoke @regression
  Scenario: When user clicks on edit button from View students, user should be redirected to Update student page.
    When User clicks on Students.
    And  User clicks on View Student button.
    When User enters Employee id.
    And  User enters WFM id
    And  User enters User Name.
    And User selects Venture
    And User select Department.
    And User click search button.
    Then User should be able to search the record.
    When User clicks edit.
    Then User should be redirected to Update student page.

  @4 @smoke @regression
  Scenario: User should be able to search and delete newly added record.
    When User clicks on Students.
    And  User clicks on View Student button.
    When User enters Employee id.
    And  User enters WFM id
    And  User enters User Name.
    And User selects Venture
    And User select Department.
    And User click search button.
    Then User should be able to search the record.
    When User clicks delete.
    Then A prompt should appear asking for confirmation.
    When User clicks delete again.
    Then Record should be deleted successfully.

  @5 @smoke @regression
   Scenario: user should not be able to add student when password is less then 8 characters.
    When User clicks on Students.
    And  User clicks on Add Student button.
    Then Add student page should open.
    When User enters employee id
    And User enters WFM id.
    And User enters First Name.
    And User enters Last Name.
    And User enters User name.
    And User enters password less then 8 characters.
    And User selects Venture.
    And User selects Department.
    And User clicks Submit Button.
    Then User should get an error message.

  @6 @smoke @regression
  Scenario: Verify Upload Student Function.
    When User clicks on Students.
    And  User clicks on Upload Student button.
    And  Send CSV file.
    Then Verify the Success message.
    Then Close the browser.