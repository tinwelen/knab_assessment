@API @automated
Feature: Board API CR(U)D automation

  Scenario: Create a new board and check it's name
    Given POST new board "abc123"
    Then Board name is sent correctly
    When GET board
    And New board name is shown correctly
    Then DELETE board
