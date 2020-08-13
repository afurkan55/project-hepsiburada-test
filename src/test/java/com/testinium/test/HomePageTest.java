package com.testinium.test;

import com.testinium.base.BasePage;
import com.testinium.base.BaseTest;
import com.testinium.page.HomePage;
import com.testinium.page.LoginPage;
import com.testinium.page.MenuPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.testinium.constants.ConstantLoginPage.*;
import static com.testinium.constants.ConstantsMenuPage.MENU;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePageTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;
    MenuPage menuPage;

    @Before
    public void before() {

        homePage = new HomePage(getDriver());
        loginPage= new LoginPage(getDriver());
        menuPage=new MenuPage(getDriver());

    }
    @Test
    public void homePageTest() throws InterruptedException {
        homePage.getHomePage().homePage();
        homePage.analyzeLog();

    }

    @Test
    public void loginPageTest() throws InterruptedException {
        loginPage.getHomePage().homePage();
        TimeUnit.SECONDS.sleep(5);
        loginPage.hoverElement(BUTTON_HOVER);
        TimeUnit.SECONDS.sleep(3);
        loginPage.getLoginPage().login();
        loginPage.analyzeLog();
    }


    @Test
    public void loginPageControlTest() throws InterruptedException {

        loginPageTest();
        loginPage.loginContol();
    }

    @Test
    public void categoryTest() throws InterruptedException {
        homePageTest();
        menuPage.getMenuPage().randomItem();
        menuPage.randomBrand();
    }




}
