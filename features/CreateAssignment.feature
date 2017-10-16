Feature: Create Assignment Functionality
  			 As an Employer
  			 I should be able to save an Assignment as draft.

  Scenario Outline: Save to Draft
    Given I am logged in as an Employer with correct "<username>" and "<password>"
    When I click on Create Assignments
    And Fill the assignment Details
    And I save as Draft
    Then Assigment should be saved in drafts

    Examples: 
      | username            | password     |
      | qa+e@workmarket.com | w0rkmarket12 |
