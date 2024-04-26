package com.pan.packs.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Calendar {

    WebDriver driver;

    @AfterTest
    void tearDown() {
        driver.quit();
    }

    @Test
    void calendarTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://admin-demo.nopcommerce.com/login");
        driver.findElement(By.xpath("//input[@id='Email']")).clear();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
        driver.findElement(By.xpath("//input[@id='Password']")).clear();
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        driver.findElement(By.xpath("//nav[@class='mt-2']/ul/li/a/p[contains(text(), 'Promotions')]")).click();
        driver.findElement(By.xpath(
                "//nav[@class='mt-2']/ul/li/a/p[contains(text(), 'Promotions')]/ancestor::li/ul/li/a/p[contains(text(), 'Discounts')]")).click();

        driver.findElement(By.xpath("//input[@id='SearchStartDate']/parent::span/span[@role='button']")).click();
        while(!driver.findElement(By.xpath("//div[@class='k-header']/a[2]")).getText().equalsIgnoreCase("December 2022"))
        {
            driver.findElement(By.xpath("//div[@class='k-header']/a/span[@class='k-icon k-i-arrow-60-left']")).click();
        }

        boolean flag = false;
        for(int rowNum=1; rowNum<=6; rowNum++) {
            for(int colNum=1; colNum<=7; colNum++) {
                if(driver.findElement(By.xpath(
                        "//div[@class='k-calendar-view']/table/tbody/tr["+rowNum+"]/td["+colNum+"]/a")).getAttribute("title").contains("December 7")) {
                    driver.findElement(By.xpath("//div[@class='k-calendar-view']/table/tbody/tr["+rowNum+"]/td["+colNum+"]/a")).click();
                    flag = true;
                    break;
                }
            }
            if(flag)
                break;
        }

        driver.findElement(By.xpath("//input[@id='SearchEndDate']/parent::span/span[@role='button']")).click();
        while(!driver.findElement(By.xpath("//div[@id='SearchEndDate_dateview']/descendant::div[@class='k-header']/a[2]")).getText().equalsIgnoreCase("December 2023"))
        {
            driver.findElement(By.xpath("//div[@id='SearchEndDate_dateview']/descendant::div[@class='k-header']/a/span[@class='k-icon k-i-arrow-60-left']")).click();
        }


        flag = false;
        for(int rowNum=1; rowNum<=6; rowNum++) {
            for(int colNum=1; colNum<=7; colNum++) {
                if(driver.findElement(By.xpath(
                        "//div[@id='SearchEndDate_dateview']/descendant::div[@class='k-calendar-view']/table/tbody/tr["+rowNum+"]/td["+colNum+"]/a")).getAttribute("title").contains("December 27")) {
                    driver.findElement(By.xpath("//div[@id='SearchEndDate_dateview']/descendant::div[@class='k-calendar-view']/table/tbody/tr["+rowNum+"]/td["+colNum+"]/a")).click();
                    flag = true;
                    break;
                }
            }
            if(flag)
                break;
        }

        Select select = new Select(driver.findElement(By.xpath("//select[@id='SearchDiscountTypeId']")));
        select.selectByValue("1");

        driver.findElement(By.xpath("//button[@id='search-discounts']")).click();

        Thread.sleep(3000);
    }
}
