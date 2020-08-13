package com.testinium.page;

import com.testinium.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.testinium.constants.ConstantLoginPage.*;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public LoginPage login() throws InterruptedException {
        hoverElement(BUTTON_MLOGIN);
        TimeUnit.SECONDS.sleep(3);
        clickElement(BUTTON_MLOGIN);
        TimeUnit.SECONDS.sleep(3);
        sendKeys(EMAIL,"selenium.trendyol@gmail.com");
        sendKeys(PASSWORD,"A.123456789");
        clickElement(BUTTON_LOGIN);


        return this;
    }

    public LoginPage loginContol()
    {
        String attr= getAttribute(LOGIN_TEXT,"title");
        System.out.println(attr);
        if(attr.equals("Hesabım")) {
            System.out.println("Login Basarili");
            basketCount();
        }
        else
            System.out.println("Login Basarisiz");

        return this;
    }

    public LoginPage basketCount()
    {
        WebElement sepet_tutar= findElement(BASKET);
        System.out.println("Sepet Urun Miktari: "+sepet_tutar.getText()+" Adet");
        System.out.println("Sepet kontrol edildi");

        return this;
    }
}
