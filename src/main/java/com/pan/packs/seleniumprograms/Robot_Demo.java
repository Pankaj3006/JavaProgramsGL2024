package com.pan.packs.seleniumprograms;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Collections;

public class Robot_Demo {

    @Test
    void test() throws AWTException {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://the-internet.herokuapp.com/tables");
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_DOWN);
//        robot.keyPress(KeyEvent.VK_DOWN);

        Proxy proxy = new Proxy();
        proxy.setHttpProxy("192.168.100.101:8080");

        DesiredCapabilities cap= new DesiredCapabilities();
        cap.setCapability(CapabilityType.PROXY,proxy);

        ChromeOptions options = new ChromeOptions();
        options.merge(cap);
        options.addArguments("--incognito");
        options.addArguments("--headless");
        options.setAcceptInsecureCerts(true);
        options.addArguments("--start-maximized");
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
       // options.setCapability(CapabilityType.PROXY, proxy);
        //options.setProxy(proxy);

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");
    }
}
