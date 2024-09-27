package com.automation;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.print.PrintOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static javax.swing.text.StyleConstants.Orientation;

public class DemoClass {

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("app", "C:\\Users\\280709\\Downloads\\expedia.apk");  // The filename of the mobile app
        caps.setCapability("deviceName", "emulator-5554");
//        caps.setCapability("appium:platformVersion", "12.0");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appWaitForLaunch", "false");
        //caps.setCapability("appPackage", "com.swaglabsmobileapp");
        caps.setCapability("appPackage", "com.expedia.bookings");
        //caps.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");
        caps.setCapability("appActivity", "com.expedia.bookings.activity.SearchActivity");
//        caps.setCapability("Orientation","LANDSCAPE");

//        DesiredCapabilities sauceOptions = new DesiredCapabilities();
//        sauceOptions.setCapability("username", "oauth-avanikgirish1-5652c");
//        sauceOptions.setCapability("accessKey", "f4cad633-2785-4b63-b649-0c9089deef96");
//        sauceOptions.setCapability("build", "appium-test-build");
//        sauceOptions.setCapability("name", "<My First Mobile Automation Test>");
//        sauceOptions.setCapability("deviceOrientation", "PORTRAIT");
//        caps.setCapability("sauce:options", sauceOptions);


        URL url = new URL("http://127.0.0.1:4723");
        AppiumDriver driver=new AndroidDriver(url,caps);

    }
}
