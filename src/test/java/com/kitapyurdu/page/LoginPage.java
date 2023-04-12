
package com.kitapyurdu.page;
import com.kitapyurdu.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.security.PublicKey;

public class LoginPage {
    Methods methods;
    public LoginPage(){ methods = new Methods();}
    public void login(){
        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id='js-popup-accept-button']"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("login-email"), "f.hacibebek@gmail.com");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-password"), "1q2w3e4r5t");
        methods.waitBySeconds(1);
        methods.click(By.xpath("//button[@type='submit']"));
        methods.waitBySeconds(10);

    }
}
