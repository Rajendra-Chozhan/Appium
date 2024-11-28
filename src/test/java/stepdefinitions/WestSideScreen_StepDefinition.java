package stepdefinitions;





import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ElectronicsPage;
import pageobjects.HomePage;
import pageobjects.WestSidePage;
import testrunner.Hooks;




public class WestSideScreen_StepDefinition extends WestSidePage {
	    

	

	@Then("user clicks on WestSide section")
	public void user_clicks_on_WestSide() throws InterruptedException {
	
		 screenshot(driver);
			Thread.sleep(10000);
			user_clicks_WestSideSection();
			
	}
	

	@Then("user verifies UI of WestSide Page")
	public void user_verifies_on_WestSide() throws InterruptedException {
	
		Verify_WestSideSection();
	
	}

}
