package com.pan.packs.seleniumprograms;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import java.util.Set;

public class CookiesDemo {

    @Test
    void test() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        WebDriver driver  = new FirefoxDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        System.out.println(driver.manage().getCookieNamed("NID"));
        Set<Cookie> cookieSet = driver.manage().getCookies();
        System.out.println("Total Cookies are: "+ cookieSet.size());
        for(Cookie cookie:cookieSet) {
            System.out.println(cookie.getName()+"-->"+cookie.getValue());
        }

        System.out.println("***********************");

        Cookie cookie = new Cookie("MyCookie", "MyValue");
        driver.manage().addCookie(cookie);

        cookieSet = driver.manage().getCookies();
        System.out.println("Total Cookies are: "+ cookieSet.size());
        for(Cookie cookie1:cookieSet) {
            System.out.println(cookie1.getName()+"-->"+cookie1.getValue());
        }

        System.out.println("***********************");
        driver.manage().deleteCookie(cookie);
        cookieSet = driver.manage().getCookies();
        System.out.println("Total Cookies are: "+ cookieSet.size());
        for(Cookie cookie1:cookieSet) {
            System.out.println(cookie1.getName()+"-->"+cookie1.getValue());
        }

        driver.manage().deleteAllCookies();
        cookieSet = driver.manage().getCookies();
        System.out.println("Total Cookies are: "+ cookieSet.size());

        driver.quit();

    }
}
