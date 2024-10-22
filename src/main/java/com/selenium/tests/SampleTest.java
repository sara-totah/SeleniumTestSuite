package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the path to the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");  // Update with the correct path
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void searchTest() {
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();
        Assert.assertTrue(driver.getTitle().contains("Selenium WebDriver"), "Title does not contain expected text");
    }

    @Test
    public void clickFeelingLuckyTest() {
        driver.get("https://www.google.com");
        WebElement luckyButton = driver.findElement(By.name("btnI"));
        luckyButton.click();
        Assert.assertNotEquals(driver.getCurrentUrl(), "https://www.google.com", "Did not navigate away from Google homepage");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
