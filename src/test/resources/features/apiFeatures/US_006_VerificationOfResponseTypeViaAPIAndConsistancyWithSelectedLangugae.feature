@API
  Feature: Verification of response Type and consistency with selected Language via API
    Scenario: User selects a language and retrieves data
      Given the user has selected a language via API
      When the user makes a request to retrieve data
      Then the response body type should be application/json
      And the data returned in the response should be consistent with the language chosen by the user