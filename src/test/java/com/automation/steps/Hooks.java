package com.automation.steps;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void setUp() {

        DriverManager.createDriver();
        ConfigReader.initConfig();
    }

    @After
    public void cleanUp() {

        DriverManager.getDriver().quit();
    }
}
