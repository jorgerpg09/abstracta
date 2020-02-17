Feature: Web automation to open ML page and search for 'autos' and save results

  Scenario: Open ML, search for 'autos' and save search results
    Given I open "https://www.mercadolibre.com.uy"
    And I search "autos"
    Then I see results
    And I save results