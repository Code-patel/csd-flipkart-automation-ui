Feature: Verify Flipkart Item Search Functionality

  Scenario: Search mobile item and verify listed mobiles with filter by price
    Given Navigate to flipkart
    And Search item "vivo mobile"
    And Filter by price as min 10000 and max 20000
    Then Verify filtered price is between min 10000 and max 20000

  Scenario: Search jeans item and verify listed jeans with filter by color
    Given Navigate to flipkart
    And Search item "jeans for men"
    And Filter by color as "Blue"
    And Open first item from listed view
    Then Verify filtered jeans color is "Blue"