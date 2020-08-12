package com.testinium.test;

import com.testinium.base.BasePage;
import com.testinium.base.BaseTest;
import com.testinium.page.DemoPage;
import com.testinium.page.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class DemoPageTest extends BaseTest {

    DemoPage demoPage;
    LoginPage loginPage;

    @Before
    public void before() {

        demoPage = new DemoPage(getDriver());
        getDriver().navigate().to("https://www.google.com.tr");
    }

    @Test
    public void wakeUpChromeTest() throws InterruptedException {
        demoPage.getLoginPage().login().getDemoPage().wakeUpChrome();
        demoPage.analyzeLog();
    }

    @Test
    public void sendKeysTest() throws InterruptedException {
        demoPage.sendKeysTest();
    }

    @Test
    public void denemeTest()
    {
        getDriver().get("https://www.w3schools.com/");
        BasePage basePage=new BasePage(getDriver());
        basePage.clickElement(By.cssSelector("#main .w3-col a[href='/tags/default.asp']"));

    }

    @Test
    public void deneme2Test() throws InterruptedException {
        getDriver().navigate().to("https://www.hepsiburada.com");
        BasePage basePage=new BasePage(getDriver());
        getDriver().findElement(By.id("SearchBoxOld")).sendKeys("araba");
    }

}
