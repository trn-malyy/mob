package utils;

//// THIS CALSS IS TEPORARY . CLEAN UP BEFORE FINILIZING

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;


public class AndroidDriverTest {
	

	private static void deviceDriver() throws MalformedURLException{
		
		AndroidDevice DeviceObject = new AndroidDevice("Android","5.1.1","Galaxy S6 edge","com.blueshieldca.prod","com.blueshieldca.prod.MemberMobile",
				"C:\\app\\signed\\BS.apk","http://127.0.0.1:10160/wd/hub","");
				
		AndroidDriver driver = DeviceObject.createDeviceObject();
		
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        // click on find a provider text
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"FIND A PROVIDER\")").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	private static void emulatorDriver() throws MalformedURLException{
		
		AndroidDevice DeviceObject = new AndroidDevice("Android","6.1","Android Emulator","com.blueshieldca.prod","com.blueshieldca.prod.MemberMobile",
				"C:\\app\\signed\\BS.apk","http://127.0.0.1:10160/wd/hub","");
		
		AndroidDriver driver = DeviceObject.createDeviceObject();
		
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        // click on find a provider text
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"FIND A PROVIDER\")").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
	}
	
	public static void main (String[] args) throws MalformedURLException{
		
		//deviceDriver();
	//	emulatorDriver();
		
	
	}
	
	
	
	
	
	
	
}
