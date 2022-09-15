package Selenium12;

import Utils.BaseStaticDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _02_EkranKaydetme extends BaseStaticDriver {
    public static void main(String[] args) throws IOException {


        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username= driver.findElement(By.id("txtUsername"));
        username.sendKeys("ismet");

        WebElement password=driver.findElement(By.id("txtPassword"));
        password.sendKeys("mmmmm");
        WebElement btnLogin=driver.findElement(By.id("btnLogin"));
        btnLogin.click();

        List<WebElement>spanMessage=driver.findElements(By.id("spanMessage"));
        if(spanMessage.size()>0){//login olunmadı ekran görüntüsünü saklama
        //hata ekranının screenshot  ını alalım.

         System.out.println("login olmadı.Hata mesajı gözüktü");

         //ekran görüntüsü alalım.

            TakesScreenshot ts=(TakesScreenshot)  driver;//1. aşama ekran görüntüsünü alma değişkenini tanımladık.
            File hafizadakiHali=ts.getScreenshotAs(OutputType.FILE);//2. AŞAMA SAKLAMA TİPİ SEÇİLDİ (DOSYA), data (veritabanı)(Byte)
          //hafızada ki hali -> dosya olarak (jpg,png,bmp)kaydedeceğiz.


            FileUtils.copyFile(hafizadakiHali, new File("ekranGoruntuleri/LogınKontrol.png"));

            //hafızadaki ekran dosyasını al bunu verdiğim yola isme kaydet.
            //jpg,bmp,gif

            //toDo :ödev buradaki dosya adını zamana bağlı hale getiriniz. ki hep üstüne kaydetmesin.
            //örnek 20102227777,jpg gibi


        }
        BekleKapat();
    }

}
