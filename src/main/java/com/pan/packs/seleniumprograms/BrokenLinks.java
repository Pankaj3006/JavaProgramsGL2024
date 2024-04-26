package com.pan.packs.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.List;

public class BrokenLinks {

    @Test
    void mainCode() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        List<WebElement> links = driver.findElements(By.xpath("//a"));
        System.out.println(links.size());

        for(int i=0; i<links.size(); i++) {
            String url_text = links.get(i).getAttribute("href");

            URL url = new URL(url_text);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            int responseCode = connection.getResponseCode();
            if (responseCode >= 400)
                System.out.println(url_text + " : " + "is Broken Url");
            else
                System.out.println(url_text + " : " + "is Valid Url");
        }

        driver.quit();

    }

    @Test
    void test() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        List<WebElement> links = driver.findElements(By.xpath("//a"));
        System.out.println(links.size());

        for(int i=0; i<links.size(); i++) {
            String url_text = links.get(i).getAttribute("href");

            try {
                if (url_text != null) {
                    URL url = new URL(url_text);

                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    int responseCode = connection.getResponseCode();

                    if (responseCode >= 400)
                        System.out.println(url_text + " : " + "is Broken Url");
                    else
                        System.out.println(url_text + " : " + "is Valid Url");
                } else {
                    System.out.println(url_text + " : " + "Url is null");
                }
            } catch(MalformedURLException | UnknownHostException e) {
                System.out.println("Url Is Invalid");
            }
        }

        driver.quit();

    }
}
