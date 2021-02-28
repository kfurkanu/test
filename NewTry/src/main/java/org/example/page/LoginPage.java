package org.example.page;

import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.example.constants.LoginPageConstants.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPage extends BasePage {




    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage moveToLogIn(){
        hoverThenClick(MOVE,LOG_IN);
        //hoverElement(MOVE);
        return this;
    }
    public LoginPage clickLogIn(){
        click(LOG_IN);
        return this;
    }

    public LoginPage sendEmail(){
        sendKeys(EMAIL_AREA,"kfurkanulus@gmail.com");
        return this;
    }

    public LoginPage sendPassword(){
        sendKeys(PASSWORD_AREA,"4050kfu");
        return this;
    }

    public LoginPage SubmitButton(){
        click(CLICK_BUTTON_LOGIN);
        return this;
    }

    public LoginPage search(){
        hoverThenClick(SEARCH_AREA,SEARCH_AREA);

        sendKeys(SEARCH_AREA,"bilgisayar");
        return this;
    }

    public LoginPage clickButton(){
        click(CLICK_BUTTON);
        return this;
    }

    public LoginPage clickSearch(){
        click(SEARCH_AREA);
        return this;
    }
    public LoginPage ClickPage(){
        click(CLICK_PAGE_BUTTON);
        return this;
    }


}
