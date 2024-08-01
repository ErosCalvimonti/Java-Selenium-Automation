package pages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage extends BasePage {

    private final String burguerMenu = "//a[@id=\'menu-toggle\']";
    private final String loginBtn = "//a[@href=\'profile.php#login\']";
    private final String usernameLocator = "//input[@id=\'txt-username\']";
    private final String passwordLocator = "//input[@id=\'txt-password\']";
    private final String username = "John Doe";
    private final String password = "ThisIsNotAPassword\n";
    private final String locatorAssertion = "//h2[normalize-space()='Profile']";
    private final String profileBtn = "//a[@href=\'profile.php#profile\']";

    
    public LoginPage(){
        super(driver);
    }

    public void navigateToDemoCura(){
        navigateTo("https://katalon-demo-cura.herokuapp.com/");
    }

    public void goToLoginPage(){
        clickElement(burguerMenu);
        clickElement(loginBtn);
    }

    public void typeCredentials(){
        write(usernameLocator, username);
        write(passwordLocator, password);
    }

    public void seeMyAccount(){
        clickElement(burguerMenu);
        clickElement(profileBtn);
        WebElement profileElement = Find(locatorAssertion);
        Assert.assertTrue(profileElement.isDisplayed(), "Profile");
    }
}
