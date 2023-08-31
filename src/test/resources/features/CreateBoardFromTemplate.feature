@ui
Feature: Create card from template pop up
  Repeating element (with or without top templates list step and back/close navigation header)
  # TODO

@ui
Feature: Where to find create board from template pop up
# Most steps for opening relevant pages can be found in OpenBoardUI.feature

  Scenario: Header template menu
    Given Someone clicks "Templates" header menu option
    When They select any template
    Then They see Create card from template pop up

  Scenario: "Create" header button -> Start with template -> any template

  Scenario: Workspace boards page
    Given Someone selects "Boards" option in left side menu
    And Current workspace block is shown
    When They click "Boards" workspace option
    Then They see workspace boards page
    And They see Most popular templates block
    When They select any template
    Then They see Create board from template button below header

  Scenario: Templates market -> any template -> "Use template" button

@ui
Feature: Where to find templates market

  Scenario: Header template menu -> "Explore more templates" button

  Scenario: "Create" header button -> Start with template -> "Explore more templates" button

  Scenario: Dashboard left side menu "Templates" option

  Scenario: Workspace boards page -> any template -> "Explore more templates" button

