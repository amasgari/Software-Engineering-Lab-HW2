@tag
Feature: Calculator

Scenario: sqrt_div two numbers
  Given Two integers 8 and 2
  When I divide and sqrt the two values
  Then I expect the answer 2.0

Scenario Outline: sqrt_div two numbers
  Given Two integers <first> and <second>
  When I divide and sqrt the two values
  Then I expect the answer <result>

Examples:
  | first | second | result |
  | 4     | 1     | 2.0     |
  | 36    | 4      | 3.0      |
  | 5    | 2      | 1.58      |