Feature: Verify Flipkart Login Functionality

  Scenario: Verify login with by mobile number with invalid format
    Given Navigate to flipkart
    And Click on Login button
    When Fill username as "4343"
    And Click on Request OTP button
    Then Verify validation error message

  Scenario: Verify login with submitting username as empty
    Given Navigate to flipkart
    And Click on Login button
    When Fill username as ""
    And Click on Request OTP button
    Then Verify validation error message

  Scenario: Verify login by email with invalid format
    Given Navigate to flipkart
    And Click on Login button
    When Fill username as "test@"
    And Click on Request OTP button
    Then Verify validation error message

  Scenario: Verify login by email with special chars only
    Given Navigate to flipkart
    And Click on Login button
    When Fill username as "%!@$%^*"
    And Click on Request OTP button
    Then Verify validation error message

  Scenario: Verify login by valid email and verify OTP page
    Given Navigate to flipkart
    And Click on Login button
    When Fill username as "test@gmail.com"
    And Click on Request OTP button
    Then Verify is visible submit OTP screen
    When Copy OTP and Submit manually
    Then Verify Dashboard page after login

  Scenario: Verify login by valid mobile number and verify OTP page
    Given Navigate to flipkart
    And Click on Login button
    When Fill username as "9987876565"
    And Click on Request OTP button
    Then Verify is visible submit OTP screen
    When Copy OTP and Submit manually
    Then Verify Dashboard page after login