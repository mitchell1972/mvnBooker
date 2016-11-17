Feature: Test to create an entry

  Scenario: Create entry

    Given the user has logged into the hotel management platform
    When the following are entered:
      | Hotel Name   | Hilton       |
      | Address      | 2 Penge Road |
      | Owner        | me           |
      | Phone Number | 07942360548  |
      | Email        | me@you.co.uk |
    And the create button is clicked
    Then the page is update with the new entry