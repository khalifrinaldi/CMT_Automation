Feature: Gabung Cermati

  Scenario: Register Account on Cermati Website
    Given Open website "https://www.cermati.com/gabung"
    And On Register page user fill email "testing2019@gmail.com"
    Then On Register page user fill password "abcd12345678"
    And On Register page user fill First name "Testing"
    Then On Register page user fill Last name "Register"
    And On Register page user fill Phone Number "08123456789"
    Then On Register page user City "Kota Yogyakarta"
    And On Register click Register button
    Then Verify Register Success