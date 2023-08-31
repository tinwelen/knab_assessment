@UI
Feature: Create card from template pop up
  Repeating element (with or without top templates list step and back/close navigation header)

  Scenario: Select a template from top templates list

  Scenario: Return back from top templates list
    Given Someone clicks Create header button
    When They select "Start with a template" option
    Then They see top templates list pop up with navigation header
    When They click < back navigation button
    Then They see Create options list pop up

  Scenario: Successfully create board from template
    Given Someone clicks "Templates" header menu option
    When They select any template
    Then They see Create card from template pop up
    When They enter "Hey private template with cards" as board name
    And They set visibility as "Private"
    And They click Create button
    Then They see "Hey private template with cards" board page

  Scenario: Check required board name validation | negative
    Given Someone clicks "Templates" header menu option
    When They select any template
    Then They see Create card from template pop up
    When They empty board name input
    Then They see red error indication
    And They see error message "Board title is required"
    And They see Create button is disabled

  Scenario: Check paywall upgrade block "Only 10 open boards in Free Workspaces"

@UI
Feature: Where to find create board from template pop up
# Most steps for opening relevant pages can be found in OpenBoardUI.feature

  Scenario: Header template menu
    Given Someone clicks "Templates" header menu option
    When They select any template
    Then They see Create card from template pop up

  Scenario: "Create" header button -> Start with template -> any template

  Scenario: Create new board pop up -> Start with template -> any template

  Scenario: Workspace boards page
    Given Someone selects "Boards" option in left side menu
    And Current workspace block is shown
    When They click "Boards" workspace option
    Then They see workspace boards page
    And They see Most popular templates block
    When They select any template
    Then They see Create board from template button below header

  Scenario: Templates market -> any template -> "Use template" button

@UI
Feature: Where to find templates market

  Scenario: Header template menu -> "Explore more templates" button
  Scenario: "Create" header button -> Start with template -> "Explore more templates" button
  Scenario: Dashboard left side menu "Templates" option
  Scenario: Workspace boards page -> any template -> "Explore more templates" button

