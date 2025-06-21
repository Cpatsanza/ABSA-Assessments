Feature: As a User I want to get all dog breeds on Petfinder

  Background:
    Given User has valid "Client-ID" and valid "Client-Secret"
    When User submits a Token request

  @API-Regression-Test
  Scenario: Get the all dog breeds on Petfinder
    Then A token is received by User successfully
    When User sends a request to get all "dog" breeds
    Then A list of all "dog" breeds is received successfully
