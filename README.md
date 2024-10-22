# SeleniumTestSuite

SeleniumTestSuite is a simple automation project using Selenium WebDriver and TestNG. This project demonstrates how to automate browser-based testing for a sample web application, such as Google Search. It uses Maven for dependency management, TestNG for organizing and running tests, and Selenium WebDriver for interacting with the browser.

## Prerequisites

Before you can run this project, make sure you have the following installed:

1. **Java Development Kit (JDK)**: Version 8 or higher.
2. **Maven**: For building and managing project dependencies.
3. **ChromeDriver**: The web driver for Chrome to interact with the browser.

### Installing ChromeDriver

Download ChromeDriver from [here](https://sites.google.com/a/chromium.org/chromedriver/downloads) and ensure you have the correct version for your Chrome browser.

Place the ChromeDriver executable in your desired location and note the path. You'll need to update the `SampleTest.java` file to point to the correct path.

## Project Structure

```bash
SeleniumTestSuite/
│
├── pom.xml                    # Maven configuration with dependencies for Selenium and TestNG
├── testng.xml                 # TestNG configuration file
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── selenium/
│                   └── tests/
│                       └── SampleTest.java  # The main test class
└── target/                    # Automatically generated after building the project
```
## Project Setup
1. Clone the repository:
Clone this repository to your local machine:
```bash
git clone https://github.com/yourusername/SeleniumTestSuite.git
cd SeleniumTestSuite
```
2. Install dependencies:
Install the required dependencies by running:
```bash
mvn clean install
```
3. Update ChromeDriver Path:
Open the SampleTest.java file and update the path to ChromeDriver in the setUp method:
```bash
System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
```

## Test Cases
This project contains two basic Selenium WebDriver tests:

### searchTest:

1. Navigates to Google’s homepage (https://www.google.com).
2. Enters the search term "Selenium WebDriver" in the search box.
3. Submits the search and verifies that the title of the resulting page contains "Selenium WebDriver".

### clickFeelingLuckyTest:

1. Navigates to Google’s homepage (https://www.google.com).
2. Clicks the "I'm Feeling Lucky" button and verifies that the browser is redirected away from the homepage.
3. Running the Project in an IDE


## Conclusion
This project demonstrates how to set up and run Selenium WebDriver tests using TestNG in a Maven-based Java project. It can be extended with more complex test cases or adapted to test different web applications. Feel free to modify the project to suit your needs!



