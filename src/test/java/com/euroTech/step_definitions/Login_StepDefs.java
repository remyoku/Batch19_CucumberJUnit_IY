package com.euroTech.step_definitions;

import com.euroTech.pages.DashboardPage;
import com.euroTech.pages.LoginPage;
import com.euroTech.utilities.ConfigurationReader;
import com.euroTech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        //  System.out.println("The user navigate to the login page");
    }

    @When("The user enters remyoku's credentials")
    public void the_user_enters_remyoku_s_credentials() {
        //  Driver.get().findElement(By.id("email")).sendKeys(ConfigurationReader.get("email"));
        //   Driver.get().findElement(By.id("yourPassword")).sendKeys(ConfigurationReader.get("password"));
        //  Driver.get().findElement(By.xpath("//button[text()='Login']")).click();
        loginPage.login();
        //  System.out.println("The user enters remyoku's valid credentials");
    }

    @Then("The user should be able to see dashboard page")
    public void the_user_should_be_able_to_see_dashboard_page() {
      /*  String actualUserName = dashboardPage.userName.getText();
        String expectedUserName = ConfigurationReader.get("userName");
        Assert.assertEquals("İsimler aynı olmalı", expectedUserName, actualUserName);*/

        dashboardPage.verifyUsername(ConfigurationReader.get("userName"));
        //  System.out.println("The user enters the dashboard page");
    }

    @When("The user enters Mansimmo's credentials")
    public void the_user_enters_mansimmo_s_credentials() {
       /* Driver.get().findElement(By.id("email")).sendKeys(ConfigurationReader.get("mail_masimmo"));
        Driver.get().findElement(By.id("yourPassword")).sendKeys(ConfigurationReader.get("password_m"));
        Driver.get().findElement(By.xpath("//button[text()='Login']")).click();*/
        loginPage.login(ConfigurationReader.get("mail_masimmo"),ConfigurationReader.get("password_m"));
        //   System.out.println("The user enters Mansimmo's valid credentials");
    }

    @Then("The user should be able to see Mansimmo's name on the dashboard page")
    public void the_user_should_be_able_to_see_mansimmo_s_name_on_the_dashboard_page() {
//        String actualUserName = Driver.get().findElement(By.tagName("h2")).getText();
       // String expectedUserName = ConfigurationReader.get("userName_m");
//        Assert.assertEquals("İsimler aynı olmalı", expectedUserName, actualUserName);
        dashboardPage.verifyUsername(ConfigurationReader.get("userName_m"));

    }

    @When("The user enters Mike's credentials")
    public void the_user_enters_mike_s_credentials() {
        //  System.out.println("The user enters Mike's valid credentials");
    }

    @When("The user enters Rosa's credentials")
    public void the_user_enters_rosa_s_credentials() {
        //   System.out.println("The user enters Rosa's valid credentials");


    }

    @When("The user enters Leroy's credentials")
    public void the_user_enters_leroy_s_credentials() {
        //  System.out.println("The user enters Leroy's valid credentials");

    }

}
