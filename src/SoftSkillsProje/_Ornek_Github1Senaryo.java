package SoftSkillsProje;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _Ornek_Github1Senaryo extends BaseStaticDriver {

    public static void main(String[] args) {



                driver.get("https://campus.techno.study/");
                WebElement kullanıcıAdi=driver.findElement(By.id("mat-input-0"));
                kullanıcıAdi.sendKeys("makif_cetin@hotmail.com");

                WebElement password=driver.findElement(By.id("mat-input-1"));
                password.sendKeys("LexusDelta-82");
                password.sendKeys(Keys.ENTER);

                WebElement passwordd=driver.findElement(By.cssSelector("svg[class='svg-inline--fa fa-bars']"));
                Actions aksiyonlar=new Actions(driver);

                Action aksiyon=aksiyonlar.moveToElement(passwordd).build();
                aksiyon.perform();

                BekleKapat();

    }


}
