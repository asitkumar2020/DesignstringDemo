$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/shaikhrehan/Downloads/Five-master/Five-master/KENCentralBDDwithPOM/src/main/java/net/azurewebsites/features_Package/login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 24,
  "name": "Validate Login Page With Valid Credentials",
  "description": "",
  "id": "login-feature;validate-login-page-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "Open Browser and navigate to url",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "Click on Menu Button in Top Right position of Homepage",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "Navigate to Life@DesignString Page by clicking appropriate option from Menu Page",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Scroll down to Open Positions and Click on QA Engineer position",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Enter all details and upload your resume",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Successfully submit the form",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStep.open_Browser_and_navigate_to_Login_page()"
});
formatter.result({
  "duration": 36840113600,
  "status": "passed"
});
formatter.match({
  "location": "HomeStep.click_on_Menu_Button_in_Top_Right_position_of_Homepage()"
});
formatter.result({
  "duration": 582306399,
  "status": "passed"
});
formatter.match({
  "location": "HomeStep.navigate_to_Life_DesignString_Page_by_clicking_appropriate_option_from_Menu_Page()"
});
formatter.result({
  "duration": 505028900,
  "status": "passed"
});
formatter.match({
  "location": "HomeStep.scroll_down_to_Open_Positions_and_Click_on_QA_Engineer_position()"
});
formatter.result({
  "duration": 1742805600,
  "status": "passed"
});
formatter.match({
  "location": "HomeStep.enter_all_details_and_upload_your_resume()"
});
formatter.result({
  "duration": 5337271001,
  "status": "passed"
});
formatter.match({
  "location": "HomeStep.successfully_submit_the_form()"
});
formatter.result({
  "duration": 75820100,
  "status": "passed"
});
});