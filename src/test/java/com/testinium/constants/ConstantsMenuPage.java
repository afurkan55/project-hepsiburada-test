package com.testinium.constants;

import org.openqa.selenium.By;

public class ConstantsMenuPage extends ConstantMainPage
{
    public static final By MENU= By.cssSelector(".MenuItems-1-U3X");
    public static final By MENU_ELEKTRONIK=By.xpath("//li/div/div/div/div/ul/li/a");
    public static final By MENU_OTHER=By.cssSelector(".ChildMenuItems-1Mjr0");
    public static final By MARKA=By.xpath("//li[@class='box-container brand']");
    public static final By MARKA_LIST=By.xpath(" //label[contains(@for,'brand')]");

}
