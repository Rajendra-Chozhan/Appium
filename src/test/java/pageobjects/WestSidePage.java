package pageobjects;



import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import pageFactory.WestSidePage_Locators;

public class WestSidePage extends WestSidePage_Locators {
	
	public WestSidePage() {

		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(60)), this);
	}


	

public void user_clicks_WestSideSection() throws InterruptedException {
	westside_section.click();
	
	}

public void Verify_WestSideSection() throws InterruptedException {
	screenshot(driver);
	Thread.sleep(10000);
	westside_logo.isDisplayed();
	Thread.sleep(1000);
	westernwear.isDisplayed();
	Thread.sleep(1000);
	Dresses.isDisplayed();
	Thread.sleep(1000);
	shirts.isDisplayed();
	Thread.sleep(1000);
	Bottom_container.isDisplayed();
	Thread.sleep(1000);
	
	
	}

}
