Feature: As an authenticated User I want verify that Dog is present in List of Animals

  Background:

    Given User has valid "Client-ID" and valid "Client-Secret"
    When User submits a Token request

  @API-Regression-Test
  Scenario: Verify that Dog is part of a List of all animals at Petfinder
    Then A token is received by User successfully
    When User sends a get request to Petfinder site
    Then a List of animal types is returned successfully
    Then verify that "Dog" is part of the List retrieved

