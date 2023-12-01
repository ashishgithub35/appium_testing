package com.mobile.appiumscript;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileTest {

	private AppiumDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeSuite
	public void launchApp() throws MalformedURLException {
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Realme 8");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.APP, "");
		caps.setCapability(MobileCapabilityType.UDID, "");
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
		driver= new AndroidDriver(url, caps);
		
	}

	@Test
	public void start() {
		System.out.println("Here we have to write our code such as findElement");
	}

	@AfterSuite
	public void stopServer() {

	}
}
