package org.example;

import org.example.page.LoginPage;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class LoginPageTest extends BaseTest {


    LoginPage loginPage;



    @Before
    public void before(){
        loginPage = new LoginPage(getWebDriver());
    }

    @Test
    public void test(){

       loginPage.moveToLogIn().sendEmail().sendPassword().SubmitButton().search().clickButton().ClickPage();

    }

    @After
    public void after(){
        //tearDown();
    }
}
