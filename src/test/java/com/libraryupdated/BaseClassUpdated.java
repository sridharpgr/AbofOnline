package com.libraryupdated;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class BaseClassUpdated {
	
	public DesiredCapabilities dc;
	public static String sDirPath = System.getProperty("user.dir");
	public String apkFilePath = sDirPath+"\\ApkFile_Updated\\abof_com.abof.android.apk";
	public AndroidDriver driver;
	
	@Parameters({"port", "deviceName", "platformVersion"})
	@BeforeMethod
	public void setUp(String port, String deviceName, String platformVersion) throws MalformedURLException{
		dc = new DesiredCapabilities();
		dc.setCapability("automationName", GenericClassUpdated.getDataProperties("AUTOMATIONNAME"));
		dc.setCapability("planformName", GenericClassUpdated.getDataProperties("PLATFORMNAME"));
		dc.setCapability("deviceName", deviceName);
		dc.setCapability("platformVersion", platformVersion);
		dc.setCapability("appPackage", GenericClassUpdated.getDataProperties("APPPACKAGE"));
		dc.setCapability("appActivity", GenericClassUpdated.getDataProperties("APPACTIVITY"));
		driver = new AndroidDriver(new URL("http://127.0.0.1:"+port+"/wd/hub"), dc);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
