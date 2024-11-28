package stepdefinitions;





import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ElectronicsPage;
import pageobjects.HomePage;
import testrunner.Hooks;




public class HomeScreen_StepDefinition extends ElectronicsPage {
	    

	
	@Then("user verifies UI on Electronics screen")
	public void user_verifies_UI_of_ElectronicsScreen() throws InterruptedException {
	
		 screenshot(driver);
			Thread.sleep(10000);
			Verify_Electronics_UI();
			
	}
	
	
	

	
	
	

}
