
Feature: Test Functionality of CURA Healthcare Services to login as user.

    @Login
    Scenario: User can login in the page of user .
        Given I navigate to katalon-demo-cura.herokuapp.com
        When I go to login page
        And I enter valid credentials
        Then I can see my account page
