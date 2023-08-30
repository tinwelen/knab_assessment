@automated
Feature: Create a new board

  Background:
    Given Someone is logged in

  Scenario: Someone creates board from a header templates menu
    When They click "Templates" header option
    And They select "Kanban Template"
# ...
    When They click submit board from header template button

    Then They see "" board page