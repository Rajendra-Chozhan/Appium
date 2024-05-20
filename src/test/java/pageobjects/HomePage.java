package pageobjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pageFactory.HomePage_Locators;

public class HomePage extends HomePage_Locators {
	
	public HomePage() {

		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(60)), this);
	}


	
	
	public void clickAccountionSection() {
		
		Account_Section.click();
	}
	
public void clickSignIn() {
		
	Sign_In.click();
	}
	


public void Enter_PhoneNumber(String phonenumber) {
	//Enter_Number.click();
	Enter_Number.sendKeys("8838392831");
	}
	
public void Click_ContinueButton() {
	
	ContinueButton.click();
	}
	

public void Click_ProceedwithOTP() {
	
	ProceedwithOTP.click();
	}

public void Click_Number() {
	
	Number.click();
	}

public void ClickGETOTP() {
	
	ProceedwithOTP.click();
	}
	
public void Click_locationPopup() {
	
	Allow_location_permission.click();
	}
	
public void Verify_Ui_Elements_HomePage() throws InterruptedException {

	Thread.sleep(3000);
	TataNeu_logo.isDisplayed();
	Thread.sleep(3000);
	SearchBar.isDisplayed();
	Thread.sleep(3000);
	Scan_Pay.isDisplayed();
	Thread.sleep(3000);
	SendMoney.isDisplayed();
	Thread.sleep(3000);
	PayBills.isDisplayed();
	Thread.sleep(3000);
	Loans.isDisplayed();
	Thread.sleep(3000);
	
	scrollup(driver);
	Thread.sleep(3000);	
Bottom_Icons.isDisplayed();

	}

public void Click_skip() {
	
	Skip_button.click();
	}

public void Click_Profile() {
	
	Profile_Icon.click();
	}

public void Click_SignOut() throws InterruptedException {
	

	Sign_Out.click();
	Thread.sleep(2000);
	Signout_Popup.click();
	}


}
