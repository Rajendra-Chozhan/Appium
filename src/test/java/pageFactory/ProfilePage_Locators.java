package pageFactory;

import org.openqa.selenium.WebElement;

import basepackage.BaseClass;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProfilePage_Locators extends BaseClass {

	

@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Orders\"]")
public WebElement Orders_button;

@AndroidFindBy(xpath="(//android.view.View[@content-desc=\"Profile\"])[1]")
public WebElement Profile_button;

@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Transactions\"]")
public WebElement Transactions_button;

@AndroidFindBy(xpath="(//android.view.View[@content-desc=\"Address\"])[2]")
public WebElement Address_button;

@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Security and privacy\"]")
public WebElement Security_button;

@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Communication preference\"]")
public WebElement Com_button;


@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Communication preference\"]")
public WebElement rateorapp_button;

@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Communication preference\"]")
public WebElement Legal_button;

@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Communication preference\"]")
public WebElement Signout_button;

@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Communication preference\"]")
public WebElement Version_button;



}
