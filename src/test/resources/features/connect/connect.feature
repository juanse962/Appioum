@CONNECT
Feature: Connect

  Scenario Outline: The user enters the Connect page of the application and verifies the Connect page is already loaded and today's birthdays are announced.
    Given The user enters the application and displays the profile section
      | user    | password |
      | <email> | <pass>   |
    When The user enters the Connect page of the application
    Then The user checks the "Connect" page and today's birthdays are announced
    Examples:
      | email                        | pass   |
      | dorthy.moehle@perficient.com | 123456 |