package com.pan.packs.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class ActionsClass {

    WebDriver driver;

    @AfterTest
    void tearDown() {
        driver.quit();
    }

    @Test
    void mouseHoverTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.orangehrm.com/");
        Actions actions = new Actions(driver);
        WebElement solutions = driver.findElement(By.xpath("//div[@id='navbarSupportedContent']/ul/li/a[text()='Solutions']"));
        WebElement compensation = driver.findElement(By.xpath("//div[@class='secondary-menu']/ul/li[1]"));
        actions.moveToElement(solutions).moveToElement(compensation).build().perform();

        Thread.sleep(3000);
    }

    @Test
    void rightClickTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        Actions actions = new Actions(driver);
        WebElement link = driver.findElement(By.xpath("//div[@class='document']/p/span"));
       // actions.contextClick(link).build().perform();
        actions.moveToElement(link).contextClick().build().perform();
        driver.findElement(By.xpath("//ul/li[4]/span")).click();
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
    }

    @Test
    void dragAndDropTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions actions = new Actions(driver);
        WebElement source = driver.findElement(By.id("box3"));
        WebElement target = driver.findElement(By.id("box103"));
        //actions.dragAndDrop(source, target).build().perform();
        actions.clickAndHold(source).moveToElement(target).release().build().perform();

        Thread.sleep(2000);
    }

    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList();
        l.add("pankaj");

        String s=l.get(0);
        System.out.println(s);
    }
}
