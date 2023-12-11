Feature: Is it Friday yet?

  Scenario: Is it Friday on Sunday
    Given today is sunday
    When I ask if it is friday
    Then I should be told "No"