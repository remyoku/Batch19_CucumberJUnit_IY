package com.euroTech.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(xpath = "//h2")
    public WebElement userName;

    @FindBy(css = ".breadcrumb>li:nth-of-type(2)")
    public WebElement pageTitleLeftTop;

    public void verifyUsername(String expectedUsername){
        String actualUsername = userName.getText();
        Assert.assertEquals(expectedUsername, actualUsername);
    }

}
