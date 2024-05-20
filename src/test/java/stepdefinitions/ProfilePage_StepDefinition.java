package stepdefinitions;





import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;
import pageobjects.ProfilePage;
import testrunner.Hooks;




public class ProfilePage_StepDefinition extends ProfilePage {
	    
	
	@Then("user verifies UI elements on Profile Page")
	public void user_verifies_ProfilePage_elements() throws InterruptedException {
		
		VerifyUIElements();
		System.out.println("UI Elements of Profile Page is verified");
		 screenshot(driver);
			Thread.sleep(10000);
	}

}
