Feature: Course
  @1 @smoke @regression
  Scenario: Add new course.
    Given URL should open successfully
    When User enters a valid email address
    And User enters correct password
    And User click Login button
    Then User should be able to login
    When User Clicks on Course tab.
    And User clicks on Add new course tab.
    When User enters courses name.
    And User enters course short name.
    And User chooses course categories.
    And User chooses Visibility.
    And User chooses start date.
    And User chooses end date before start date.
    And User clicks submit.
    Then An error message should display.
    When User chooses a valid end date.
    And click submit button.
    Then Record should be added successfully.

  @2 @smoke @regression
  Scenario: User should be able to edit newly added courses
      When User edits short name.
      And user clicks submit button.
      Then User should be able to edit course successfully.

  @3 @smoke @regression
  Scenario: User should be able to Search.
    When User Clicks on Course tab.
    And User clicks on View Course tab.
    Then Search Course page should open.
    When User searches the course name.
    Then Searched Course should appear in the results.

  @4 @smoke @regression
    Scenario: Verify participants, Manage content and Edit links should be working.
    When User clicks on Participants.
    Then Search Course participant page should appear.
    When User Click on manage content button.
    Then Manage Course Content page should appear.
    When User clicks on edit button.
    Then Edit course page should appear.

  @5 @smoke @regression
    Scenario: User should be able to delete a course.
    When User Clicks on Delete button.
    Then A delete prompt should appear for confirmation.
    When User Press delete button again.
    Then Course should be deleted.

#Manage Course Content.


#Course Categories Test Cases
  @c1 @regression @cc
  Scenario: Add new Course Categories.
    Given URL should open successfully
    When User enters a valid email address
    And User enters correct password
    And User click Login button
    Then User should be able to login
    When User clicks Course Categories.
    And  User clicks Add new Category.
    And User enters category name.
    And User adds description.
    And User adds an image.
    And User clicks on Submit button.
    Then Update course category page should open.
  @c2 @regression @cc
  Scenario: User should be able to see all categories.
    When User clicks Course Categories.
    And  User clicks view Categories.
    Then User should be able to see all new categories.
  @c3 @regression @cc
  Scenario: User should be able to search newly added category using search button on category screen.
    When User click search button and enter an existing course category.
    Then Newly added Category should appear in search results.
  @4 @regression @cc
  Scenario: User should be able to edit the name of the newly added category.
    When User clicks Edit button on course category.
    Then An edit page will appear.
    When User edits the name, Description and Image.
    And ser clicks on Submit button.
    Then User should be able to edit the details and a success message should appear.


  @5 @regression @cc
  Scenario: User should be able to delete existing category.
    When User clicks Course Categories.
    And  User clicks view Categories.
    Then User should be able to see all new categories.
    And  User should be able to search edited Category.
    When User clicks on Delete button
    Then A Category Delete prompt should appear.
    When When user clicks delete category.
    Then The category should be deleted and success message should appear.

