package com.contract.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ContractTest {
	
AppiumDriver driver;

  @Test
  public void contracAddTest() {
	  
	  driver.findElement(By.id("com.google.android.contacts:id/floating_action_button")).click();
	  
//	  driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Create contact']")).click();
  
  }
  @BeforeTest
  public void setUp() throws MalformedURLException {
	  DesiredCapabilities caps = new DesiredCapabilities();
	  caps.setCapability("deviceName", "motog");
	  caps.setCapability("platformName", "Android");
	  caps.setCapability("platformVersion", "10");
	  caps.setCapability("automationName", "UiAutomator2");
	  caps.setCapability("appPackage", "com.google.android.contacts");
	  caps.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
	  
	  driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
  }

  @AfterTest
  public void tearDownTest() {
	  
	  if(null != driver) {
		  driver.quit();
	  }
  }

}
