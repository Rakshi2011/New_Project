Feature: Verify Mobiles section functionality

  @Story_1 @Apr2024Release
  Scenario: Verify Mobiles section functionality
    Given Login to "Flipkart" Application
    When User open "Mobiles" page
    Then User validates page title as "Mobile Phones Online at Best Prices in India"
    When User close the Browser
