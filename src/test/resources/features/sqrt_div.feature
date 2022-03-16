@tag
Feature: Calculator

Scenario: sqrt_div two numbers
  Given Two input values, 8 and 2
  When I divide and sqrt the two values
  Then I expect the result 2

Scenario Outline: sqrt_div two numbers
  Given Two input values, <first> and <second>
  When I divide and sqrt the two values
  Then I expect the result <result>

Examples:
  | first | second | result |
  | 4     | 1     | 2     |
  | 36    | 4      | 3      |