Feature: As a User I want to search a Golden Retriever on Petfinder and confirm at least more than one

  Background:
    Given User has valid "Client-ID" and valid "Client-Secret"
    When User submits a Token request

  @API-Regression-Test
  Scenario: Search Petfinder for Golden Retriever and confirm at least more than one
    Then A token is received by User successfully
    When User sends a request to get all "dog" breeds
    Then A list of all "dog" breeds is received successfully
    Then User searchs for "Golden Retriever" from the  List and verify if there is at least 1 from search results


