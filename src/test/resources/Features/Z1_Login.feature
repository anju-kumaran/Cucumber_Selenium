Feature: Feature to test the login functionality of Zero Banking Application

  Scenario: Check signin button exists on Home Page of Application
    Given User launch the browser
    When User open the Zero Banking Application
    Then Signin button should be displayed

  Scenario: Login successful with valid credentials
    Given User launch a browser
    And Click signin button on home page of application
    When User enter the '<usr>' and '<pwd>'
    And click Signin button
    Then User should be redirected to the home page of user

    
    Examples:
    |usr			|pwd			|
    |username	|password	|
    