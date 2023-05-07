@PROFILE
Feature: Profile

  Scenario Outline: Trying to add certification, hobbies and skill
    Given The user enters the application and displays the profile section
      | user    | password |
      | <email> | <pass>   |
    When The user add certification hobbies and skills
      | certification    | hobbies   | skills   |
      | <certifications> | <hobbies> | <skills> |
    Then The user verify his <certifications>, <hobbies> and <skills>
    Examples:
      | email                        | pass   | certifications | hobbies         | skills |
      | dorthy.moehle@perficient.com | 123456 | ISTQB          | Michael Jackson | Appium |