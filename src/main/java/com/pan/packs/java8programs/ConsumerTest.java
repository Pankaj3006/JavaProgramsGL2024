package com.pan.packs.java8programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;
import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Pankaj", "Gupta", "Divyank");

        list.forEach(e-> System.out.println(e));


        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.in");
        List<WebElement> list1 = driver.findElements(By.xpath("//a"));
        Consumer<WebElement> con1 = s-> System.out.println(s.getText());
        Consumer<WebElement> con2 = s-> {
            if(!s.getText().isBlank())
                System.out.println(s.getText());
        };
        list1.forEach(con2);
        driver.quit();
    }
}
