package test;

import static org.junit.Assert.assertTrue;


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

//import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;

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
		public void emulatorDriver() throws MalformedURLException, InterruptedException{
			
			platformName = System.getProperty("platformName");
			platformVersion = System.getProperty("platformVersion");
			deviceName = System.getProperty("deviceName");
			appPackage = System.getProperty("appPackage");
			appActivity = System.getProperty("appActivity");
			aPKFilePath = System.getProperty("aPKFilePath");
			driverURL = System.getProperty("driverURL");
			UDID = null;
	
			
			//AndroidDevice DeviceObject = new AndroidDevice("Android","6.1","Android Emulator","com.blueshieldca.prod","com.blueshieldca.prod.MemberMobile",
				//	"C:\\app\\signed\\BS.apk","http://127.0.0.1:10160/wd/hub","");
			
			AndroidDevice DeviceObject = new AndroidDevice(platformName,platformVersion,deviceName,appPackage,appActivity,
					aPKFilePath,driverURL,"");
			
			
			@SuppressWarnings("rawtypes")
			AndroidDriver driver = DeviceObject.createDeviceObject();
			
	        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	        // click on find a provider text
	        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"FIND A PROVIDER\")").click();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Continue as Guest\")").click();
	        Thread.sleep(5000);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Doctor\")").click();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"All Plans\")").click();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Access+ HMO\")").click();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"All Types\")").click();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"General Medicine\")").click();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        	        
	        Dimension dimensions = driver.manage().window().getSize();
	        Double screenHeightStart = dimensions.getHeight() * 0.5;
	        int scrollStart = screenHeightStart.intValue();
	        System.out.println("screen top="+scrollStart);
	        
	        Double screenHeightEnd = dimensions.getHeight() * 0.2;
	        int scrollEnd = screenHeightEnd.intValue();
	        System.out.println("screen bottom="+scrollEnd);
	        
	        
	        Thread.sleep(500);
	        driver.quit();
	
			
		}
		
		


}
