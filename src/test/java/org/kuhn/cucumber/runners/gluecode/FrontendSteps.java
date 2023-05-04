package org.kuhn.cucumber.runners.gluecode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.de.Gegebensei;
import io.cucumber.java.de.Wenn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.fail;

public class FrontendSteps {

    WebDriver driver;

    @Before
    public void setupChromeDriver(){
        System.setProperty("webdriver.chrome.driver",
                "target/driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("target/chromium/chrome-win/chrome.exe");
        driver = new ChromeDriver(options);
    }
    @Gegebensei("^die geöffnete Seite (.*)$")
    public void openPage(String url) {

        driver.get(url);
    }

    @Wenn("ich bin ein Step der immer fehlschlägt")
    public void stepThatFails(){
        fail("Ich bin böse und lasse den Test fehlschlagen");
    }

    @After
    public void closeChrome(){
        driver.close();
    }
}
