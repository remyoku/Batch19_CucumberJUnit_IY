package com.euroTech.step_definitions;

import com.euroTech.pages.DashboardPage;
import com.euroTech.pages.DevelopersPage;
import com.euroTech.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hu.De;
import org.junit.Assert;

import java.util.List;

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


    @Then("The user should verify the dashboard tabs with follows")
    public void the_user_should_verify_the_dashboard_tabs_with_follows(List<String > dashboardTabsTexts) {
        List<String> actualTabTexts = dashboardPage.getDashboardTabsTexts();

        Assert.assertEquals(dashboardTabsTexts,actualTabTexts);
    }
    @Then("The user should be able to see related page title with three parts : {string}")
    public void the_user_should_be_able_to_see_related_page_title_with_three_parts(String pageTitle) {
      Assert.assertEquals(pageTitle,developersPage.getPageTitleWithModule());
    }
    @Then("The user should be able to see related page title with two parts : {string}")
    public void the_user_should_be_able_to_see_related_page_title_with_two_parts(String exceptedTab) {
       String actualTab= dashboardPage.getPageTitleWithTab();
       Assert.assertEquals(exceptedTab,actualTab);
    }


}
