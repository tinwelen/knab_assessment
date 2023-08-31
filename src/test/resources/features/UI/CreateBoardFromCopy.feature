@UI
Feature: Create a new board from existing board page

  Background:
    Given Board page is open
    And Someone clicks board menu button

  Scenario: Make board template is hidden behind upgrade paywall

  Scenario: Successfully create a board copy without cards
    Given Someone clicks Copy board menu option
    When They enter "New board without cards" as board name
    And They uncheck "Keep cards" checkbox
    And They uncheck "Keep template cards" checkbox
    And They click Create button
    Then They see "New board without cards" board page
    And They see no cards

  Scenario: Successfully create a board copy with cards and templates

  Scenario: Create button is disabled | negative
    Given Someone clicks Copy board menu option
    When They leave title input empty
    Then They see that Create button is disabled
    When They click disabled Create button
    Then They see that view remains the same

  Scenario: Cancel copying | negative
    Given Someone clicks Copy board menu option
    When They click X close button
    Then They see no Copy pop up
    And They see no Create board request
