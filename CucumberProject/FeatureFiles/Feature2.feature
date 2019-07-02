
@tag
Feature: I want to test login feature with multiple data sets
 
  @tag2
  Scenario Outline: to test log in with invalid credintials
    Given Application is up and running
    When I enter <username> and <password> on login page
    Then Error message should display

    Examples: 
      | username | password |   
      | mercury  | mercury  |  
      | mercury2 | mercury2 | 
