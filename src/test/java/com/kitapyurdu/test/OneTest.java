package com.kitapyurdu.test;
import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.methods.Methods;
import com.kitapyurdu.page.HomePage;
import com.kitapyurdu.page.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class OneTest extends BaseTest{
    @Test
    public void oneTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        Methods methods = new Methods();
        methods.click(By.xpath("/html/body/div[1]/div[3]/div/div[4]/div[1]/div[2]/h4"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("/html/body/div[1]/div[3]/div/div[4]/div[2]/div[2]/div[2]/div/a"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//input[@name='quantity']"));
        methods.waitBySeconds(3);
        driver.findElement(By.xpath("//tbody//tr//td[@class='quantity']//input")).clear();
        methods.waitBySeconds(3);
        methods.sendKeys(By.xpath("//input[@name='quantity']"), "6");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//i[@class='fa fa-refresh green-icon']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//div[@class='right']/a[contains(.,'Satın Al')]"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[.='Yeni bir adres kullanmak istiyorum.']"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//input[@id='address-firstname-companyname']"), "Furkan");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//input[@id='address-lastname-title']"), "Hacibebekoglu");
        methods.waitBySeconds(2);
        methods.selectByText(By.xpath("//select[@id='address-zone-id']"), "İstanbul");
        methods.waitBySeconds(2);
        methods.selectByText(By.xpath("//select[@id='address-county-id']"), "Kartal");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//input[@id='district']"), "Kucukyali Mh.");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//textarea[@id='address-address-text']"), "Sair Sk. Bayrakci Apt.");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//input[@id='address-mobile-telephone']"), "5314918018");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//button[@id='button-checkout-continue']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//button[@id='button-checkout-continue']"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//input[@id='credit-card-owner']"), "Furkan Hacibebekoglu");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//table[@class='form']//tr[5]//input[1]"), "1234");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//input[2]"), "4329");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//input[3]"), "2002");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//input[4]"), "7735");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//table[@class='form']//tr[5]//input[1]"), "4444");
        methods.waitBySeconds(2);
        methods.selectByText(By.xpath("//select[@id='credit-card-expire-date-month']"), "01");
        methods.waitBySeconds(2);
        methods.selectByText(By.xpath("//select[@id='credit-card-expire-date-year']"), "2023");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//input[@id='credit-card-security-code']"), "123");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//button[@id='button-checkout-continue']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//img[@alt='kitapyurdu.com']"));
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.xpath("//b[.='furkan hacibebekoglu']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/ul/li/div/ul/li[4]/a"));
        methods.waitBySeconds(2);
    }
    @Test
    public void hobbyTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        Methods methods = new Methods();
        methods.click(By.xpath("/html/body/div[1]/div[4]/div[1]/ul/li[1]/div[2]/ul/li[3]/span"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//html/body/div[1]/div[4]/div[1]/ul/li[1]/div[2]/ul/li[3]/div/div[1]/div/ul[2]/li[14]/a"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//img[@src='https://img.kitapyurdu.com/v1/getImage/fn:62170/wi:100/wh:true']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//span[.='Sepete Ekle']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("/html/body/div[1]/div[2]/div/div[2]/ul/li[1]/div/ul/li/a"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("/html/body/div[1]/div[2]/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//span[@class='sprite sprite-icon-list']"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.xpath("//img[@src='https://img.kitapyurdu.com/v1/getImage/fn:11244290/wi:100/wh:true']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//div[@class='product-list']/div[3]//i[@class='fa fa-heart-o']"));
        methods.waitBySeconds(2);
    }
    @Test
    public void homeTest(){
        HomePage homePage = new HomePage();
        homePage.home();
    }

    @Test
    public void productTest(){

        LoginPage loginPage = new LoginPage();
        loginPage.login();

        Methods methods = new Methods();
        methods.sendKeys(By.id("search-input"),"Oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(1);
        methods.scrollWithAction(By.xpath("//a[.='Emre ve Tahta Oyuncak']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@id='product-table']/div[7]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@id='product-table']/div[6]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@id='product-table']/div[5]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@id='product-table']/div[4]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@id='product-table']/div[7]//i[@class='fa fa-heart red']")));
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@id='product-table']/div[6]//i[@class='fa fa-heart red']")));
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@id='product-table']/div[5]//i[@class='fa fa-heart red']")));
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@id='product-table']/div[4]//i[@class='fa fa-heart red']")));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//img[@src='https://img.kitapyurdu.com/v1/getImage/fn:11682843/wh:d8e078ec3']"));
        methods.waitBySeconds(5);
    }
    @Test
    public void ratingTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        Methods methods = new Methods();
        methods.click(By.xpath("//img[@src='https://img.kitapyurdu.com/v1/getImage/fn:11682843/wh:d8e078ec3']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//div[@class='lvl1catalog']/a[.='Puan Kataloğu']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//img[@src='https://img.kitapyurdu.com/v1/getImage/fn:4359433/wh:14a4e2d16']"));
        methods.waitBySeconds(3);
        methods.selectByText(By.xpath("//div[@class='sort']/select[1]"),"Yüksek Oylama");
        methods.waitBySeconds(2);

    }
}
