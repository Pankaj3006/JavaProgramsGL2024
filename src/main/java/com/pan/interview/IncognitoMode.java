package com.pan.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class IncognitoMode {

    WebDriver  driver;

    @BeforeMethod
    void beforeMethod() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
    }

    @AfterMethod
    void afterMethod() {
        driver.quit();
    }

    @Test
    void test() throws IOException {
        List<WebElement> list = driver.findElements(By.xpath("//a"));

        for(int i=0; i< list.size(); i++) {
            String url_text = list.get(i).getAttribute("href");

            URL url = new URL(url_text);
            HttpURLConnection  connection = (HttpURLConnection) url.openConnection();
            int code = connection.getResponseCode();

            if(code>=400)
                System.out.println(url_text + " :is broken Url");
            else
                System.out.println(url_text + " :is Valid Url");
        }
    }
}
