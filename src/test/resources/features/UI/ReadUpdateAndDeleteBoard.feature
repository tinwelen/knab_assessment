@UI
Feature: Update board

  # Given Default board page is open
  Scenario: Rename board in board header
  Scenario: Paste image from buffer into board name input | negative
  Scenario: Star board in board header
  Scenario: Change visibility in board header
  Scenario: View customisation is hidden behind upgrade paywall | negative
  Scenario: Add an existing power-up in board header
  Scenario: Add a list by double click on empty board space
  Scenario: Change view in left side menu
  Scenario: Use keyboard shortcuts/navigation to open right menu (Tab, arrows, Enter, Esc)

  # Given Right board menu is open
  Scenario: Check "About this board" view
    When Someone clicks "About this board" menu option
    Then They see "About this board" view
    And They see navigation header
    And They see board admins list
    And They see collapsed description
    And They see Edit description button
    And They see member's permissions block
    When They click Edit description button
    Then They see text editor with description
    When They edit description and save it
    Then They see updated description
    And They see description expanded
    When They click Show less
    Then They see collapsed description

  Scenario: Check menu view is saved
    When Someone clicks "About this board" menu option
    And They click X close button
    And They open right side menu
    Then They see "About this board" view

  Scenario: Check "Activity" view
  Scenario: Check "Archived items" view

  Scenario: Successfully upload new background image
  Scenario: Upload several images at once and check that the last uploaded is selected by default
  Scenario: Drag-n-drop pdf into background view | negative
  Scenario: Upload 75MB image | negative

  Scenario: Check that custom fields editing is hidden behind upgrade paywall
  Scenario: Open Automations page
  Scenario: Open Power-Ups page

  Scenario: Check Labels view
    When Someone clicks "Labels" menu option
    Then They see "Labels" view
    And They see navigation header
    And They see search input
    And They see labels list
    And They see Create new label button
    And They see Colorblind mode button
    When They search "Green"
    Then They see labels with "Green" color or title in filtered labels list
    When They hover over label body
    Then They see color and title tooltip
    When They click Colorblind mode button
    Then They see labels bodies updated
    When They click label body/edit label icon
    Then They see label edit pop up

  Scenario: Check "Stickers" view
  Scenario: Check Email-to-Board pop up, Share pop up
  Scenario: Check Share pop up

@UI
Feature: Delete board

  Scenario: Close and delete board
    Given Board page is open
    When Someone opens board menu
    And They click "Close board" option
    And They confirm closing
    Then They see closed board page
    When They click Delete permanently
    And They confirm deleting
    Then They see delete confirmation page
    And They see dashboard page

  Scenario: Close board and delete it from All closed boards block on dashboard page

  Scenario: Close any board and delete it from a board page left side menu

  Scenario: Cancel closing the board
    Given Board page is open
    When Someone opens board menu
    And They click "Close board" option
    And They discard closing confirmation
    Then They see board page

  Scenario: Reopen the board
