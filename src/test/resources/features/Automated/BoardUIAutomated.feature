@UI @automated
Feature: Create a new board

  Background:
    Given Someone is logged in

  Scenario: Open board
    When They open "default" board
    Then They see "default" board page

  Scenario: Someone creates board from a templates side menu option
    When They click Templates side menu option
    And They select "Kanban Template" as a template
    And They click Use template button
    And They enter "Wow such kanban" as board name
    Then They click submit board from header template button
    And They see "Wow such kanban" board page
