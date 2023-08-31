@ui @automated
Feature: Open the default board

  Scenario: Login
    When Someone opens login page
    And They enter their email
    And They click continue
    And They enter their password
    And They click login
    Then They see dashboard page

  Scenario: Open board
    Given Someone is logged in
    When They click default board tile
    Then They see default board screen