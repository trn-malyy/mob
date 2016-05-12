package utils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class AndroidDevice {
	
	@SuppressWarnings("rawtypes")
	AndroidDriver driver;
	String platformName;
	String platformVersion;
	String deviceName;

	String appPackage;
	String appActivity;
	String APKFilePath;
	String driverURL;
	String UDID;
	
	
	public AndroidDevice(String platformName, String platformVersion, String deviceName, String appPackage,
			String appActivity, String aPKFilePath, String driverURL, String UDID) {
		
		this.platformName = platformName;
		this.platformVersion = platformVersion;
		this.deviceName = deviceName;
		this.appPackage = appPackage;
		this.appActivity = appActivity;
		this.APKFilePath = aPKFilePath;
		this.driverURL = driverURL;
		this.UDID = UDID;
	}

	
	
	@SuppressWarnings("rawtypes")
	public AndroidDriver createDeviceObject() throws MalformedURLException{
        
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("platformName", platformName);
        capabilities.setCapability("platformVersion", platformVersion);
        capabilities.setCapability("deviceName",deviceName);
        // application related capabilities should be loaded from properties files 
        capabilities.setCapability("app", APKFilePath) ;
        capabilities.setCapability("appPackage", appPackage);
        capabilities.setCapability("appActivity", appActivity);
        // MAKE UDID PARAMETER OPTIONAL
        if (UDID != null && !UDID.equals("")) {
        capabilities.setCapability("udid", UDID);
        }
        
        driver = new AndroidDriver(new URL(driverURL), capabilities); 
        
        return driver;
		
	}
	

}
