package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.LoginPage;

public class LoginSteps extends BasePage {

    public LoginSteps() {
        super(driver);
    }

    LoginPage loginpage = new LoginPage();

    @Given("I navigate to katalon-demo-cura.herokuapp.com")
    public void goToDemoCura() {
        loginpage.navigateToDemoCura();
    }

    @When("I go to login page")
    public void clickOnLogin(){
        loginpage.goToLoginPage();
    }
    
    @And("I enter valid credentials")
    public void enterCredentials() {
        loginpage.typeCredentials();
    }

    @Then("I can see my account page")
    public void seeMyProfile(){
        loginpage.seeMyAccount();
    }
}
