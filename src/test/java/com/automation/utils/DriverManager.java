package com.automation.utils;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;

public class DriverManager {

    static AndroidDriver driver;

    public static void createDriver() {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("automationName","UiAutomator2");
            capabilities.setCapability("deviceName", "emulator-5554");
            capabilities.setCapability("app", "C:\\Users\\280709\\Downloads\\expedia.apk");
            capabilities.setCapability("appActivity","com.expedia.bookings.activity.SearchActivity");
            capabilities.setCapability("appPackage","com.expedia.bookings");

            driver = new AndroidDriver(capabilities);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));


        }

    public static AppiumDriver getDriver() {
        return driver;
    }
}
