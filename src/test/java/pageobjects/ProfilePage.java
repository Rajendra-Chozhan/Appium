package pageobjects;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import basepackage.BaseClass;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pageFactory.ProfilePage_Locators;

public class ProfilePage extends ProfilePage_Locators{

	
	public ProfilePage() {

		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(60)), this);
	}


	
	
	public void VerifyUIElements() {
		
		Orders_button.isDisplayed();
		Profile_button.isDisplayed();
		Transactions_button.isDisplayed();
		Address_button.isDisplayed();
		Security_button.isDisplayed();
		Com_button.isDisplayed();
		
		scrollup(driver);
		rateorapp_button.isDisplayed();
		Legal_button.isDisplayed();
		Signout_button.isDisplayed();
		Version_button.isDisplayed();
		
		
		}
	
public void clickSignIn() {
		
	//Sign_In.click();
	}
}
