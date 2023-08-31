@UI @automated
Feature: Open the default board

  Scenario: Login
    When Someone opens login page
    And They enter their email
    And They click continue
    And They enter their password
    And They click login
    Then They see dashboard page
