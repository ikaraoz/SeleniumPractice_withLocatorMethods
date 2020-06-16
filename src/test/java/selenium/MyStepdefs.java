package selenium;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static selenium.SeleniumHelper.*;

public class MyStepdefs {


    @Given("the manager is at {string}")
    public void theManagerIsAt(String url) {
        navigateHelper(url);
    }

    @When("the manager gets the list of {string}")
    public void theManagerGetsTheListOf(String name) {
        listHelper(name);
    }

    @Then("the manager verifies {string} is in the list")
    public void theManagerVerifiesIsInTheList(String expectedName) {
        assertNamesHelper(expectedName);
    }


    @And("the manager verifies {string} works at {string}")
    public void theManagerVerifiesWorksAt(String employee, String expectedOffice) {
        verifyOfficeHelper(employee, expectedOffice);
    }


}
