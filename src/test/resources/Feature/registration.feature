Feature: Registration Feature
  @trail
  Scenario: User should be able to register successfully so that user can use all the functionality of my website
    Given User is on homepage
    When User click on Register Button
    And User enters all the required details of registration form
    Then User should be able to register successfully