package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AppointmentPage;
import pages.BasePage;

public class AppointmentSteps extends BasePage {

    public AppointmentSteps() {
        super(driver);
    }

    AppointmentPage appointment = new AppointmentPage();

    @When("I click on Make Appointment button")
    public void makeAppointment() {
        appointment.makeAppointment();
    }

    @And("I fill the form of appointment")
    public void fillForm() {
        appointment.fillTheForm();
    }

    @And("I click on the Book Apointment button")
    public void bookAppointment() {
        appointment.confirmAppointment();
    }

    @Then("I can see the confirmation of my appointment")
    public void seeConfirmation() {
        appointment.assertTheConfirmation();
    }

}
