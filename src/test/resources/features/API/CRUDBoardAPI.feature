@API
Feature: Create board via API

  Scenario: POST board with required "Name" parameter

  Scenario: POST board with different type params

@API
Feature: Get board via API

  Scenario: GET board
    Given Board with name "Test board" is created
    When GET board
    Then Board details are shown successfully

  Scenario: GET Cards on a Board

  Scenario: GET Lists on a Board

  Scenario: GET the Members of a Board

@API
Feature: Update board via API

  Scenario: PUT Update a Board with empty payload | negative
    When Someone sends valid PUT request with "" as String valued query params
    Then They see no board changes

  Scenario: PUT Update board name

  Scenario: PUT Update parameter available for paid account by free credentials

  Scenario: POST Create a List on a Board

  Scenario: PUT Add a Member to a Board

  Scenario: DELETE Remove Member from Board

  Scenario: POST Mark Board as viewed

@API
Feature: Delete board via API

  Scenario: Successfully DELETE board
    Given Board with name "For deletion" is created
    When DELETE board
    And GET current user's board list
    Then Check the board is deleted successfully
