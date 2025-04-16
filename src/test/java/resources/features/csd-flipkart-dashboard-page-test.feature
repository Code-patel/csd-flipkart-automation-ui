Feature: Verify Flipkart Dashboard items

  Scenario: Verify Header Section
    When Navigate to flipkart
    Then Verify logo in header section
    And Verify product search box in header section
    And Verify Login menu in header section
    And Verify Cart icon in header section
    And Verify Become A Seller menu in header section
    And Verify Others menu in header section

  Scenario: Verify Footer Section
    When Navigate to flipkart
    Then Verify menu "ABOUT" and sub menu "Contact Us" in footer section
    And Verify menu "ABOUT" and sub menu "About Us" in footer section
    And Verify menu "ABOUT" and sub menu "Careers" in footer section
    And Verify menu "ABOUT" and sub menu "Flipkart Stories" in footer section
    And Verify menu "ABOUT" and sub menu "Press" in footer section
    And Verify menu "ABOUT" and sub menu "Corporate Information" in footer section

    And Verify menu "GROUP COMPANIES" and sub menu "Myntra" in footer section
    And Verify menu "GROUP COMPANIES" and sub menu "Cleartrip" in footer section
    And Verify menu "GROUP COMPANIES" and sub menu "Shopsy" in footer section

    And Verify menu "HELP" and sub menu "Payments" in footer section
    And Verify menu "HELP" and sub menu "Shipping" in footer section
    And Verify menu "HELP" and sub menu "Cancellation & Returns" in footer section
    And Verify menu "HELP" and sub menu "FAQ" in footer section

    And Verify menu "CONSUMER POLICY" and sub menu "Cancellation & Returns" in footer section
    And Verify menu "CONSUMER POLICY" and sub menu "Terms Of Use" in footer section
    And Verify menu "CONSUMER POLICY" and sub menu "Security" in footer section
    And Verify menu "CONSUMER POLICY" and sub menu "Privacy" in footer section
    And Verify menu "CONSUMER POLICY" and sub menu "Sitemap" in footer section
    And Verify menu "CONSUMER POLICY" and sub menu "Grievance Redressal" in footer section
    And Verify menu "CONSUMER POLICY" and sub menu "EPR Compliance" in footer section

    And Verify Mail Us Address in footer section
    And Verify Social Icons "Facebook" in footer section
    And Verify Social Icons "Twitter" in footer section
    And Verify Social Icons "YouTube" in footer section
    And Verify Social Icons "Instagram" in footer section

    And Verify Registered Office Address in footer section
    And Verify Become A Seller menu in footer section
    And Verify Advertise in footer section
    And Verify Gift Cards in footer section
    And Verify Help Center in footer section

  Scenario: Verify Flight Booking section on dashboard
    When Navigate to flipkart
    Then Verify Flight Booking menu is visible
    And Click on Flight Booking menu
    And Verify Flight Booking navigation page

  Scenario: Verify Two Wheeler section on dashboard3
    When Navigate to flipkart
    Then Verify Two Wheeler menu is visible
    And Click on Two Wheeler sub menu "Petrol Vehicles"
    And Verify Two Wheeler navigation page


