@api
Feature: Get board via API

  Scenario: Get board
    Given Board with name "Test board" is created
    When GET board
    Then Board details are shown successfully
