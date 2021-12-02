package com.gittigidiyor.test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class BaseTest {
    WebDriver driver;


    @BeforeAll
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);
        driver.get("https://www.gittigidiyor.com/");
        driver.manage().window().maximize();



    }
    @AfterAll
    public void tearDown(){
       driver.quit();



    }
}
