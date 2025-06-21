Feature: As an authenticated User I want to get List of all animal types

  Background:

    Given User has valid "Client-ID" and valid "Client-Secret"
    When User submits a Token request

  @API-Regression-Test
  Scenario: Get the list of all animals at Petfinder
    Then A token is received by User successfully
    When User sends a get request to Petfinder site
    Then a List of animal types is returned successfully