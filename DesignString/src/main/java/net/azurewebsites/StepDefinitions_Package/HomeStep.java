package net.azurewebsites.StepDefinitions_Package;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import net.azurewebsites.TestBase_Package.*;
import net.azurewebsites.Pages_Package.Home;

public class HomeStep extends TestBase{
	
	Home homeDriver;
	
	
	@Given("^Open Browser and navigate to url$")
	public void open_Browser_and_navigate_to_Login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		TestBase.initialization();
	}


@When("^Click on Menu Button in Top Right position of Homepage$")
public void click_on_Menu_Button_in_Top_Right_position_of_Homepage() throws Throwable {
	
	homeDriver = new Home();
    homeDriver.menuClick();
    
}

@And("^Navigate to Life@DesignString Page by clicking appropriate option from Menu Page$")
public void navigate_to_Life_DesignString_Page_by_clicking_appropriate_option_from_Menu_Page() throws Throwable {
	
    homeDriver.lifeDesignStringClick();
   
}


@When("^Scroll down to Open Positions and Click on QA Engineer position$")
public void scroll_down_to_Open_Positions_and_Click_on_QA_Engineer_position() throws Throwable {
   
	homeDriver.scrollAndClickQAPosition();
    
}

@When("^Enter all details and upload your resume$")
public void enter_all_details_and_upload_your_resume() throws Throwable {
	homeDriver.applyForJob();

}

@Then("^Successfully submit the form$")
public void successfully_submit_the_form() throws Throwable {
homeDriver.submit();  

}




}
