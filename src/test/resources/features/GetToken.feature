Feature: As an authenticated user I want to fetch token


  @API-Regression-Test
  Scenario: Fetch token with valid authentication
   Given User has valid "Client-ID" and valid "Client-Secret"
    When User submits a Token request
    Then A token is received by User successfully