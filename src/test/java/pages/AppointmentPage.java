package pages;

import org.openqa.selenium.WebElement;

public class AppointmentPage extends BasePage {

    private final String selectLocator = "//select[@id=\'combo_facility\']";
    private final String programSelected = "//input[@id=\'radio_program_medicaid\']";
    private final String textSelected = "Seoul CURA Healthcare Center";
    private final String selectDate = "//input[@id=\'txt_visit_date\']";
    private final String dateOfAppointment = "22/09/2026";
    private final String makeAppointmentBtn = "//a[@id='btn-make-appointment']";
    private final String textForComment = "//textarea[@id=\'txt_comment\']";
    private final String commentForGiveThanks = "Thanks for giving me an appointment";
    private final String btnMakeAppointment = "//button[@id='btn-book-appointment']";
    private final String messageConfirmation = "//h2[contains(text(),'Appointment Confirmation')]";
    

    public AppointmentPage() {
        super(driver);
    }

    public void makeAppointment() {
        clickElement(makeAppointmentBtn);
    }

    public void fillTheForm() {
        selectFromDropdownnByText(selectLocator, textSelected);
        clickElement(programSelected);
        write(selectDate, dateOfAppointment);
        write(textForComment, commentForGiveThanks);
    }

    public void confirmAppointment() {
        clickElement(btnMakeAppointment);
    }

    public WebElement getConfirmationMessage() {
        return Find(messageConfirmation);
    }

}
