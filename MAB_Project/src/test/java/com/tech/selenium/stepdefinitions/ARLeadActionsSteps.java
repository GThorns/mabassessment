package com.tech.selenium.stepdefinitions;

import com.tech.selenium.driverutil.DriverFactory;
import com.tech.selenium.pageobjects.ARLeadActionsPage;
import cucumber.api.Scenario;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;


public class ARLeadActionsSteps implements En {

    private WebDriver driver;
    ARLeadActionsPage ARLeadActionsPage;
   

    public ARLeadActionsSteps() {

        Before((Scenario scenario) -> {
            driver = DriverFactory.getBrowser(); //you can change browser, currently bug in ChromeDriver versions. 
            ARLeadActionsPage = new ARLeadActionsPage(driver);
     
        });

        Given("User navigates to Platform$", () -> {
        	ARLeadActionsPage.openURL();
        });

        When("^User logs in as an AR$", () -> {
        	ARLeadActionsPage.loginsAR();
        });
        
       
        And("^User Clicks on Add New Lead$", () -> {
        	ARLeadActionsPage.clickaddNewLeads();
        });

        And("^Enter New Lead Details$", () -> {
        	ARLeadActionsPage.enterLeadDetailsForm();
        });
            
        And("^I submit$", () -> {
        	ARLeadActionsPage.submit();
        });
            
        Then("^The success toast message appears$", () -> {
        	ARLeadActionsPage.successToastMessage();
        });
        
        
        
        
        After((Scenario scenario) -> {
            driver.quit();
        });

    }
}
