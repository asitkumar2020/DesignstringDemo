package net.azurewebsites.Runner_Package;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\asit\\Downloads\\Five-master\\Five-master\\BDDwithPOM\\src\\main\\java\\net\\azurewebsites\\features_Package\\login.feature",
glue = "net.azurewebsites.StepDefinitions_Package",
format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
dryRun=false,
monochrome = true)

public class TestRunner {

}
