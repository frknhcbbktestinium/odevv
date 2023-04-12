package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.methods.Methods;
import com.kitapyurdu.page.HomePage;
import com.kitapyurdu.page.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest(){

        Methods methods = new Methods();
        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("login-email"), "f.hacibebek@gmail.com");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-password"), "1q2w3e4r5t");
        methods.waitBySeconds(1);
        methods.click(By.xpath("//button[@type='submit']"));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//h1[@class='section']")));
        methods.waitBySeconds(1);
    }

}
