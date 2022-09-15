package Selenium10;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BaseStaticDriver {

    public static void main(String[] args) {

     driver.get("https://chercher.tech/practice/frames");



        driver.switchTo().frame(0);//frame 1


        WebElement input= driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Türkiye");

        driver.switchTo().parentFrame();//geldiğin yere geri dön =(bir basamak geri git anlamı tasıyor.)
        driver.switchTo().defaultContent();// ilk anasayfaya direk geri dön





     BekleKapat();
    }



}
