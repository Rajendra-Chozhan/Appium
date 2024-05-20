package pageFactory;

import org.openqa.selenium.WebElement;

import basepackage.BaseClass;


import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage_Locators extends BaseClass{
	


@AndroidFindBy(xpath="//android.view.View[@content-desc=\"/home/iplhome\"]/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]")
public WebElement Account_Section;

@AndroidFindBy(accessibility="LOGIN/SIGN UP")
public WebElement Sign_In;

@AndroidFindBy(xpath="//android.widget.EditText")
public WebElement Enter_Number;

@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"GET OTP\"]")
public WebElement ProceedwithOTP;

@AndroidFindBy(id="//android.widget.Button[@text=\"CONTINUE\"]")
public WebElement ContinueButton;

@AndroidFindBy(xpath="//android.widget.TextView[@text=\"088383 92831\"]")
public WebElement Number;


@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Categories\"]")
public WebElement Categories_Tab;

@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Search\"]")
public WebElement Search_Tab;
	

@AndroidFindBy(xpath="//android.widget.Button[@text=\"WHILE USING THE APP\"]")
public WebElement Allow_location_permission;

@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Home\"]")
public WebElement Home_section;

@AndroidFindBy(xpath="//android.view.View[@content-desc=\"NeuPass\"]")
public WebElement NeuPass_section;

@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Categories\"]")
public WebElement Categories_section;

@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Offers\"]")
public WebElement Offers_section;

@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Stories\"]")
public WebElement Stories_section;
	
@AndroidFindBy(xpath="(//android.view.View[@content-desc=\"Sign Out\"])[1]")
public WebElement Sign_Out;

@AndroidFindBy(xpath="//android.view.View[@content-desc=\"/home/iplhome\"]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]")
public WebElement Profile_Icon;

@AndroidFindBy(accessibility="SKIP")
public WebElement Skip_button;


@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"SIGN OUT\"]")
public WebElement Signout_Popup;


@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Search Tata Neu\"]")
public WebElement SearchBar;

@AndroidFindBy(xpath="//android.view.View[@content-desc=\"/home/iplhome\"]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView")
public WebElement TataNeu_logo;


@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Scan & Pay\"]")
public WebElement Scan_Pay;

@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Send money\"]")
public WebElement SendMoney;

@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Pay bills\"]")
public WebElement PayBills;

@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Loans\"]")
public WebElement Loans;

@AndroidFindBy(xpath="//android.view.ViewGroup[@resource-id=\"com.tatadigital.tcp:id/slang_lib_surface_v2_inner_surface_container\"]")
public WebElement Bottom_Icons;

}
