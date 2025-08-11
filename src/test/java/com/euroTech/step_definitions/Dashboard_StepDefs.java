package com.euroTech.step_definitions;

import com.euroTech.pages.DashboardPage;
import com.euroTech.pages.DevelopersPage;
import com.euroTech.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hu.De;
import org.junit.Assert;

public class Dashboard_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();
    DevelopersPage developersPage = new DevelopersPage();

    @When("The user clicks on developers link")
    public void the_user_clicks_on_developers_link() {
        // System.out.println("The user clicks on Developer link ");
        loginPage.navigateToTabs("Developers");
        dashboardPage.navigateToTabs("Developers");
    }

    @Then("The user should be able to see developers page title")
    public void the_user_should_be_able_to_see_developers_page_title() {
        // System.out.println("The user should be able to see developers page title");
       /* String actualTitle = developersPage.getPageTitle();
        String exceptedTitle = "Developers";
        Assert.assertEquals(exceptedTitle,actualTitle);*/
        developersPage.verifyPageTitle("Developers");

        System.out.println("developersPageTitle =  " + developersPage.getDevelopersPageTitle().getText());
    }

    @When("The user clicks on tab : {string} and module: {string}")
    public void the_user_clicks_on_tab_and_module(String tabName, String module) {
        dashboardPage.navigateToTabs(tabName, module);
    }

    @Then("The user should be able to see related page title : {string}")
    public void the_user_should_be_able_to_see_related_page_title(String pageTitle) {
      //  developersPage.getPageTitleWithTab();
        developersPage.getPageTitleWithModule();
    }

}
