package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.lang.module.Configuration;
import java.util.ConcurrentModificationException;

public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();
    @Given("the user on the login page")
    public void the_user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Given("the user is logged in with valid credentials")
    public void the_user_is_logged_in_with_valid_credentials() {
    loginPage.login();
    }
    @Then("the user should see the title {string}")
    public void the_user_should_see_the_url(String expectedTitle) {
        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());

    }

}
