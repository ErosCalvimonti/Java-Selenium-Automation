# Test Automation Project

This project implements automated testing for the CURA Healthcare Services web application using Selenium WebDriver with Java and the Cucumber framework for BDD (Behavior-Driven Development).

## Tools Implemented

- **Java**: Main programming language.
- Selenium WebDriver**: For web browser automation.
- Cucumber**: Framework for implementing tests in BDD format.
- JUnit**: Unit testing framework for Java.
- Gradle**: Build automation system.
- WebDriverManager**: For automatic management of browser drivers.

## Project Structure

- `src/test/java/pages`: Contains the `BasePage` class with common methods to interact with web elements.
- `src/test/java/runner`: Contains the `TestRunner` class to run Cucumber tests.
- `src/test/resources`: Contains the Cucumber feature files with the test scenarios.

## How to use

1. **Project Setup**:
   - Make sure you have Java JDK installed.
   - Configure the project dependencies in the `build.gradle` file.

2. **Run the Tests**:
   - To run all tests:
     ```
     gradle test
     ```
   - To run tests with specific tags:
     ```
     gradle test -Dcucumber.filter.tags="@Login"
     ```
   - To exclude tests with a specific tag:
     ```
     gradle test -Dcucumber.filter.tags="not @Login"
     ```
   - To run multiple tags:
     ```
     gradle test -Dcucumber.filter.tags="@Login or @OtroTag"
     ```

3. **View Results**:
   - Cucumber reports will be generated in the `target/cucumber-reports` directory.

## Important Notes

- The `BasePage` class provides useful methods for interacting with web elements, such as navigating to a URL, finding elements, clicking, typing text, and selecting options from a dropdown.
- The `WebDriverManager` is used to automatically configure the ChromeDriver.
- The tests use Chrome as the default browser.
- Make sure you have an active Internet connection so that WebDriverManager can download the necessary driver.

## Example Scenario

```gherkin
Feature: Test Functionality of CURA Healthcare Services to login as user.

    @Login
    Scenario: User can login in the page of user .
        Given I navigate to katalon-demo-cura.herokuapp.com
        When I go to login page
        And I enter valid credentials
        Then I can see my account page
```

This scenario tests the login functionality in the CURA Healthcare Services application.
