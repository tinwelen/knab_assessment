@UI
Feature: Open a board
  All the possible ways to open an existing board, starting from the dashboard (https://trello.com)

  Background:
    Given Dashboard page is open
    And Default board is created
    And Second board is created

  Scenario: Recent menu in header
  Scenario: Starred menu in header

  Scenario: Find a board from header search
    When Someone clicks search input
    Then They see search input size adjusted
    When They enter default board name
    Then They see default board in boards list
    When they click View all results link
    Then They see advanced search page
    And They see search term in search input
    And They see default board in boards list

  Scenario: Recent boards list in focused search input dropdown
  Scenario: Recent boards list on Advanced search page

  Scenario: "Recently viewed" block on Boards menu option page
    Given Someone selects "Boards" option in left side menu
    And "Recently viewed" block is shown
    When They click first board in block
    Then They see board page

  Scenario: "Starred boards" block on Boards menu option page
  Scenario: Current workspace block on Boards menu option page

  Scenario: Workspace boards page
    Given Someone selects "Boards" option in left side menu
    And Current workspace block is shown
    When They click "Boards" workspace option
    Then They see workspace boards page
    And They see sort, filter and  search options
    When They click first board in block
    Then They see board page


  Scenario: "View all closed boards" on Boards menu option page
    Given Someone selects "Boards" option in left side menu
    And View all closed boards button is shown
    When They click View all closed boards button
    Then They see closed boards list
    When They click "Reopen" button for first board
    And They confirm board reopening
    Then They see dashboard Boards menu page
    When They click reopened board
    Then They see board page

  Scenario: "Up next" block on Home menu option page
    Given Due date is created for card in default board
    When Someone selects "Home" option in left side menu
    Then They see activity block
    When They click board link in card preview
    Then They see board page

  Scenario: "Recently viewed" block on Home menu option page
  Scenario: "Starred" block on Home menu option page

  Scenario: "Your boards" block on Workspace boards home page
    When Someone selects current workspace / Boards option in left side menu
    Then They see workspace boards home page
    And They see "Your boards" block
    When They click first board in block
    Then They see board page

  Scenario: "Starred boards" block on Workspace boards home page

  Scenario: "Starred" block on workspace highlights menu option page
    Given Someone selects workspace / Highlights option in left side menu
    And "Starred" block is shown
    When They click first board in block
    Then They see board page

  Scenario: "Recently viewed" block on workspace highlights menu option page
  Scenario: "Up next" block on workspace highlights menu option page

  Scenario: Open workspace / boards page from a board page
    Given Someone selects "Boards" option in left side menu
    And They see workspace boards block
    When They click first board in block
    Then They see board page
    And They see left side menu collapsed
    When They expand left side menu
    And They click "Boards" option
    Then They see workspace boards page with a board side menu
    When They click first board in block
    Then They see board page

  Scenario: Open a board from left side menu on another board page

  Scenario: Open the same board from left side menu on a board page | negative
    Given Someone selects "Boards" option in left side menu
    And They see workspace boards block
    When They click first board in block
    Then They see board page
    And They see left side menu collapsed
    When They expand left side menu
    And They see "Your boards" list
    And They click same board in list
    Then They see same board page open
    And They see no Open network request sent

  Scenario: Open a board by existing direct link

  Scenario: Open a board by non-existent direct link | negative
    Then Someone sees 404 Taco page
