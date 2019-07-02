@tag
Feature: As a user want to login  in the applcation

  @tag1
  Scenario: To test login scenario
    Given Application is up and running
    When I enter valid credential
    Then I should bo login sucscessfully
