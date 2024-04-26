package com.pan.packs.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleDynamicSearch {

    @Test
    void test() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.google.co.in/");
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("testing");
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='mkHrUc']/div/div/ul/li"));
        System.out.println(list.size());
        list.stream().filter(e->e.getText().equalsIgnoreCase("testing interview questions")).findFirst().get().click();
//        for(int i=0; i<list.size(); i++) {
//         if(list.get(i).getText().equalsIgnoreCase("testing interview questions")) {
//                list.get(i).click();
//                break;
//            }
//        }
        driver.quit();
    }
}
