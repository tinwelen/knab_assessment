@UI
Feature: New board creation pop up
  Repeating element for board creation

  # Successful and negative cases are really similar to the creation from a template flow,
  # will not copy those (CreateBoardFromTemplate.feature)

  Scenario: Select board background
    When Someone clicks background in fast access panel
    Then They see board preview background change

  Scenario: Cancel selecting board background | negative
    When Someone clicks ... button in fast access panel
    Then They see "Board background" pop up
    When They click See more button in Photo block
    Then They see "Photos from Unsplash" pop up
    And They see pop up navigation header
    When They click < back navigation button
    And They close "Board background" pop up
    Then They see no board preview background changes

# This is where i got extremely lazy to copy all the same steps as in OpenBoardUI.feature
@UI
Feature: Where to find board creation pop up

  Scenario: "Create" header button -> Create board option (pop up opens with < back navigation button)
  Scenario: Current workspace block on Boards menu option page -> "Create new board" tile
  Scenario: Workspace boards page -> "Create new board" tile
  Scenario: Home menu option page -> "Create a board" plus button
  Scenario: Workspace boards home page -> "Create new board" tile
  Scenario: Workspace boards highlights page -> "Create a workspace board" plus button
