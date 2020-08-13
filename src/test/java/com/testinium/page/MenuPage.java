package com.testinium.page;

import com.testinium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static com.testinium.constants.ConstantsMenuPage.*;

public class MenuPage extends BasePage {
    public MenuPage(WebDriver driver) {
        super(driver);
    }

    public void randomItem() throws InterruptedException {
        List<WebElement> menu= findElements(MENU);
        System.out.println("Toplam menü sayısı: " +menu.size());

        Random random= new Random();
        int i = random.nextInt(menu.size());
        WebElement randomElement = menu.get(i);
        randomElement.click();
        TimeUnit.SECONDS.sleep(3);
        System.out.println(i+1+" . menuye tiklandi");

        if(i==0){

            List<WebElement> elektronikList = findElements(MENU_ELEKTRONIK);
            System.out.println("Toplam alt kategori: "+elektronikList.size());
            WebElement randomElektronik = elektronikList.get(random.nextInt(elektronikList.size()));
            randomElektronik.click();
            TimeUnit.SECONDS.sleep(3);

        }
        else
        {

            List<WebElement> otherMenuList = findElements(MENU_OTHER);
            System.out.println("Number of alt kategori: " +otherMenuList.size() );
            WebElement randomOther = otherMenuList.get(random.nextInt(otherMenuList.size()));
            randomOther.click();
            TimeUnit.SECONDS.sleep(5);
        }



    }

    public void randomBrand() throws InterruptedException {
        WebElement marka = findElement(MARKA);
        List<WebElement> markaList = marka.findElements(MARKA_LIST);
        System.out.println("Marka sayısı: "+markaList.size());
        Random randomMarka = new Random();
        int getRandom = randomMarka.nextInt(markaList.size());
        WebElement randomElement = markaList.get(getRandom);
        randomElement.click();


    }


}
