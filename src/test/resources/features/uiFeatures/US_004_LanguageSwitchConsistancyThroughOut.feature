@UI @US_004
  Feature: Persistance of the Laguage switch throughout the websight

  Scenario: verifying the user selecting a spesific Language from the dropDown
    Given user goes to home page
    And user clicks on the Language dropdown menu located on homePage navBar
    When user selects the turkish Language from the dropDown
    Then the previous pages changes to a different page specific to the turkish Language
    And the page content swiches into the selected Language

    Scenario: Verify language switch functionality on homepage
      Given user goes to home page
      And user clicks on the Language dropdown menu located on homePage navBar
      When user switches to another Language from the dropDown "Spanish"
     Then the language switch should occur by directing the user to a different page

    Scenario:   Verify language switch functionality on different pages
      Given user goes to home page
      And user clicks on the Pricing section located on navBar
      And user clicks on the Language dropdown menu located on homePage navBar
      When user selects the turkish Language from the dropDown
      Then the Pricing details for Compare plans on the page should change into Turkish Language



