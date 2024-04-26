package com.pan.packs.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MultipleWindowsHandling {

    @Test
    void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://the-internet.herokuapp.com/");
//        driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
//        //Thread.sleep(3000);
//        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
//        Set<String> multipleWindows = driver.getWindowHandles();
//        Iterator<String> itr = multipleWindows.iterator();
//        String parentWindow = itr.next();
//        String childWindow = itr.next();
//        driver.switchTo().window(childWindow);
//        driver.findElement(By.xpath("//h3[starts-with(text(), 'New')]"));
//        System.out.println(driver.getTitle());
//        driver.switchTo().window(parentWindow);
//        driver.findElement(By.xpath("//div/div/h3"));
//        System.out.println(driver.getTitle());
//        driver.quit();

        driver.get("https://www.amazon.in/");
        //*[@id='navFooter']/div[4]/ul
        WebElement headDriver = driver.findElement(By.xpath("//div[@id='rhf']/following-sibling::div/div[4]/ul"));
        System.out.println(headDriver.findElements(By.tagName("a")).size());
        List<WebElement> links= headDriver.findElements(By.tagName("a"));
        for(int i=0; i<links.size(); i++)
        {
            String keys = Keys.chord(Keys.CONTROL, Keys.ENTER);
            links.get(i).sendKeys(keys);
        }
        String parentWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();

        Iterator<String> str = windows.iterator();
        while(str.hasNext())
        {
            String s = str.next();
            if(driver.switchTo().window(s).getTitle().contains("Spend less")) {
               //Thread.sleep(3000);
             //  driver.findElement(By.xpath("//div[@class='navFooterColHead'][contains(text(), 'Make')]/parent::div/ul/li/a[text()='Supply to Amazon']"));
                System.out.println("Found correct window");
                System.out.print(driver.getCurrentUrl() + " : ");
                System.out.println(driver.getTitle());
            }
        }


        closeAllWindows(driver, windows, parentWindow);
        driver.switchTo().window(parentWindow);

        //Thread.sleep(3000);
        //driver.quit();
        System.out.println("Browser closed");
    }

    private static void closeAllWindows(WebDriver driver, Set<String> set, String parentWindowId) {
        Iterator<String> str = set.iterator();
        while(str.hasNext()) {
            String s = str.next();
            if (!s.equals(parentWindowId)) {
                driver.switchTo().window(s).close();
            }
        }
    }
}
