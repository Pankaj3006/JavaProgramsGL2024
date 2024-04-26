package com.pan.packs.java8programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasicTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElements(By.xpath("//a"))
                .stream()
                .map(e->e.getText())
                .filter(s->!s.isBlank())
                .distinct()
                .sorted()
                .filter(s->s.startsWith("C")||s.startsWith("D"))
                .forEach(System.out::println);


//        List<WebElement> list = driver.findElements(By.xpath("//a"));
//        System.out.println(list.size());
//
//        List<String> linkText = new ArrayList<>();
//
//        for(int i=0; i<list.size(); i++) {
//            if(!list.get(i).getText().isBlank())
//                linkText.add(list.get(i).getText());
//        }
//
//        Set<String> set = new TreeSet<>(linkText);
//        Iterator itr = set.iterator();
//        while(itr.hasNext()) {
//            String link = (String)itr.next();
//            if(link.startsWith("C") || link.startsWith("D")) {
//                System.out.println(link);
//            }
//        }

        driver.close();
    }
}
