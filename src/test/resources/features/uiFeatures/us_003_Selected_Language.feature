@UI

Feature: TE of US_003 After each Language selected from the dropDown Menue for Languages, a new page should appear

  Scenario: TC_001 US_003 Each language selection should lead to a different page or version of the content tailored to that language.

    Given user goes to homepage
    Then user click to languages menu
    And user verifies selected the English language
    Then user verifies selected the Turkish language
    And user verifies selected the German language
    Then user verifies selected the French language
    And user verifies selected the Russian language
    Then user verifies selected the Spanish language
    And user verifies selected following language
      | https://test.hypnotes.net/   |
      | https://test.hypnotes.net/tr |
      | https://test.hypnotes.net/de |
      | https://test.hypnotes.net/fr |
      | https://test.hypnotes.net/ru |
      | https://test.hypnotes.net/es |


