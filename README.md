# Test Automation Project with Selenium Java and Gradle
## This is a suite of Test Cases for Medical Appointments on https://katalon-demo-cura.herokuapp.com/

### Home 
https://pasteboard.co/yACggXTIFrsb.png


### Make Appointment
https://pasteboard.co/BT57l9MtYynB.png


```gherkin
Feature: Test Functionality of CURA Healthcare Services to login as user.

    @Login
    Scenario: User can login in the page of user .
        Given I navigate to katalon-demo-cura.herokuapp.com
        When I go to login page
        And I enter valid credentials
        Then I can see my account page
  ```

  ```gherkin
Feature: Test Functionality of CURA Healthcare Services for make an appointment.

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

  ```



_Open source test automation framework for web applications with Selenium, Cucumber, and Gradle_

## Indices

In this README, we will cover the following topics:

- What can we do with this Framework
- Technologies Implemented (Technological Stack)
- Project Structure
- Steps to Run the Framework
- How to manage test tags
- How to view test reports

## What can we do with this Framework

- Automate testing for web applications using Selenium WebDriver
- Implement BDD using the Gherkin language with Cucumber
- Generate detailed reports after test execution
- Use Gradle for build automation and dependency management
- Simplify test management with automatic browser driver handling using WebDriverManager
- Execute tests in a flexible manner with options for specific tags, exclusion, and multiple tags

## Technological Stack

This project includes the following technologies:

- **Java**: Main programming language.
- **Selenium WebDriver**: For web browser automation.
- **Cucumber**: Tool for implementing tests in BDD format using Gherkin.
- **JUnit**: Unit testing framework for Java.
- **Gradle**: Build automation system.
- **WebDriverManager**: For automatic management of browser drivers.

## Project Structure

This framework is organized using the Page Object Model (POM) pattern and has the following structure:

```
└── src
├── test
│ ├── java
│ │ ├── pages -----------------------> Contains the BasePage class with methods to interact with web elements
│ │ ├── runner ----------------------> Contains the TestRunner class for running Cucumber tests
│ └── resources
│ └── features --------------------> Contains Cucumber feature files with test scenarios
└── build.gradle ----------------------------> Gradle build configuration file

```

## Steps to Run the Framework

### Prerequisites

- Java JDK installed
- Gradle configured in your environment

### Project Setup

1. **Clone the repository**:
   - Open a terminal on your local machine.
   - Clone the repository from GitHub using the following command:

     ````bash
     git clone https://github.com/your-username/your-repository.git
     ```
     Replace `your-username` and `your-repository` with your GitHub username and repository name respectively.

2. **Navigate to the project directory**:
   - After cloning the repository, navigate to the project directory using the `cd` command:

     ````bash
     cd your-repository
     ```
     Again, replace `your-repository` with the name of the cloned project directory.

3. **Install dependencies**:
   - Before you can run the project, you need to install all the project dependencies. Make sure that Gradle is installed on your system.
   - Once inside the project directory, run the following command to clean up any previous builds and download the necessary dependencies:

     ````bash
     gradle clean build
     ```

     This command does the following:
     - **`clean`**: Removes all files generated during previous builds, ensuring that the next build starts from scratch.
     - **`build`**: Compiles the project source code, runs the unit tests, and assembles a JAR file of the project, all in one step. This also downloads and installs all dependencies listed in the `build.gradle` file.

4. **Verify the setup**:
   - After the `gradle clean build` command completes, verify that there are no errors in the terminal. If the setup is correct, you should see a message indicating that the build was successful.
   - You are now ready to start running tests or continue with project development.

## 🔗 About me
[![GitHub Repos](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/ErosCalvimonti)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/eroscalvimonti/)

