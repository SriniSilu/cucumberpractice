
Feature: Testing ScenarioOutline concepts

  Scenario Outline: Passing three variables
    Given First "<name>"
    When second "<value>" in step
    Then I verify the "<status>" in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |   7.5 | Fail    |
