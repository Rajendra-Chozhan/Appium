package stepdefinitions;





import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;
import testrunner.Hooks;




public class LaunchApp_StepDefinition extends HomePage {
	    
	@Given("user successfully launches app")
	public void user_successfully_launches_app() throws InterruptedException {
		Thread.sleep(5000);
	//	Click_locationPopup();
		Thread.sleep(5000);
	    System.out.println("Application is launched successfully");
		
	    screenshot(driver );
	    
	}


	@When("user click the Account button in bottom of the App")
	public void user_click_the_Account_button_in_bottom_of_the_app() throws InterruptedException {
		Thread.sleep(10000);
 		scrollup(driver);
	    System.out.println("Application is scrolled a bit");
		 screenshot(driver);
	}

	@Then("user clicks on Signin button text displayed the screen")
	public void user_Clicks_onSignIn_option() throws InterruptedException {
		clickAccountionSection();
		Thread.sleep(9000);
		clickSignIn();
		System.out.println("Sign in Clicked"); 
		Thread.sleep(9000);
		screenshot(driver);
	}


	
	@Then("user enter number in Mobile Number {string} in Field")
	public void user_enter_the_number_field(String phonenumber) throws InterruptedException {
		Enter_Number.click();
		Thread.sleep(5000);
		//sendKeys(Enter_Number,phonenumber);
		Thread.sleep(10000);
		System.out.println("Clicked Phone Number"); 
		 screenshot(driver);
	}

	

	
	@Then("user clicks on Number in screen")
	public void user_clicks_Homebutton() throws InterruptedException {
		Thread.sleep(20000);
		Click_Number(); 
		System.out.println("Number Clicked");
		screenshot(driver);
			Thread.sleep(10000);
	}
	
	@Then("user clicks on GET OTP in screen")
	public void user_clicks_GET_OTP() throws InterruptedException {
		Thread.sleep(10000);
		ClickGETOTP();
		System.out.println("Number Clicked");
		 screenshot(driver);
			Thread.sleep(30000);
	}
	
	@Then("user verifies UI elements on Home Page")
	public void user_verifies_UI_elements() throws InterruptedException {
		Thread.sleep(10000);
		Verify_Ui_Elements_HomePage();
		System.out.println("UI Elements of Home Page is verified");
		 screenshot(driver);
			Thread.sleep(10000);
	}
	
	@Then("user click profile icon on top of the screen")
	public void user_clicks_profileIcon() throws InterruptedException {
		//scrollup(driver);
		Thread.sleep(5000);
		Click_Profile();
		System.out.println("Profile Icon Clicked");
		Thread.sleep(10000);		
		Click_skip();
		System.out.println("Skip option Clicked");
	}
	
	@Then("user logs out of the application")
	public void user_clicks_on_signout() throws InterruptedException {
	
		 screenshot(driver);
			Thread.sleep(10000);
			scrollup(driver);
			Click_SignOut();
			Thread.sleep(10000);
			
	}
	
	

}
