package SoftSkillsProje;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _Ornek_Github5Senaryo extends BaseStaticDriver {

    public static void main(String[] args) {

        driver.get("https://campus.techno.study/");


        WebElement userName=driver.findElement(By.id("mat-input-0"));
        userName.sendKeys("makif_cetin@hotmail.com");

        WebElement password= driver.findElement(By.cssSelector("[type='password']"));
        password.sendKeys("LexusDelta-82");


        WebElement login=driver.findElement(By.cssSelector("[class='mat-button-wrapper']"));
        login.click();


        WebElement HClick= driver.findElement(By.cssSelector("[class='svg-inline--fa fa-bars']"));
        HClick.click();
        Bekle(2);

       WebElement message= driver.findElement(By.cssSelector("[class='ng-fa-icon ng-star-inserted']"));
       Bekle(2);
       Actions aksiyonlar=new Actions(driver);


       Action aksiyon=aksiyonlar.moveToElement(message).build();
       aksiyon.perform();
       Bekle(1);

       WebElement newmessage= driver.findElement(By.cssSelector("#mat-menu-panel-8 > div > span:nth-child(1) > span > button"));
       newmessage.click();

       Bekle(5);
       BekleKapat();

    }

}
