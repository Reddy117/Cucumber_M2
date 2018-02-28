Feature: Add to kart
 
  @tag1
  Scenario: Add ruby to kart and verify
    Given go to website on browser
    And click on ruby image
    And Click on add to basket
    When I click on view basket
    Then ruby should be added basket

