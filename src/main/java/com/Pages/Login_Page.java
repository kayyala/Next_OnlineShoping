package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

/**
 * Created by Sudhakar on 06/10/2017.
 */
public class Login_Page extends BasePage {
    @FindBy(xpath = ".//*[@id='EmailOrAccountNumber']")
    WebElement Email_user;
    @FindBy(xpath = ".//*[@id='Password']")
    WebElement password;

    @FindBy(name = "SignInNow")
    WebElement Sign_in;

    public void Validuser(String UserName) {
        Email_user.sendKeys(UserName);
    }
    public void Validpassword(String Pass) throws IOException {
        password.sendKeys(Pass);

    }
    public void Login() throws IOException {
        Sign_in.click();
    }
}
