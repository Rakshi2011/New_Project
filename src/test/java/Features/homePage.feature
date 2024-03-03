Feature: Verify Mobiles section functionality

  @Story_1 @Apr2024Release
  Scenario: Verify Mobiles section functionality
    Given Login to "Flipkart" Application
    When User open "Mobiles" page
    Then User validates page title as "Mobile Phones Online at Best Prices in India"
    When User open "Electronics" page
    When User open "Men" page
    When User open "Women" page
    When User close the Browser
