package Selenium7;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_isDisplayed extends BaseStaticDriver {

    public static void main(String[] args) {


        driver.get("https://www.facebook.com/");
        Bekle(2);
        WebElement cookiesAccept= driver.findElement(By.xpath("//*[test()='Allow essential and optional cookies"));
        cookiesAccept.click();

        Bekle(2);
        WebElement btnYeniHesap= driver.findElement(By.cssSelector("[id^='u_0_=_']"));
        btnYeniHesap.click();

        Bekle(2);
        WebElement txtIsim= driver.findElement(By.name("firstname"));
        txtIsim.sendKeys("ismet");
        Bekle(2);
        WebElement txtSoyisim= driver.findElement(By.name("lastname"));
        txtSoyisim.sendKeys("temur");



        WebElement reEmail= driver.findElement(By.name("reg_email_confirmation__"));
       // if(reEmail.isDisplayed()==true)
           // System.out.println("hatalı gösterim");


        Assert.assertFalse(reEmail.isDisplayed());

        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("ismet@hotmail.com");


        Assert.assertTrue(reEmail.isDisplayed());

        BekleKapat();



    }



}
