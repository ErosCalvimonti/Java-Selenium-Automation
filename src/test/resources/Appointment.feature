Feature: Test Functionality of CURA Healthcare Services for the make an appointment.

    Background: Once the user is logged in
        Given I navigate to katalon-demo-cura.herokuapp.com
        When I go to login page
        And I enter valid credentials

    @MakeAppointment
    Scenario: User logged in is able to make an appointment
        When I click on Make Appointment button
        And I fill the form of appointment
        And I click on the Book Apointment button
        Then I can see the confirmation of my appointment
