package com.testinium.test;

import com.testinium.base.BaseTest;
import com.testinium.page.DemoPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.concurrent.TimeUnit;

public class DenemeTest extends BaseTest {


    DemoPage demoPage;

    @Test
    public void wakeUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","properties/driver/chromedriver.exe");
        WebDriver driver;

        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-popup-blocking");
        options.addArguments("test-type");
        driver=new ChromeDriver(options);


        driver.navigate().to("https://www.trendyol.com");
        WebElement element= driver.findElement(By.xpath("//input[@class=\"search-box\"]"));
        TimeUnit.SECONDS.sleep(1);
        element.sendKeys("araba");
        TimeUnit.SECONDS.sleep(1);

        WebElement arama=driver.findElement(By.cssSelector("i[class='search-icon']"));
        TimeUnit.SECONDS.sleep(5);
        arama.click();


    }
    @Test
    public void deneme()
    {

        DemoPage demoPage=new DemoPage(getDriver());



    }
}
