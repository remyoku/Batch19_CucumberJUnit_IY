package com.euroTech.step_definitions;

import com.euroTech.pages.DashboardPage;
import com.euroTech.pages.LoginPage;
import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.ConfigurationReader;
import com.euroTech.utilities.Driver;
import com.euroTech.utilities.ExcelUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

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
        loginPage.login(ConfigurationReader.get("mail_masimmo"), ConfigurationReader.get("password_m"));
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
        loginPage.login(ConfigurationReader.get("mail_mike"), ConfigurationReader.get("password_mike"));
    }

    @When("The user enters Rosa's credentials")
    public void the_user_enters_rosa_s_credentials() {
        //   System.out.println("The user enters Rosa's valid credentials");
        loginPage.login(ConfigurationReader.get("mail_rosa"), ConfigurationReader.get("password_r"));


    }

    @When("The user enters Leroy's credentials")
    public void the_user_enters_leroy_s_credentials() {
        //  System.out.println("The user enters Leroy's valid credentials");
        loginPage.login(ConfigurationReader.get("mail_learoy"), ConfigurationReader.get("password_l"));
    }

    @Then("The user should be able to see Mike's name on the dashboard page")
    public void the_user_should_be_able_to_see_mike_s_name_on_the_dashboard_page() {
        dashboardPage.verifyUsername(ConfigurationReader.get("userName_mike"));
    }

    @Then("The user should be able to see Rosa's name on the dashboard page")
    public void the_user_should_be_able_to_see_rosa_s_name_on_the_dashboard_page() {
        dashboardPage.verifyUsername(ConfigurationReader.get("userName_r"));
    }

    @Then("The user should be able to see Leeroy's name on the dashboard page")
    public void the_user_should_be_able_to_see_leeroy_s_name_on_the_dashboard_page() {
        dashboardPage.verifyUsername(ConfigurationReader.get("userName_l"));

    }

    @When("The user logins with {string} and {string}")
    public void the_user_logins_with_and(String email, String password) {
        loginPage.login(email, password);
    }

    @Then("The user should be able to {string} on dashboard page")
    public void the_user_should_be_able_to_on_dashboard_page(String username) {
        dashboardPage.verifyUsername(username);
    }

    @Then("The number is {int}")
    public void the_number_is(Integer intNumber) {
        System.out.println(intNumber);
    }

    @Then("The number also is {double}")
    public void the_number_also_is(Double doubleNumber) {
        System.out.println(doubleNumber);
    }

    @Then("The number can be {double}")
    public void the_number_can_be(double double1Number) {
        System.out.println(double1Number);
    }

    @When("The user login and verify with following credentials")
    public void the_user_login_and_verify_with_following_credentials(List<String> credentials) {
        loginPage.login(credentials.get(0), credentials.get(1));
        dashboardPage.verifyUsername(credentials.get(2));

    }

    @When("The user login and verify with following credentials map")
    public void the_user_login_and_verify_with_following_credentials_map(Map<String, String> credentialsMap) {
        loginPage.login(credentialsMap.get("user_email"), credentialsMap.get("password"));
        dashboardPage.verifyUsername(credentialsMap.get("user_name"));
    }

    @Then("The user should be able to see warning {string}")
    public void the_user_should_be_able_to_see_warning(String warningMessage) {
        loginPage.verifyWarningMessage(warningMessage);
    }

    @When("The user logins with using excel file: {string} and {string} and {int}")
    public void the_user_logins_with_using_excel_file_and_and(String path, String sheetName, int row) {
        List<Map<String, String>> excelData = BrowserUtils.getExcelDataToListOfMap(path, sheetName);

        String yourEmail = excelData.get(row).get("Your Email");
        String password = excelData.get(row).get("Password");
        loginPage.login(yourEmail, password);

    }

    @Then("The user verifies success login with excel file: {string} and {string} and {int}")
    public void the_user_verifies_success_login_with_excel_file_and_and(String path, String sheetName, int row) {
        List<Map<String, String>> excelData = BrowserUtils.getExcelDataToListOfMap(path, sheetName);
        String exceptedUserName = excelData.get(row).get("Your Name");
        dashboardPage.verifyUsername(exceptedUserName);
    }

    @When("The user logins with using excel file: {int}")
    public void the_user_logins_with_using_excel_file(int row) {
        List<Map<String, String>> excelData = BrowserUtils.getExcelDataToListOfMap(ConfigurationReader.get("excelPath"), ConfigurationReader.get("sheet"));
        String yourEmail = excelData.get(row).get("Your Email");
        String password = excelData.get(row).get("Password");
        loginPage.login(yourEmail, password);
    }

    @Then("The user verifies success login with excel file: {int}")
    public void the_user_verifies_success_login_with_excel_file(int row) {
        List<Map<String, String>> excelData = BrowserUtils.getExcelDataToListOfMap(ConfigurationReader.get("excelPath"),ConfigurationReader.get("sheet"));
        String exceptedUserName = excelData.get(row).get("Your Name");
        dashboardPage.verifyUsername(exceptedUserName);
    }
    @When("The user logins with using excel file: {string} and {string} and makes verify")
    public void the_user_logins_with_using_excel_file_and_and_makes_verify(String path, String sheetName) {
        List<Map<String, String>> excelData = BrowserUtils.getExcelDataToListOfMap(path, sheetName);
        int rowCount = excelData.size();
        for (int i = 0; i < rowCount; i++) {
            String yourEmail = excelData.get(i).get("Your Email");
            String password = excelData.get(i).get("Password");
            loginPage.login(yourEmail,password);

            String exceptedUserName = excelData.get(i).get("Your Name");
            dashboardPage.verifyUsername(exceptedUserName);

            dashboardPage.navigateToTabs(exceptedUserName,"Sign Out");

            loginPage.getLoginLink().click();
        }
    }


}


