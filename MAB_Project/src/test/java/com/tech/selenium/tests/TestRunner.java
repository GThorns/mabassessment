package com.tech.selenium.tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = 
		{"src/test/resources/features/MAB_Contact_Us.feature",},
        glue = {"com.tech.selenium.stepdefinitions"},
        plugin = {"json:target/cucumber-report.json","html:target/cucumber-html"})
public class TestRunner {
}
