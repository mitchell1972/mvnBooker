Feature: Test to delete an entry

  Scenario: delete entry

    Given the user has logged into the hotel management platform
    And All created entry are displayed
    When X associated with a particular is clicked
    Then the entry is deleted