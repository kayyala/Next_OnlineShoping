package com.Pages;

import Utils.BrowserFactory;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Sudhakar on 06/10/2017.
 */
public class BasePage extends BrowserFactory {
        public BasePage(){
        PageFactory.initElements(driver,this);
    }
}
