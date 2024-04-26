package com.pan.packs.seleniumprograms.selenium4programs;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Selenium4Features {

    @Test
    void getElementDimensions() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']/img"));
        System.out.println("X Co-ordinate: " + logo.getRect().getX());
        System.out.println("Y Co-ordinate: " + logo.getRect().getY());
        System.out.println("Height: " + logo.getRect().getDimension().getHeight());
        System.out.println("Width: " + logo.getRect().getDimension().getWidth());
        driver.quit();
    }

    @Test
    void getElementScreenshot() throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']/img"));
        File srcFile = logo.getScreenshotAs(OutputType.FILE);
        File trgFile = new File("logo.png");
        FileUtils.copyFile(srcFile, trgFile);
        driver.quit();
    }

    @Test
    void getNewTab() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.co.in/");
        driver.quit();
    }

    @Test
    void getNewWindow() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.google.co.in/");
        driver.quit();
    }
}
