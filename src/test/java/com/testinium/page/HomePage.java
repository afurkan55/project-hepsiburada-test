package com.testinium.page;

import com.testinium.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static com.testinium.constants.ConstantLoginPage.*;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage homePage()
    {
     getDriver().get("https://www.hepsiburada.com");
     return getLoginPage();
    }


    public void wakeUpChrome() throws InterruptedException {


        getDriver().navigate().back();

        String getText = getText(By.className("Q8LRLc"));

        System.out.println("TEXT: " + getText);

        clickElement(By.cssSelector("a[data-pid='23']"));
    }

    public void sendKeysTest() throws InterruptedException {
        //Assert.assertTrue("Element bulundu!!!", isElementDisplayed(SEARCH_BOX));
        getDriver().navigate().to("https://www.google.com.tr");

    }

    public void webElementTest() throws InterruptedException {


        //element.clear();
    }

    public void findElementsTest() throws InterruptedException {
        List<WebElement> elements = findElements(By.cssSelector("div.gb_qe div a"));
        TimeUnit.SECONDS.sleep(2);
        elements.get(0).click();
        String pageSource = getDriver().getPageSource();
        System.out.println("PAGE SOURCE: " + pageSource);
    }

    public void selectTest() throws InterruptedException {
        getDriver().navigate().to("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

       // selectOptionByValue(SELECT_DATE, "Tuesday");

        TimeUnit.SECONDS.sleep(2);

        Select multiSelect = new Select(getDriver().findElement(By.id("multi-select")));
        multiSelect.isMultiple();
        multiSelect.selectByValue("New York");

        TimeUnit.SECONDS.sleep(2);

        clickElement(By.id("printMe"));
    }

    public void actionsTest() throws InterruptedException {
        getDriver().navigate().to("https://www.hepsiburada.com/");

        hoverElement(HESABIM);

        TimeUnit.SECONDS.sleep(3);
    }

    public void switchToTest() throws InterruptedException {
        getDriver().navigate().to("https://www.w3schools.com/tags/tag_frame.asp");
        clickElement(By.cssSelector("a[href='tryit.asp?filename=tryhtml_iframe']"));

        TimeUnit.SECONDS.sleep(2);

        // Current window'u aldım.
        String currentWindow = getDriver().getWindowHandle();
        // Tüm windowları aldım.
        Set<String> allWindows = getDriver().getWindowHandles();
        // Windowlar arası gezip.
        for (String selectWindow : allWindows) {
            // Benim ilk window'um olmayanı seçtim.
            if (!selectWindow.equals(currentWindow)) {
                getDriver().switchTo().window(selectWindow);
            }
        }
        clickElement(By.cssSelector("a[onclick='click_savebtn()']"));
        getDriver().close();
        getDriver().switchTo().window(currentWindow);

        clickElement(By.cssSelector("#main div.w3-center a.w3-right"));
    }

}
