package Selenium8;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionTusKontrolSendKeys extends BaseStaticDriver {

    public static void main(String[] args) {

        driver.get("https://demoqa.com/auto-complete");

        WebElement element= driver.findElement(By.id("autoCompleteSingleInput"));


        Actions aksiyonlar=new Actions(driver);

        Action  aksiyon=aksiyonlar
                .moveToElement(element)//KUTUCUGA GİTTİM
                .click()//içine tıklattım
                .keyDown(Keys.SHIFT)//shıft tusuna bastım
                .sendKeys("a")//küçük a harfini gönderdim fakat shift basılı oldugu için A görülmeli
                .keyUp(Keys.SHIFT)//shıf tusunda elimizi kaldırıyoruz
                .sendKeys("hmet")//kalanı küçük harf
                .build();
        Bekle(2);
        aksiyon.perform();


        Bekle(3);
        BekleKapat();
    }


}
