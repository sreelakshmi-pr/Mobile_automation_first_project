package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {
    HomePage homePage = new HomePage();

    @Given("user open application")
    public void user_open_application() {
        homePage.openApplication();
    }

    @Then("verify user is on home screen")
    public void verify_user_is_on_home_screen() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }

    @When("user click on Flights menu")
    public void user_click_on_flights_menu() {
        homePage.clickOnFlightTab();
    }
}
