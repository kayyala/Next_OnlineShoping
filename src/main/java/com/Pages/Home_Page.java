package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Sudhakar on 05/10/2017.
 */
public class Home_Page extends BasePage {

    @FindBy(xpath = "html/body/header/div/section/section[2]/ul/li[1]/a")
    WebElement myaccount;
    @FindBy(xpath = "html/body/header/div/section/section[2]/ul/div/span[2]/a")

    WebElement Logout;
    @FindBy(xpath = "html/body/header/div/section/section[2]/ul/li[1]/a")
    WebElement Verifying_Account;

    public String isInHome_page() {
        return driver.getCurrentUrl();
    }

    public void goMyaccount() {
        myaccount.click();
    }

    public void LogoutAc() {
        myaccount.click();
        Logout.click();
    }
//    public static WebElement waitForElementToBeClickable(WebElement ElementToBeClickable) {
//        return wait.until(ExpectedConditions.elementToBeClickable(ElementToBeClickable));
    public String isInMyAc_Page()  {
        System.out.println("checking ac name----"+Verifying_Account.getText());
        return Verifying_Account.getText();

    }
}
