package com.pan.packs.jsonprograms;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ORangeHRMDemo {
    WebDriver driver;

    @BeforeTest
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterTest
    void tearDown() {
        driver.quit();
    }

    @Test(dataProvider = "provideData")
    void test(String userData) {
        String[] creds = userData.split(",");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys(creds[0]);
        driver.findElement(By.name("password")).sendKeys(creds[1]);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String actualTitle = driver.getTitle();
        String expectedTitle ="OrangeHRM";
        Assert.assertEquals(actualTitle, expectedTitle);
        driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
        driver.findElement(By.linkText("Logout")).click();
    }

    @DataProvider
    Object[] provideData() throws IOException, ParseException {

        JSONParser jsonParser = new JSONParser();
        FileReader fileReader = new FileReader(System.getProperty("user.dir")+"/TestData.json");

        Object obj = jsonParser.parse(fileReader);
        JSONObject jsonObject = (JSONObject)obj;

        JSONArray jsonArray = (JSONArray)jsonObject.get("Credentials");
        Object[] array = new Object[jsonArray.size()];
        for(int i=0; i<jsonArray.size(); i++) {
            JSONObject object = (JSONObject) jsonArray.get(i);
            String username = (String)object.get("username");
            String pwd = (String)object.get("password");

            array[i] = username+","+pwd;
        }

        return array;
    }






}
