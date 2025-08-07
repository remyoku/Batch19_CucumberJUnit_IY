package com.euroTech.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefs {
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("The user navigate to the login page");
    }
    @When("The user enters remyoku's credentials")
    public void the_user_enters_remyoku_s_credentials() {
        System.out.println("The user enters remyoku's valid credentials");
    }
    @Then("The user should be able to see dashboard page")
    public void the_user_should_be_able_to_see_dashboard_page() {
        System.out.println("The user enters the dashboard page");
    }
    @When("The user enters Mansimmo's credentials")
    public void the_user_enters_mansimmo_s_credentials() {
        System.out.println("The user enters Mansimmo's valid credentials");
    }
    @When("The user enters Mike's credentials")
    public void the_user_enters_mike_s_credentials() {
        System.out.println("The user enters Mike's valid credentials");
    }

}
