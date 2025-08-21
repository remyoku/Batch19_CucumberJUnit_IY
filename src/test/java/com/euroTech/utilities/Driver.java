package com.euroTech.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {

    private Driver() {
    }

    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    //  private static WebDriver driver;

    public static WebDriver get() {
        if (driverPool.get() == null) {
            String browser = System.getProperty("browser") != null ? browser = System.getProperty("browser") : ConfigurationReader.get("browser");

            switch (browser.toLowerCase()) {
                case "chrome":
                    driverPool.set(new ChromeDriver());
                    break;
                case "chrome-headless":
                    driverPool.set(new ChromeDriver(new ChromeOptions().addArguments("--headless")));
                    break;
                case "firefox":
                    driverPool.set(new FirefoxDriver());
                    break;
                case "firefox-headless":
                    driverPool.set(new FirefoxDriver(new FirefoxOptions().addArguments("--headless")));
                    ;
                    break;
                case "edge":
                    if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                        throw new WebDriverException("Your OS does not support Edge");
                    }
                    driverPool.set(new EdgeDriver());
                    break;
            }
        }

        return driverPool.get();
    }

    public static void closeDriver(){
        if (driverPool != null){
            driverPool.get().quit();
            driverPool.remove();
        }
    }


}
