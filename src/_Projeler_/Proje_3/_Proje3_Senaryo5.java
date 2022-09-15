package _Projeler_.Proje_3;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _Proje3_Senaryo5 extends BaseStaticDriver {

    public static void main(String[] args) {

        driver.get("https://shopdemo.e-junkie.com/");

        Bekle(2);
        WebElement demoEbook=driver.findElement(By.xpath("//div[@class='thumbnail'and @style='background-image: url(https://s3.amazonaws.com/static.e-junkie.com/products/thumbnails/1595015.png); border-radius: 4px 4px 0px 0px;']"));
        demoEbook.click();

        WebElement sepeteEkle=driver.findElement(By.cssSelector("[class='g_btn']"));
        sepeteEkle.click();

        driver.switchTo().frame(driver.findElement(By.cssSelector("[class='EJIframeV3 EJOverlayV3']")));
        Bekle(2);
        WebElement paydebit=driver.findElement(By.cssSelector("[class=\"Payment-Button CC\"]"));
        paydebit.click();

        WebElement email=driver.findElement(By.cssSelector("[class=\"Billing-Email Inline MarginRight\"] [type='email']"));
        email.sendKeys("techno@elma.com");

        WebElement confirmemail=driver.findElement(By.cssSelector("[class=\"Billing-Email-Confirm Inline\"] [type=\"email\"]"));
        confirmemail.sendKeys("techno@elma.com");

        WebElement nameoncard=driver.findElement(By.cssSelector("[class=\"Billing-Name Inline MarginRight\"] [type=\"text\"]"));
        nameoncard.sendKeys("ali");
        WebElement phone=driver.findElement(By.cssSelector("[class=\"Billing-Phone Inline\"] [type=\"text\"]"));
        phone.sendKeys("05555555555");

        WebElement company=driver.findElement(By.cssSelector("[class=\"Billing-Company\"] [type='text']"));
        company.sendKeys("elmagyo");

        driver.switchTo().frame(2);

        WebElement cardNumber=driver.findElement(By.cssSelector("[class=\"CardNumberField CardNumberField--ltr\"] [class=\"InputElement is-empty Input Input--empty\"]"));
        cardNumber.sendKeys("4242 4242 4242 4242");

        WebElement expiration=driver.findElement(By.cssSelector("[class=\"CardField-expiry CardField-child\"] [class=\"InputElement is-empty Input Input--empty\"]"));
        expiration.sendKeys("1222");

        WebElement ccv=driver.findElement(By.cssSelector("[class=\"CardField-cvc CardField-child\"] [class=\"InputElement is-empty Input Input--empty\"]"));
        ccv.sendKeys("000");

        Bekle(2);
        driver.switchTo().parentFrame();
        WebElement pay=driver.findElement(By.cssSelector("[class=\"Pay-Button\"]"));
        pay.click();


        BekleKapat();

    }



}
