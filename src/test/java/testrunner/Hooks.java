package testrunner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;



import basepackage.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.screenrecording.CanRecordScreen;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass{
	

    
	@Before
	public void before() throws IOException, InterruptedException {
		 
	new BaseClass().launchApp();
	//startRecording(driver);
	

		}
	
	@After
	public void after(Scenario scenario) throws IOException, AddressException, MessagingException {
		 String video =((CanRecordScreen) driver).stopRecordingScreen();
		 
		  Date d = new Date();
	     //   String FileName = d.toString().replace(":", "_").replace(" ", "_");
		  String timestamp = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(Calendar.getInstance().getTime()).replaceAll(":", "-");

      String dirPath =   "C:\\Users\\ADMIN\\eclipse-workspace\\Appium2.0\\AppiumFramework\\Videos";
	       File videoDir = new File(dirPath);
	       FileOutputStream stream = null;
	       
    try {
	      stream = new FileOutputStream(videoDir + File.separator + timestamp+ ".mp4");
            stream.write(Base64.decodeBase64(video));
            stream.close();

        } catch (Exception e) {

        } finally {
            if(stream != null) {
                stream.close();
            }
        
            }
        
		if(scenario.isFailed()) {
			byte[] source = driver.getScreenshotAs(OutputType.BYTES);
			scenario.attach(source, "image/png", "failedScenario");
		}
		
		if(driver!=null) {
		
			driver.quit();
			
			
		}
		
//		if(launchApp.equals("android")) {
//			System.out.println("Appium server not required");
//		}else {
			if(service!=null) {
				service.stop();
			}
			
			SendingMail();
		}
//	}
	
public static void SendingMail() throws AddressException, IOException, MessagingException{
		
		Runtime r=Runtime.getRuntime();  	  
		r.addShutdownHook(new Thread(){  
		public void run(){  
			try {
				Mailing.mail();
						} catch (IOException e) {
				e.printStackTrace();
			}
			
		    }  
		}  
		);  
		try{Thread.sleep(5000);}catch (Exception e) 
		{
			System.out.println(e);
		}  }
	
	
	
}



