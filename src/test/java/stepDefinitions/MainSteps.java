package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class MainSteps
{
    @Given("User is on NetBanking landing page")
    public void user_is_on_net_banking_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on NetBanking landing page");
    }
    @When("User login into application with {string} and password {string}")
    public void user_login_into_application_with_and_password(String user, String password)
    {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User login into application with details user: " + user + " and password: " + password);
    }

    @When("User login into application with {string} and password {string} parameterized")
    public void user_login_into_application_with_and_password_parameterized(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User login into application with details user: " + string + " and password: " + string2);
    }

    @Then("Home Page is displayed")
    public void home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Home Page is displayed");
    }
    @Then("Cards are displayed")
    public void cards_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cards are displayed");
    }

}
