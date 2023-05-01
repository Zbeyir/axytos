@wip
Feature: Default


  Scenario: Check Linkedin Links of sva.de
    When user is on the sva Page
    And user accept Cookies
    And user click linkedin Link
    Then check user on the linkedin WebSite



  Scenario: Check Xing Links of sva.de
    When user is on the sva Page
    And user accept Cookies
    And user click Xing Link
    Then check user on the Xing WebSite




