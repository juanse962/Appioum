@HOME
Feature: Home

  Scenario Outline: The user enters the Home page of the application and verifies birthday or event announcements
    Given The user enters the application and displays the profile section
      | user    | password |
      | <email> | <pass>   |
    When The user enters the Home page of the application
    Then The user checks the application for birthdays, announcements and events
    Examples:
      | email                        | pass   |
      | dorthy.moehle@perficient.com | 123456 |