package com.euroTech.pages;

import com.euroTech.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id="email")
    private WebElement emailBox;

    @FindBy(id="yourPassword")
    private WebElement passwordBox;

    @FindBy (xpath = "//button")
    private WebElement loginBtn;


    public void login(){
        emailBox.sendKeys(ConfigurationReader.get("email"));
        passwordBox.sendKeys(ConfigurationReader.get("password"));
        loginBtn.click();
    }
    public void login(String email, String password){
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        loginBtn.click();
    }

}
