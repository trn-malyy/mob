package test;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import io.appium.java_client.android.AndroidDriver;
import utils.AndroidDevice;

public class mySecondUnitTest {
	
	 String platformName;
	 String platformVersion;
	 String deviceName;
	 String appPackage;
	 String appActivity;
	 String aPKFilePath;
	 String driverURL;
	 String UDID;
	
	
	
	
	
	
	
		
		
		@Test
	    public void secondUnitTestGotCalled()
	    {
	        assertTrue( true );
	    }
				
		@Test
		public void emulatorDriver() throws MalformedURLException{
			
			platformName = System.getProperty("platformName");
			platformVersion = System.getProperty("platformVersion");
			deviceName = System.getProperty("deviceName");
			appPackage = System.getProperty("appPackage");
			appActivity = System.getProperty("appActivity");
			aPKFilePath = System.getProperty("aPKFilePath");
			driverURL = System.getProperty("driverURL");
			UDID = null;
	
			
			//AndroidDevice DeviceObject = new AndroidDevice("Android","6.1","Android Emulator","com.blueshieldca.prod","com.blueshieldca.prod.MemberMobile",
				//	"C:\\Users\\smelyy01\\Desktop\\signed\\BlueShield 3.9.apk","http://127.0.0.1:10160/wd/hub","");
			
			AndroidDevice DeviceObject = new AndroidDevice(platformName,platformVersion,deviceName,appPackage,appActivity,
					aPKFilePath,driverURL,"");
			
			
			@SuppressWarnings("rawtypes")
			AndroidDriver driver = DeviceObject.createDeviceObject();
			
	        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	        // click on find a provider text
	        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"FIND A PROVIDER\")").click();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			
		}

}
