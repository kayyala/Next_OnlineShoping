package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Sudhakar on 06/10/2017.
 */
public class RegistrationPage extends BasePage {

    @FindBy(xpath = ".//*[@id='sec']/div/a")
    WebElement Continue_bt;
    @FindBy(xpath = ".//*[@id='Email']")
    WebElement Email;

    @FindBy(xpath = ".//*[@id='Password']")
    WebElement Password;
    @FindBy(xpath = ".//*[@id='Title']")
    WebElement Titlle;
    @FindBy(xpath = ".//*[@id='FirstName']")
    WebElement FistName;
    @FindBy(xpath = ".//*[@id='LastName']")
    WebElement LastName;
    @FindBy(xpath = ".//*[@id='DobDay']")
    WebElement Day;
    @FindBy(xpath = ".//*[@id='DobMonth']")
    WebElement Month;
    @FindBy(xpath = ".//*[@id='DobYear']")
    WebElement Year;
    @FindBy(xpath = ".//*[@id='PhoneNumber']")
    WebElement ContactNo;
    @FindBy(xpath = ".//*[@id='pri']/div/form/div[2]/input")
    WebElement Continue1;
    @FindBy(xpath = ".//*[@id='HouseNumberOrName']")
    WebElement HouseNo;
    @FindBy(xpath = ".//*[@id='Postcode']")
    WebElement PostCode;
    @FindBy(xpath = ".//*[@id='pri']/div/div[3]/form/div[3]/input")
    WebElement Continue2;
    @FindBy(xpath = ".//*[@id='AddressListSelection']") WebElement SelectAddress;
    @FindBy(xpath = ".//*[@id='pri']/div/div[3]/form/div[2]/input") WebElement Continue3;
    @FindBy(xpath = ".//*[@id='prefs']/div[3]/div[1]/span")WebElement Radio_bt;
    @FindBy(xpath = ".//*[@id='prefs']/div[6]/div/span")WebElement Check_Box;
    @FindBy(xpath = ".//*[@id='pri']/div/div[3]/form/div[2]/input")WebElement Continue4;
    @FindBy(xpath = ".//*[@id='pri']/div/div[3]/form/div[2]/input")WebElement No_Thanks;

}
