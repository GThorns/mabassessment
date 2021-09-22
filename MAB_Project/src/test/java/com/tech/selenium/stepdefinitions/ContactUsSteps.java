package com.tech.selenium.stepdefinitions;

import com.tech.selenium.driverutil.DriverFactory;
import com.tech.selenium.pageobjects.ContactUsPage;
import cucumber.api.Scenario;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class ContactUsSteps implements En {

    private WebDriver driver;
    ContactUsPage ContactUsPage;
   

    public ContactUsSteps() {

        Before((Scenario scenario) -> {
            driver = DriverFactory.getBrowser(); //you can change browser, currently bug in ChromeDriver versions. 
            ContactUsPage = new ContactUsPage(driver);
     
        });

        Given("^User open MAB webpage$", () -> {
        	ContactUsPage.openURL();
        });

        When("^User Verifies they see request a call back$", () -> {
        	ContactUsPage.verifyCallback();
        });

        And("^Enter Personal Details$", () -> {
        	ContactUsPage.personalDetailsForm();
        });
        
   
        
        
 
        
        
        After((Scenario scenario) -> {
            driver.quit();
        });

    }
}
