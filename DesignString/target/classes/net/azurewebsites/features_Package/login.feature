#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login Feature
  

  @tag1
  Scenario: Validate Login Page With Valid Credentials
    Given Open Browser and navigate to url
    When  Click on Menu Button in Top Right position of Homepage
    And Navigate to Life@DesignString Page by clicking appropriate option from Menu Page
    When Scroll down to Open Positions and Click on QA Engineer position
    When Enter all details and upload your resume
    Then  Successfully submit the form
    
    
    

  