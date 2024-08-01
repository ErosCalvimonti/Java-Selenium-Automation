package pages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AppointmentPage extends BasePage {

    private final String selectLocator = "///select[@id=\'combo_facility\']";
    private final String programSelected = "//input[@id=\'radio_program_medicaid\']";
    private final String valueSelected = "Seoul CURA Healthcare Center";
    private final String selectDate = "//span[@class='glyphicon glyphicon-calendar']";
    private final String dateOfAppointment = "22/09/2026";
    private final String makeAppointmentBtn = "//a[@id='btn-make-appointment']";
    private final String textForComment = "//textarea[@id=\'txt_comment\']";
    private final String commentForGiveThanks = "Thanks for giving me an appointment";
    private final String btnMakeAppointment = "//button[@id='btn-book-appointment']";
    private final String messageConfirmation = "//h2[normalize-space()='Appointment Confirmation']";

    public AppointmentPage() {
        super(driver);
    }

    public void makeAppointment() {
        clickElement(makeAppointmentBtn);
    }

    public void fillTheForm() {
        selectFromDropdownnByValue(selectLocator, valueSelected);
        clickElement(programSelected);
        write(selectDate, dateOfAppointment);
        write(textForComment, commentForGiveThanks);
    }

    public void confirmAppointment() {
        clickElement(btnMakeAppointment);
    }

    public void assertTheConfirmation() {
        WebElement confirmation = Find(messageConfirmation);
        Assert.assertTrue(confirmation.isDisplayed(), "Appointment Confirmation");
    }

}
