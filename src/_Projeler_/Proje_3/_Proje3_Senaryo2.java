package _Projeler_.Proje_3;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _Proje3_Senaryo2 extends BaseStaticDriver {

    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");


                Bekle(2);
        WebElement demoEbook=driver.findElement(By.xpath("//div[@class='thumbnail'and @style='background-image: url(https://s3.amazonaws.com/static.e-junkie.com/products/thumbnails/1597355.png); border-radius: 4px 4px 0px 0px;']"));
        demoEbook.click();

        WebElement sepeteEkle=driver.findElement(By.cssSelector("[class='g_btn']"));
        sepeteEkle.click();


        Bekle(2);
        driver.switchTo().frame(driver.findElement(By.cssSelector("[class='EJIframeV3 EJOverlayV3']")));
        WebElement promosyonEkle=driver.findElement(By.xpath("//button[@class='Apply-Button Show-Promo-Code-Button']"));
        promosyonEkle.click();

        Bekle(2);
        WebElement promoCode=driver.findElement(By.cssSelector("[class='Promo-Code-Value']"));
        promoCode.sendKeys("123456789");
        Bekle(2);
        WebElement uygulaBtn=driver.findElement(By.cssSelector("[class='Promo-Apply']"));
        uygulaBtn.click();

//        WebElement assertOne=driver.findElement(By.cssSelector("[class='Close-SnackBar md hydrated']+span"));
        WebElement assertOne=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='Close-SnackBar md hydrated']+span")));
        Assert.assertTrue(assertOne.getText().contains("Invalid promo code"));


        BekleKapat();


    }


}
