package com.pan.packs.seleniumprograms;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class DesiredCapabilitiesDemo {

    @Test
    void test() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setAcceptInsecureCerts(true);

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.merge(caps);
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        //driver.manage().window().maximize();
        driver.get("https://bo1cvc01.schq.secious.com/ui/");
    }
}
