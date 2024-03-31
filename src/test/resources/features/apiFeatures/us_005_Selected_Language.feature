@API

Feature: TE of US_005 As a user i should be able to GET chosen language via API by using the uniquePoints for each different Language
  preference and verifying success true

  Scenario: TC_001 US_005 User should be able to send GET Request via API according to:selected Language end point and should expect to get success true

    Given user verifies English language "https://test.hypnotes.net/_next/data/hlwOUMqUoGOBUVM5dkoJx/en.json"
    Then user verifies Turkish language "https://test.hypnotes.net/_next/data/hlwOUMqUoGOBUVM5dkoJx/tr.json"
    And user verifies German language "https://test.hypnotes.net/_next/data/hlwOUMqUoGOBUVM5dkoJx/de.json"
    Then user verifies French language "https://test.hypnotes.net/_next/data/hlwOUMqUoGOBUVM5dkoJx/fr.json"
    And user verifies Russian language "https://test.hypnotes.net/_next/data/hlwOUMqUoGOBUVM5dkoJx/ru.json"
    Then user verifies Spanish language "https://test.hypnotes.net/_next/data/hlwOUMqUoGOBUVM5dkoJx/es.json"
