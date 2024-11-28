package pageobjects;

import java.time.Duration;



import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pageFactory.ElectronicsPage_Locators;

public class ElectronicsPage extends ElectronicsPage_Locators {
	
	public ElectronicsPage() {

		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(60)), this);
	}


	

public void Verify_Electronics_UI() throws InterruptedException {
	
	Croma_Image.isDisplayed();
	Explore_text.isDisplayed();
	Shopby.isDisplayed();
	
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1);"));
	Thread.sleep(1000);
	fans_image.isDisplayed();
	Thread.sleep(1000);
	fans_image.click();
	Thread.sleep(3000);
	
	
	
	
	fanspage_navigateback.click();
	Thread.sleep(3000);
	//Navigateback.click();
	
	}



}
