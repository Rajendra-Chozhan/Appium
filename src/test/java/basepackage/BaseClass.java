package basepackage;
import io.appium.java_client.AppiumBy;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Date;
import java.util.Properties;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidStartScreenRecordingOptions;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.screenrecording.CanRecordScreen;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;



public  class BaseClass {


	public static AppiumDriver driver;
	public static String launchApp;
	public static Properties prop;
	public static AppiumDriverLocalService service;
	
	private static Logger log = LogManager.getLogger(BaseClass.class.getName());
    
	public void loadConfigFile() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\Appium2.0\\AppiumFramework\\Configuration\\config.properties");
		prop = new Properties();
		prop.load(fis);
		
	}
	
	
public void appiumServer() throws InterruptedException {
	Thread.sleep(10000);
	if(service!=null) {
		service.stop();
	}
		service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\ADMIN\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(600)).build();		
		service.start();
	}
	
	
	public void launchApp() throws IOException, InterruptedException {
		
		
		loadConfigFile();
		if(prop.getProperty("LaunchApp").equals("android")){
			
			androidAppCapabilities();
			 System.out.println(((AndroidDriver) driver).isDeviceLocked());
			  ((AndroidDriver) driver).unlockDevice();
			
			  
		}else if(prop.getProperty("LaunchApp").equals("ios")) {
			
			iOSAppCapabilities();
		}
		
		
		
	}
	
	
	public void androidAppCapabilities() throws MalformedURLException, InterruptedException {
		appiumServer();
		Thread.sleep(10000);
		UiAutomator2Options options = new UiAutomator2Options();
		options.setUdid(prop.getProperty("udid"));
		options.setApp(prop.getProperty("appUrl"));
		options.setCapability("ignoreHiddenApiPolicyError" , true) ;
	//	options.setApp("E:\\Appium Notes\\APKs\\tataneu.apk");
		  options.autoGrantPermissions();	
		 
		options.setCapability("unlockType", "pattern");
		options.setCapability("unlockKey", "23658");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	//	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(2);"));
			
		 ((CanRecordScreen) driver).startRecordingScreen(
	                new AndroidStartScreenRecordingOptions()
	                        .withVideoSize("1280x720")
	                        .withTimeLimit(Duration.ofSeconds(200)));
		 
		
	}
	
	public void iOSAppCapabilities() throws MalformedURLException {
		
		MutableCapabilities caps = new MutableCapabilities();
		caps.setCapability("platformName", "iOS");
		caps.setCapability("appium:app", "storage:filename=ios.simulator.wdio.native.app.v1.0.8.zip");  // The filename of the mobile app
		caps.setCapability("appium:deviceName", "iPhone Simulator");
		caps.setCapability("appium:platformVersion", "16.2");
		caps.setCapability("appium:automationName", "XCUITest");
		MutableCapabilities sauceOptions = new MutableCapabilities();
		caps.setCapability("sauce:options", sauceOptions);

		URL url = new URL("https://mobiledemomail2024:12b55330-ea02-4911-973d-073f0d33ec59@ondemand.us-west-1.saucelabs.com:443/wd/hub");
		driver = new IOSDriver(url, caps);
	}
	
	
	public void webDriverWait(WebElement element) {
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	    wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void removeApp(AppiumDriver driver) {
		
		((InteractsWithApps) driver).removeApp("com.bigbasket.mobileapp");
	    System.out.println("App is uninstalled successfully");
	}
	
	public void startRecording(AppiumDriver driver)
	 {
		//((CanRecordScreen)driver).startRecordingScreen();
		 ((CanRecordScreen) driver).startRecordingScreen(
	                new AndroidStartScreenRecordingOptions()
	                        .withVideoSize("1280x720")
	                        .withTimeLimit(Duration.ofSeconds(200)));
	 }
	
	
	public static void screenshot(AppiumDriver driver)
{

	try {
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    Date d = new Date();
        String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";

		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./ScreenShots/"+ "Tata Neu" +FileName);
	    FileUtils.copyFile(source, target);
        System.out.println("ScreenShot Taken");
	    	  
	} 
catch (Exception e) 	{
	    System.out.println("Exception while taking ScreenShot "+e.getMessage());
	}


	}
	
	public static void scrollup(AppiumDriver driver)
	{
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(2);"));
		

		}


	
	  public void sendKeys(WebElement e, String txt) {
		  webDriverWait(e);
	        e.sendKeys(txt);
	    }
	  
	  
	  public static void scrollintoview(AppiumDriver driver) {
	  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Documents You Might Need\")"));    
	  }
	
	  public static void unlockmobile(AppiumDriver driver)
	  {
		  System.out.println(((AndroidDriver) driver).isDeviceLocked());
		  ((AndroidDriver) driver).unlockDevice();

	  }
	
	  
	  public static void loggermethod(AppiumDriver driver)
	  {
		  log.info("This is information Message");
		  log.warn("This is warning Message");
		  log.error("This is error Message");
		  log.debug("This is debug Message");
		  
	  }
	
	}